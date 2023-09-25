package Week5Practice.P03;

public class Circle extends Shape{
    /*Private*/
    /*Static*/
    /*Constructor*/
    Circle(final String name, final double x, final double y){
        super(name, y, x);
    }
    /*Abstract*/
    double getArea(){
        return (super.getX()*super.getX()*super.getY());
    }
    /*Public*/
    /*ToString*/
}
