public class Conditional {
    public static void main(String[] args) {
        int avg = 16;
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
