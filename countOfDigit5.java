public class countOfDigit5 {
    static int countDigit(int n) {
        if (n == 0)
            return 0;
        return 1 + countDigit(n / 10);
    }

    public static void main(String[] args) {
        int number = 100000;
        System.out.println("Jumlah digit = " + countDigit(number));
    }
}

