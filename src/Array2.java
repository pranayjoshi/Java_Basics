import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] temps = array();
        System.out.println(temps[2]);
        System.out.println(Arrays.toString(temps));
        looparr(temps);
    }

    public static int[] array() {
        int[] temps = new int[5];
        temps[0] = 1;
        temps[2] = 4;
        return temps;
        
    }

    public static void looparr(int[] temps) {
        for (int i : temps) {
            System.out.println(i);
        }
    }
}

