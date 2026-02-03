import java.util.Scanner;

class PrimeNumber {

    void check(int n) {
        boolean prime = true;

        if (n <= 1)
            prime = false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeNumber p = new PrimeNumber();

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        p.check(n);
    }
}
