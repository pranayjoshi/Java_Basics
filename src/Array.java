import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] temps = array();
        System.out.println(temps[2]);
        System.out.println(Arrays.toString(temps));
    }

    public static int[] array() {
        int[] temps = {1,2,3,4,6,5};
        int len = temps.length;
        int last = temps[temps.length-1];
        return temps;
        
    }
}
