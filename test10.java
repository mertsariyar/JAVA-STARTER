import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        String userName, password; 

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("mertsariyar") && password.equals("mrtalisryr123")) {
            System.out.println("Giriş yaptınız! : ");
        }
        else {
            System.out.println("Bilgileriniz Yanlış!");
        }

    }
}
