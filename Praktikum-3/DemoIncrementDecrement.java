public class DemoIncrementDecrement{
    public static void main(String[] args) {
        int x=1, y=1, z=1;

        //nilai awal
        System.out.println("Nilai x : " +x);
        System.out.println("Nilai y : " +y);
        System.out.println("Nilai z : " +z);

        System.out.println("Nilai y : " + y);

        //increment
        x++; y++;
        System.out.println("\nNilai x : " + x);
        System.out.println("Nilai y : " + y++);
        System.out.println("Nilai z : " + ++z);

        System.out.println("Nilai y : "+y);

        //decrement
        x--; y--;
        System.out.println("\nNilai x : " + x);
        System.out.println("Nilai y : " + y--);
        System.out.println("Nilai z : " + --z);

        System.out.println("Nili y : " + y);
    }
}