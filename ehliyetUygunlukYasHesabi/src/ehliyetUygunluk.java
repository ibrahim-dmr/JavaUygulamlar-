import java.util.Scanner;

public class ehliyetUygunluk {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        int i=input.nextInt();
            if (i>=18){
                System.out.println("Ehliyete başvuru için yaşınız uygun");
            }
            else{
                System.out.println("Ehliyete başvuru için yaşınız uygun değil");
            }
    }

}
