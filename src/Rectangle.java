import java.awt.geom.Dimension2D;
class Rectangle extends ClosedFigure implements Interface {

    final Dimension2D dimension;

    Rectangle(Dimension2D dimension) {
        this.dimension = dimension;
    }

    @Override
    public double perimeter(){
        return 2 * (dimension.getHeight() + dimension.getWidth());
    }

    @Override
    public void draw(){
    }

     @Override
     public boolean isStealth() {
         return false;
     }
 }
