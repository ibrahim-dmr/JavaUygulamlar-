import java.util.Scanner;
public class atmProjesi {
    public static void main(String[] args){
        int bakiye=1000, input, miktar=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Merhaba!");
        System.out.println("Güncel Bakiyeniz: "+bakiye+"TL");
        while(bakiye>0){
            System.out.println();
            System.out.println("1-) Para yatır");
            System.out.println("2-) Para çek");
            System.out.println("3-) Bakiye Sorgula");
            System.out.println("4-) Çıkış Yap");
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            input =sc.nextInt();
                if (input==1){
                    System.out.println("Yatırmak istediğiniz milktar?");
                    miktar=sc.nextInt();
                    bakiye+=miktar;
                }else if(input==2){
                    System.out.println("Çekmek istediğiniz miktarı giriniz:");
                    if(miktar>bakiye){
                        System.out.println("Yetersiz Bakiye!");
                    }else{
                         bakiye-=miktar;
                    }
                }else if(input==3){
                    System.out.println("Güncel bakiyeniz"+bakiye);
                }else if(input==4){
                    System.out.println("Çıkış yapılıyor...");
                }else{
                    System.out.println("Geçersiz bir işlem girdiniz");
                }
                System.out.println("Tekrar Bekleriz...");
        }
    }
}
