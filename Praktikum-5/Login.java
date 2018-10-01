import java.io.*;
public class Login{
    public static void main(String[] args){
        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));

        String id_user, pass;
        boolean status= true;

        do{

            System.out.println("Masukkan ID. User : ");
            id_user = dataInput.readLine();

            System.out.println("Masukkan Password : ");
            pass = dataInput.readLine();

            if(!id_user.equals("171530030")){
                System.out.println("ID. User yang anda masukkan salah");
            }else{
                if(!pass.equals("mahasiswa123")){
                    System.out.println("Password yang anda masukkan salah");
                }else{
                    status = false;
                }
            }
            
        }while(status);
        System.out.println("Selamat Datang : "+ id_user);
    }
}
