import java.util.Scanner;

public class Armstrong_range {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range:");
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int i = low; i <= high; i++) {
            int temp = i;
            int digitsCount = String.valueOf(i).length(); // count digits
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (int) Math.pow(digit, digitsCount);
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.println(i + " is an Armstrong number");
            }
        }

        sc.close();
    }
}