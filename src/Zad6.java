
public class Zad6 {

    //Napisz funkcję, która wyznacza sumę cyfr zadanej liczby całkowitej.

    public static void main(String[] args) {
        int sum= number(45);
        System.out.println(sum);

    }
    public static int number (int a){
        String number = String.valueOf(a);

        int sum = 0;
        for(int i =0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        return sum;
        }
    }

