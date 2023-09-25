package Week5Practice.P03;

public class Triangle extends Shape{
    /*Private*/
    /*Static*/
    /*Constructor*/
    Triangle(final String name, final double x, final double y){
        super(name, y, x);
    }
    /*Abstract*/
    double getArea(){
        return (super.getY()*super.getX()/2.0);
    }
    /*Public*/
    /*ToString*/
}
