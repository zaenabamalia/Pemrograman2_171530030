public class DemoContinueLoop{

    public static void main(String[] args){
        int a, b;
        for(a=0;a<2;a++)
            for(b=0;b<3;b++){
                if (b==1)
                    continue;
                system.out.println("a="+ a+ "; b=" +b);
            }
    }
}