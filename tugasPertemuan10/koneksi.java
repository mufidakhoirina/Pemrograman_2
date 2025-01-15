package tugasPertemuan10;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    
    public static void main(String[] args) {
     koneksi tesKoneksi = new koneksi ();
     tesKoneksi.Koneksi();
    }
   String StatusKoneksi ;
   Connection con = null;
    public void Koneksi(){
      
     try
        {
            String connectionURL = "jdbc:mysql://localhost/mahasiswa";
            String username = "root";
            String password = "";
            
           con = DriverManager.getConnection(connectionURL, username, password);
          JOptionPane.showMessageDialog(null, "Sukses Koneksi");
          StatusKoneksi = "Berhasil";
} catch (SQLException ex) {
              StatusKoneksi = "Berhasil";
}
}
}
