public class DemoSwitch{
    public static void main(String[] args){
        int grade = 80;
        switch(grade){
        case 100:
            System.out.println("Exelent!");
            break;
        case 90:
            System.out.println("Good job!");
            break;
        default:
            System.out.println("Sorry, you failed.");
        }
    }
}