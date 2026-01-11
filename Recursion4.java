public class Recursion4 {
    static int fibonacci(int n) {
        if (n<= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
 public static void main(String[] args) {
        System.out.print("Fibonacci: ");
        for (int i = 1; i <= 8; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
