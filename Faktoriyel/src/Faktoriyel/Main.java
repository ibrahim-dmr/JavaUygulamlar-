
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    System.out.println("Faktöriyeli hesaplanacak sayıyı giriniz:");
        Scanner sc=new Scanner(System.in);
        int sayi=sc.nextInt();
    int sonuc=1;
    for (int i=1; i<=sayi; i++){
        sonuc=sonuc*i;
    }
    System.out.println("İşlem sonucu:"+sonuc);
    }
}
