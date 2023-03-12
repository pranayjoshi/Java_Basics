public class StaticMethod {
    public static String grade(int avg) {
        int grade;
        if (avg <= 2){
            grade = 20;
        } else if (avg >= 4) {
            grade = 30;
        } else {
            grade = 40;
        }
        return "Grade: " + grade;
    }

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;
        int num3 = num1 + num2;
        String total = grade(num3);
        System.out.println("Total money: "+ total);
    }
}
