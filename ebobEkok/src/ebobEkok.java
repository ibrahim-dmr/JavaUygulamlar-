import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // EBOB: Bir sayı grubundan sayıların ortak katının en büyüğü
        // EKOK: Bir sayı grubundan sayıların ortak katının en küçüğü
        // Ekok: (s1*s2) / ebob
        int s1, s2, ebob=1, ekok;
        System.out.println("Lütfen sayıları giriniz: ");
        s1=sc.nextInt();
        s2=sc.nextInt();

        int min=(s1>s2)? s1: s2;
        for (int i=min; i>0; i--){
            if ((s1 % i == 0) && (s2 % i == 0)) {
                ebob=i;
                break;
            }
        }
        ekok =  (s1*s2)/ebob;
        System.out.println(s1+ " ve "+s2+"sayılarının EBOB'U: "+ebob);
        System.out.println(s1+ " ve "+s2+"sayılarının EKOK'U: "+ekok);

    }
}
