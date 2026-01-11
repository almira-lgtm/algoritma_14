public class exponential2 {
    static int exp(int basis, int n) {
        if (n == 0)
            return 1;
        return basis * exp(basis, n - 1);
    }

    public static void main(String[] args) {
        System.out.println("2^10 = " + exp(2, 10));
    }
}
