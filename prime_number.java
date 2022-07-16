import java.util.Scanner;

public class prime_number {
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        prln("Enter the frist number:");
        int Frist_number = user_input.nextInt();
        prln("Enter the Secend number:");
        int Secend_number = user_input.nextInt();
        int count = 0;
        int totle_primeNumber = 0;

        for (int i = Frist_number; i <= Secend_number; i++) {
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                prln(i);
                totle_primeNumber++;

            }
            count = 0;

        }
        prln("totle prime number is:" + totle_primeNumber);

    }

    static void prln(Object anyObject) {
        System.out.println(anyObject);
    }

}
