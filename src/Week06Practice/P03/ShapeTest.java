package Week06Practice.P03;

public class ShapeTest {
    public static void main(String[] args) {
        IGraphics[] arrayOfShapes = new IGraphics[3];
        arrayOfShapes[0] = new Rectangle(10.02, 3.21);
        arrayOfShapes[1] = new Rectangle(19.2, 2.0);
        arrayOfShapes[2] = new Circle(7.0);
        System.out.print("---------- Shape Draw ----------\n");
        for (IGraphics arrayOfShape : arrayOfShapes) {
            arrayOfShape.draw();
            System.out.print(arrayOfShape+"\n");
            System.out.print("둘레 : "+arrayOfShape.perimeter()+"\n\n");
        }
    }
}
