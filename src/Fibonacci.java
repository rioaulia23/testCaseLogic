import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka Fibonacci yang ingin ditampilkan: ");
        int x = scanner.nextInt();

        displayFibonacci(x);

        scanner.close();
    }

    public static void displayFibonacci(int x) {
        int a = 0, b = 1;

        System.out.print("Bilangan Fibonacci pertama " + x + " adalah: ");

        for (int i = 0; i < x; i++) {
            System.out.print(a + ", ");

            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
