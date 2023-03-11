import java.util.Scanner;

public class InputXCond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Average: ");
        int avg = scan.nextInt();
        int grade;
        if (avg <= 2){
            grade = 20;
        } else if (avg >= 4) {
            grade = 30;
        } else {
            grade = 40;
        }
        System.out.println("Grade: " + grade);
    }
}
