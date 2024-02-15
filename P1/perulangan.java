package P1;
import java.util.Scanner;
public class perulangan {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = input03.nextLine();

        int n = Integer.parseInt(nim.substring(Math.max(0, nim.length() - 2)));
        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println();  
    }
}


