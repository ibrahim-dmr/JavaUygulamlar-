import java.util.Scanner;
public class ucakBiletiHesaplama {
    public static void main(String[] args) {
        // Km birim fiyatı=0.10$
        //12 yaşından küçükse toplam fiyata %50 indirim // 12-24 yaş %10 indirim
        // +65 %20 indirim // Gidiş dönüş alırsa %20 indirim // Bu koşullara göre bilet fiyatı hesaplanacaktır.
        Scanner sc = new Scanner(System.in);
        int km, yas, tip;
        System.out.print("Mesafeyi km cinsinden giriniz:");
        km = sc.nextInt();
        System.out.print("Yaşınızı giriniz");
        yas = sc.nextInt();
        System.out.print("Yolculuk tipini seçiniz: (1=Tek yön, 2=Gidiş-Dönüş)");
        tip = sc.nextInt();
        double fiyat, yasIndirimi, tipIndirimi;
        fiyat = km * 0.10;  if (yas < 12) {
            yasIndirimi = fiyat * 0.5;
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimi = fiyat * 010;  } else if (yas >= 65) {
            yasIndirimi = fiyat * 0.2;  } else {
            yasIndirimi = 0;
        } fiyat=fiyat-yasIndirimi;
            if(tip==1){
                tipIndirimi=0;  } else{
                tipIndirimi=(fiyat*0.2);
                fiyat=(fiyat-tipIndirimi)*2; }
            System.out.println("Bilet fiyatı:"+fiyat+"$");  }  }