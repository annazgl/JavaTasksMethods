
public class Zad5 {

    /*Napisz funkcję, która matrzy parametry formalne a, b, c będące liczbami całkowitymi. Funkcja zwraca prawdę,
    jeśli zadane liczby są liczbami pitagorejskimi oraz fałsz w przeciwnym wypadku.
    Liczby pitagorejskie spełniają warunek: a*a+b*b=c*c. */

    public static void main(String[] args) {
        boolean numbers = elements(3, 4, 5);
        System.out.println(numbers);
    }
    public static boolean elements(int a, int b, int c){
        if((a*a)+ (b*b) == c*c){
            return true;
        }
        else{
            return false;
        }
    }
}
