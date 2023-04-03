import java.awt.geom.Dimension2D;
import java.sql.Array;
import java.util.*;

public class Square extends Rectangle {
    double sideLength;

    Square(Dimension2D dimension) {
        super(dimension);
    }

    @Override
    public double perimeter(){
        return 4*sideLength;
    }

    @Override
    public void draw(){

    }
    public String toString(){
       return String.format("%s",sideLength);
    }

    public static void main(String[] args) {
     float num = (float) Math.random();
        System.out.println(num);
        int[] ary = {1,2,3,4};
        System.out.println(ary.length);
        Square square = new Square(new Dimension2D() {
            @Override
            public double getWidth() {
                return 0;
            }

            @Override
            public double getHeight() {
                return 0;
            }

            @Override
            public void setSize(double width, double height) {

            }
        });
        System.out.println(square.toString());

    }
}

