import java.io.IOException;
import java.util.Scanner;

public class geziProgramıSecimi {
    public static void main(String[] args) throws IOException {

        Scanner giris=new Scanner(System.in);
        int i;
        System.out.println("DMR Turizm A.Ş. Sunar");
        System.out.println("(1) Orta avrupa turu");
        System.out.println("(2) Amerika Turu");
        System.out.println("(3) Uzak Doğu Turu");
        System.out.println("Seçiminiz?");
        i=giris.nextInt();
        switch (i){
            case 1:
                System.out.println("Uçak ile Viyana, Budapeşte, Prag");
                System.out.println("4 yıldızlı otellerde şok! 1700$ \n ");
                break;
            case 2:
                System.out.println("Özel uçak ile New York, Boston, Los Angeles");
                System.out.println("5 yıldızlı otellerde şok! 3700$ \n");
                break;
            case 3:
                System.out.println("Özel uçak ile Bang kong, Hong kong");
                System.out.println("Tokyo, Pekin");
                System.out.println("5yıldızlı otellerde şok! 4000$ \n");
                break;
            default:
                System.out.println("Hatalı seçim! 1,2 ya da 3'ü seçiniz");
                break;

        }
    }
}