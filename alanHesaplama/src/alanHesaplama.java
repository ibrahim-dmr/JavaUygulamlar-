import java.util.Scanner;
public class alanHesaplama {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Double i, uzunluk, yukseklik, pi, r;
        System.out.println("(1) Kare alanı hesaplama");
        System.out.println("(2) Üçgen alanı hesaplama");
        System.out.println("(3) Çember alanı hesaplama");
        System.out.print("Seçiminiz: ");
        i=sc.nextDouble();
        if (i == 1) {
            System.out.println("Kenar uzunluğunu giriniz: ");
            uzunluk = sc.nextDouble();
            System.out.println("Alan= " + uzunluk * uzunluk);
        } else if (i == 2) {
            System.out.println("yükseklik değerini giriniz: ");
            yukseklik = sc.nextDouble();
            System.out.println("taban uzunluğunu giriniz: ");
            uzunluk = sc.nextDouble();
            System.out.println("Alan= " + (yukseklik * uzunluk) / 2);   } else if (i == 3) {
            System.out.println("Çember yarıçapını giriniz: ");
            r = sc.nextDouble();
            pi=3.14;
            pi = sc.nextDouble();
            System.out.println("Alan= " + pi*r*r);   } else {
            System.out.println("Hatalı seçim!");
        }  }  }
