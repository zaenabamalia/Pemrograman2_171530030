import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//bisa diringkas java.io*

public class InputNilai{
    public static void main(String [] args){
        
        //deklarasi variabel
        String nim;
        String nama_mhs;
        String matakuliah;
        float nilai_lain2 = 0;
        float nilai_uts = 0;
        float nilai_uas = 0;
        float nilai_akhir;

        //  deklarasi objek BufferedReader dengan nma variabelnya datainput
        BufferedReader dataInput = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Masukkan NIM");
        try{
            nim = dataInput.readLine();
        }catch(IOException ex){
            System.out.println("Error " + ex);
        }

        System.out.println("Masukkan Nama Mahasiswa");
        try{
            nama_mhs = dataInput.readLine();
        }catch(IOException ex){
            System.out.println("Error " + ex);
        }

        System.out.println("Masukkan Nama Mata kuliah");
        try{
            matakuliah = dataInput.readLine();
        }catch(IOException ex){
            System.out.println("Error " + ex);
        }

        System.out.println("Masukkan Nilai Lain2 : ");
        try{
            nilai_lain2 = Float.parseFloat(dataInput.readLine());
        }catch(IOException ex){
            System.out.println("Error " + ex);
        }

        System.out.println("Masukkan Nilai UTS : ");
        try{
            nilai_uts = Float.parseFloat(dataInput.readLine());
        }catch(IOException ex){
            System.out.println("Error " + ex);
        }

        System.out.println("Masukkan Nilai UAS : ");
        try{
            nilai_uas = Float.parseFloat(dataInput.readLine());
        }catch(IOException ex){
            System.out.println("Error " + ex);
        }

        //nilai akhir = (40%N.L) + ()
        nilai_akhir = (0.4F * nilai_lain2) + (0.3F * nilai_uts) + (0.3F * nilai_uas);
        System.out.println("NA : " + nilai_akhir);

        if(nilai_akhir>=80){
            System.out.println("Grade A");
        }else if(nilai_akhir>=76 && nilai_akhir<=79){
            System.out.println("Grade AB");
        }else if(nilai_akhir>=71 && nilai_akhir<=75){
            System.out.println("Grade B");
        }else if(nilai_akhir>=66 && nilai_akhir<=70){
            System.out.println("Grade BC");
        }else if(nilai_akhir>=61 && nilai_akhir<=65){
            System.out.println("Grade C");
        }else if(nilai_akhir>=56 && nilai_akhir<=60){
            System.out.println("Grade CD");
        }else if(nilai_akhir>=51 && nilai_akhir<=55){
            System.out.println("Grade D");
        }else if(nilai_akhir<=50){
            System.out.println("Grade E");
        }


    }

}