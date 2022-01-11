import java.util.Scanner;

public class Main {

    public static void main(String[] arg){
        System.out.println("Girilen Sayıların En Büyüğünü " +
                "ve En Küçüğünü Bulan Program ");
        int max = 0, min = 0, count;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Gireceksiniz : ");
        count = scanner.nextInt();

        for(int i = 1; i <= count; i++){
            System.out.print(i + ". Sayıyı Giriniz : ");
            int num = scanner.nextInt();
            if(i == 1){
                max = num;
                min = num;
            }
            if(num > max){
                max = num;
            }else if(num < min){
                min = num;
            }
        }

        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);

    }
}
