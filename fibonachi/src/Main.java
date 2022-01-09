
    public class Main {

    public static void main(String[] args) {
	    int birinci =1;
        System.out.print(birinci+" ");
        int ikinci =1;
        System.out.print(ikinci+" ");

        int yeni;
        for(int i=3;i<11;i++){
            yeni=birinci+ikinci;
            System.out.print(yeni+" ");
            birinci=ikinci;
            ikinci=yeni;
        }

    }
}
