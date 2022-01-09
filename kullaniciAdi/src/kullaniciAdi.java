import java.util.Scanner;
public class kullaniciAdi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String kAdi,sifre;
        System.out.print("Kullanıcı adınızı giriniz:");
        kAdi=sc.nextLine();
        System.out.print("Şifrenizi giriniz:");
        sifre=sc.nextLine();
            if (kAdi.equals("java")&& sifre.equals("183881")){
                System.out.println("Başarılı bir şekilde giriş yaptınız!");
        } else{
                System.out.println("Kullanıcı adı veya şifre hatalı!");
        }
    }
}


