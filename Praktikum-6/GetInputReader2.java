import java.io.*;

public class GetInputReader2{
    public static void main( String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamRader(System.in));

        String nim ="", nama="", tempat="", tgllahir="";
        System.out.print("Masukkan Nama Anda : ");
            nama = dataIn.readLine();
        System.out.print("Masukkan NIM Anda : ");
            nim = dataIn.readline();
        System.out.print("Masukkan Tempat Lahir Anda : ");
            tempat = dataIn.readLine();
        System.out.println("Masukkan Tanggal Lahir Anda : ");
            tgllahir = dataIn.readLine();

        System.out.println("");
        System.out.pritnln("-----------------------------");
        System.out.println("-----------------------------");

        System.out.println("Selamat datang " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Tempat Lahir    : " + tempat);
        System.out.println("Tanggal Lahir   : " + tgllahir);
    }
}