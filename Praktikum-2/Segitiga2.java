import java.util.*;
public class Segitiga2{
    public static void main(String[] args){
        int alas,tinggi;
        Scanner input = new Scanner(System.in);
        System.out.println("===Program Luas Segitiga===");
        System.out.println("\n\nMasukkan alas\t: ");
        alas = input.nextInt();
        System.out.println("\n\nMasukkan tinggi");
        tinggi = input.nextInt();
        float total = alas*tinggi/2F;
        System.out.println("\n\nLuas Segitiga adalah "+total);
    }
}