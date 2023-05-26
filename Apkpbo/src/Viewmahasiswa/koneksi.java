
package Viewmahasiswa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost/data_mahasiswa";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                JOptionPane.showMessageDialog(null, "Koneksi Database Berhasil", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException t) {
                JOptionPane.showMessageDialog(null, "Koneksi Error", "Perhatian", JOptionPane.ERROR_MESSAGE);
            }
        }
        return koneksi;
    }
}
