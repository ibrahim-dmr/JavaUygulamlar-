import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sayi1, sayi2, secim;
        System.out.println("Birinci sayıyı giriniz:");
        sayi1=sc.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        sayi2=sc.nextInt();
        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");
        System.out.println("Yapmak istediğiniz işlemi seçiniz");
        secim=sc.nextInt();
            if (secim==1){
                System.out.println("Sonuç="+ (sayi1+sayi2));
            } else if(secim==2){
                System.out.println("Sonuç="+(sayi1-sayi2));
            } else if(secim==3){
                System.out.println("Sonuç="+(sayi1*sayi2));
            } else if(secim==4){
                if(sayi2==0){
                    System.out.println("Payda sıfır olduğundan işlem sonucu belirsizdir.");}else{
                    System.out.println("Sonuç="+(sayi1/sayi2)); } } else{
                System.out.println("Geçersiz işlem");
            }  }   }
