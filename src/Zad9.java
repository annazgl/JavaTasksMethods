import java.util.Scanner;

public class Zad9 {

    //Napisz funkcję, która wyznacza maksimum z dwóch zadanych liczb całkowitych. Wartością funkcji ma być większa
    // spośród liczb.

    public static int maxNumber(int a,int b){
        int max;
        if(a>b)
            max=a;
        else
            max=b;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Wieksza liczba to "+maxNumber(a,b));
        sc.close();
    }


}
