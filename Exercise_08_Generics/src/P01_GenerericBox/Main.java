package P01_GenerericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String text = scanner.nextLine();
            System.out.printf("%s", new Box<>(text));
        }
    }
}
