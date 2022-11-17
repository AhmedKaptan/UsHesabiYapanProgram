import java.util.Scanner;

public class Main {

    static int pow(int x, int y){
    if( y == 0) return 1;
    return x * pow(x, y-1);
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz :");
        int x = input.nextInt();
        System.out.print("Üs değerini giriniz :");
        int y = input.nextInt();

        System.out.println("Sonuç : " + pow(x, y));
    }
}