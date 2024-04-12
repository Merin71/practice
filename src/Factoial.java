public class Factoial {
    public static long factorial(int n){
        long result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
    }

    public static void main(String[] args) {
        int number = 5;
        long factorial = factorial(number);
        System.out.println("Factrorial of " + number + " is " +factorial);
    }
}
