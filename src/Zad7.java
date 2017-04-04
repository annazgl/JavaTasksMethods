import java.util.Scanner;


public class Zad7 {

    /*Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest kwadratem pewnej liczby całkowitej.
    Liczby będące kwadratami liczb całkowitych to 1, 4, 9, 16 itd. Wartością funkcji ma być  prawda, jeśli liczba
    spełnia warunek oraz fałsz w przeciwnym wypadku. */

    public static boolean isSquare(int a){
        int sqrRoot=(int)Math.sqrt(a);
        if(sqrRoot*sqrRoot==a)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(isSquare(a)){
            System.out.println("Liczba jest kwadratem liczby całkowitej");
        }
        else
            System.out.println("Liczba nie jest kwadratem liczby całkowitej");
        sc.close();
    }

}

