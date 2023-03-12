package Blueprint;

public class RectangleClient {
        
        public static void main(String[] args) {
            
            Rectangle r1 = new Rectangle(10, 5);
            Rectangle r2 = new Rectangle(100, 100);

            int area1 = r1.height * r1.width;
            int area2 = r2.height * r2.width;

            System.out.println(area1);
            System.out.println(area2);

            r1.grow(30,20);
            r2.grow(20, 30);

            area1 = r1.area();
            area2 = r2.area();

            System.out.println(area1);
            System.out.println(area2);

        }
    }
