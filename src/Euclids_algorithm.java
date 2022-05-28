import java.util.*;

public class Euclids_algorithm {

    static int[] Gcd(int a, int b) {

        int potrzebne[] = new int[3]; // nwd, x, y

        if (b == 0) {
            potrzebne[0] = a; potrzebne[1] = 1; potrzebne[2] = 0;
            return potrzebne;
        }

        potrzebne = Gcd(b,a % b);

        int q = potrzebne[2];
        potrzebne[2] = potrzebne[1] - (a / b) *potrzebne[2];
        potrzebne[1] = q;

        return potrzebne;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wprowadz dwie liczby:");
        while(scanner.hasNext()) {

            int pierwszaliczba = scanner.nextInt();
            int drugaliczba = scanner.nextInt();
            int potrzebne[] = Gcd(pierwszaliczba,drugaliczba);

            System.out.println(potrzebne[1] + " " + potrzebne[2] + " " + potrzebne[0]);
        }

    }

}

