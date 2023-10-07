import javax.swing.JOptionPane;

public class BiayaPengiriman 
{
    public static void main(String[] args) {
          
          // meminta input berat barang dan memparse/ekstrasi/mengubah data dari tipe data string ke double
          String BeratBarangStr = JOptionPane.showInputDialog("Masukkan Berat Barang (Kilogram) :");
          double BeratBarang = Double.parseDouble(BeratBarangStr);
          
          // meminta input jumlah jarak/jarak pengiriman dan memparse/ekstrasi/mengubah data dari tipe data string ke double
          String JumlahJarakStr = JOptionPane.showInputDialog("Masukkan Jarak Pengiriman (Kilometer) :");
          double JumlahJarak = Double.parseDouble(JumlahJarakStr);
          
          // metode nested if atau perkondisian, disini kita mengatur logic yang sesuai dengan permasalahan/kondisi yang ada
          double BiayaPengiriman;
          
          if (BeratBarang <= 1) {
            BiayaPengiriman = 5000;
          } else {
            BiayaPengiriman = 10000;
          }

          if (JumlahJarak <= 10) {
            BiayaPengiriman += 2000;
          } else {
            BiayaPengiriman += 5000;
          }
          
        // menampilkan hasil dari biaya pengiriman
        JOptionPane.showMessageDialog(null,"Biaya pengiriman adalah: " + BiayaPengiriman + " rupiah");
    }    
}
