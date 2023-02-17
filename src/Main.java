import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName , password;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz:");
        userName=input.nextLine();

        System.out.println("Şifrenizi giriniz:");
        password=input.nextLine();

        if(userName.equals("Patika") && password.equals("java123")){
            System.out.println("Başarı ile giriş yaptınız.");
        }else {
            System.out.println("Kullanıcı adı veya şifrenizi yanlış girdiniz.");
        }
    }
}