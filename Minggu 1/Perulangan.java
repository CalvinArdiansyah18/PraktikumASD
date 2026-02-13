import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input NIM: ");
        long nim = input.nextLong();
        long n = nim % 100;

        if (n < 10) {
            n += 10;
        };

        for (long i = 1; i <= n; i++) {
            if(i == 10 || i == 15){
                continue;
            } else if (i % 3 == 0) {
                System.out.print(" # ");
            } else if (i % 2 != 0) {
                System.out.print(" * ");
            } else {
                System.out.print(i);
            }

        }
        input.close();
    }
}
