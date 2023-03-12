package Blueprint;

public class Rectangle{

    int width;
    int height;

    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }

    public void grow(int w, int h) {
        this.height += h;
        this.width += w;
    }

    public int area() {
        return this.width * this.height;
    }

    public String toString() {
        return "This is a rect";
    }
}
