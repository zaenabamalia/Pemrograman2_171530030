import javax.swing.JOptionPane;

public class InputJOptionPane{

    public static void main(String[] args) {

        String nim, nama, tempat, tgllahir;
            nim = JOptionPane.showInputDialog("Masukkan NIM : ");
            nama = JOptionPane.showInputDialog("Masukkan Nama : ");
            tempat = JOPtionPane.showInputDialog("Masukkan Tempat Lahir");
            tgllahir = JOptionPane.showInputDialog("Masukkan Tanggal Lahir");

            JOptionPane.showMessageDialog(null, "<== Data Diri ==>\n"
            + nim + "\n"
            + nama + "\n"
            + tempat + "\n"
            + tgllahir + "\n");
    }
}