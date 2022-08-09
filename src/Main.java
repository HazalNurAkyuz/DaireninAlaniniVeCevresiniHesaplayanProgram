import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double alan, hacim, pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yaricapini Giriniz:");
        r = input.nextInt();
        alan = 2 * pi * r;
        hacim = pi * (r*r);
        System.out.println("Dairenin Alani:" + alan);
        System.out.println("Dairenin Hacmi:" + hacim);

    }
}