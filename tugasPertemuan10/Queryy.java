package tugasPertemuan10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Queryy {

    private Connection con;

    public Queryy() {
        try {
            // Pastikan JDBC driver sesuai dengan database Anda
            String url = "jdbc:mysql://localhost/mahasiswa"; // Ganti dengan URL database Anda
            String username = "root"; // Ganti dengan username database Anda
            String password = ""; // Ganti dengan password database Anda

            con = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }

    public void delete(String NIM) {
        try {
            PreparedStatement pst = null;
            String sql = "DELETE FROM mahasiswa.identitas WHERE nim = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, NIM);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void insert(String NIM, String Nama, String Alamat, String Gender) {
        // Query INSERT
        String insertQuery = "INSERT INTO IDENTITAS (NIM, Nama, Alamat, Gender) VALUES (?, ?, ?, ?)";

        try {
            // Memastikan koneksi tidak null
            if (con != null) {
                // Membuat PreparedStatement
                PreparedStatement preparedStatement = con.prepareStatement(insertQuery);

                // Mengisi parameter pada query
                preparedStatement.setString(1, NIM); // Untuk nim (string)
                preparedStatement.setString(2, Nama); // Untuk nama (string)
                preparedStatement.setString(3, Alamat); // Untuk alamat (string)
                preparedStatement.setString(4, Gender); // Untuk jenis kelamin (string)

                // Menjalankan query INSERT
                int rowsInserted = preparedStatement.executeUpdate();

                // Menampilkan hasil
                if (rowsInserted > 0) {
                    System.out.println("Data berhasil dimasukkan!");
                } else {
                    System.out.println("Data gagal dimasukkan.");
                }
            } else {
                System.out.println("Koneksi tidak tersedia.");
            }

        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan saat menginsert data: " + e.getMessage());
        }
    }

    public void update(String NIM, String Nama, String Alamat, String Gender) {
        try {
            PreparedStatement pst = null;
            String sql = "UPDATE mahasiswa.identitas SET nama = ?, alamat = ?, gender = ? WHERE nim = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, Nama);
            pst.setString(2, Alamat);
            pst.setString(3, Gender);
            pst.setString(4, NIM);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
