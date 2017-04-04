
public class Zad4 {

    //Napisz funkcję divide wyznaczającą iloraz dwóch zadanych liczb całkowitych. Działanie funkcji sprawdź pisząc
    // odpowiedni program.

    public static void main(String[] args) {
        int division = divide(10, 5);
        System.out.println(division);
    }
    public static int divide(int a, int b){
        if(b==0){
            System.out.println("Nie dziel przez 0");
            return 0;
        }
        return a/b;
    }
}
