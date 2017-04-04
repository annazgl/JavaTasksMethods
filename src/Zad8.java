import java.util.Scanner;

public class Zad8 {

    // Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest liczbą pierwszą.

    public static boolean isPrime(int n){
        if(n<2)
            return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int n=sc.nextInt();
        if(isPrime(n))
            System.out.println("Liczba jest pierwsza");
        else
            System.out.println("Liczba nie jest pierwsza");
        sc.close();
    }
}
