import java.util.Scanner;

public class Zad10 {

    //Napisz funkcję, która odczytuje jako argument liczbę i wypisuje liczbę dzielników.

    public static int maxDivide(int a) {
        int divide = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0)
                divide++;
        }
        return divide;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Liczba dzielników to " + maxDivide(a));
        sc.close();
    }
}
