import java.util.*;
public class Lingkaran2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double phi = 3.14;
        double r,luas;

        System.out.println("===Program Luas Lingkaran\n");
        System.out.println("Masukkan Panjang Jari-jari:");
        r=input.nextDouble();

        luas = 0.5*phi*r*r;

        System.out.println("Luas Lingkaran ="+(int)luas);
    }
}