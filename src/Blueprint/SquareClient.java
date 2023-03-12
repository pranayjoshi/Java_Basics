package Blueprint;

public class SquareClient {
    public static void main(String[] args) {
            
        Square r1 = new Square(10, "Cm");
        Square r2 = new Square(100, "cm");

        int area1 = r1.height * r1.width;
        int area2 = r2.height * r2.width;

        System.out.println(area1);
        System.out.println(area2);

        r1.grow(20,20);
        r2.grow(20, 30);

        area1 = r1.area();
        area2 = r2.area();

        System.out.println(area1);
        System.out.println(area2);

    }
}
