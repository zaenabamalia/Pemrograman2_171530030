public class DemoKondisi{
    public static void min (String[] args){
        String status = "";
        int grade = 80;

        //mendpat status pelajar
        status = (grade >= 60)?"Passed":"Fail";
        //print status
        System.out.println(status);
    }
}