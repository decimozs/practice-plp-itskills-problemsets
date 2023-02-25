public class fibonacciTerms {
    
    public static Integer fib (int n) {

        int[] a = new int[n + 2];
        a[0] = 0;
        a[1] = 1;

        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2]; 
        }

        return a[n];

    }
    
    public static void main(String[] args) {
        
        int n = 10;
        for(int i = 0; i < n; i++) {
            System.out.println("Fibonacci Terms: " + fib(i));
        }

    }
}
