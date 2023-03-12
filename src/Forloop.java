public class Forloop {
    public static void main(String[] args) {
        int n = 5;
        int total = fac(n);
        System.out.println("Total: " + total);
    }
    public static int fac(int n) {
        int total = 1;

        for (int i = 2; i <=n; i++) {
            total *= i;
        }
        return total;
    }
}
