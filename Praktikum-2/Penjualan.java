public class Penjualan{
    public static void main(String[] args){

        int coklat=3;
        float c=coklat;
        int energen=5;
        float e=energen;
        int permen=10;
        float p=permen;
        int sarimi=2;
        float s=sarimi;
        int kopi=2;
        float k=kopi;

        double uang=50000;
        float u=(float) uang;
        System.out.println("===PROGRAM MENGHITUNG TOTAL PENJUALAN===");
        System.out.println("Daftar Barang yang Terjual");
        System.out.println("1.  Coklat\t:3000 x 3");
        System.out.println("2.  Energen\t:1500 x 5");
        System.out.println("3.  Permen\t:500 x 10");
        System.out.println("4.  Sarimi\t:2500 x 2");
        System.out.println("5.  Kopi\t:1500 x 2");

        float b=(c*3000F)+(e*1500F)+(p*500F)+(s*2500F)+(k*1500F);
        System.out.println("Total pembayaran adalah\t: "+b);

        System.out.println("Uang yang dibayarkan\t: "+u);

        float kembalian= u-b;
        System.out.println("Kembalianya sebesar     : "+kembalian);



       
    }
}