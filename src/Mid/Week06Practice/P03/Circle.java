package Mid.Week06Practice.P03;

public class Circle implements IGraphics{
    /*Private*/
    private double radius;
    /*Static*/
    private final static double PI = 3.14;
    /*Constructor*/
    Circle(final double radius){
        this.radius = radius;
    }
    /*Abstract*/
    public double perimeter(){
        return (2*PI*this.radius);
    }
    public void draw(){
        System.out.print("도형 Circle을 그립니다.\n");
    }
    /*Public*/
    /*ToString*/
    public String toString() {
        return ("Circle [radius="+this.radius+"]");
    }
}
