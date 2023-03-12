package Blueprint;

public class Square extends Rectangle{

    String unit;

    public Square(int side, String unit) {

        super(side, side); 
        this.unit = unit;
    }

    public String toString() {
        return "This is a rect";
    } 
    
}
