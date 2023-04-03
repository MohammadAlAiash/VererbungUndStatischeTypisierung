public class FigureTest {


    Figure fig;
    ClosedFigure closedFigure;
    Rectangle rect;
    Square square;
    double result = 0.0d;

    void runTest(){
        result = rect.perimeter();
        result = square.perimeter();
        fig = rect;
        fig.draw();
    }
}
