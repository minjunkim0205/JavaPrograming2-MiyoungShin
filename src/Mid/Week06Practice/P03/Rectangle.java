package Mid.Week06Practice.P03;

public class Rectangle implements IGraphics{
    /*Private*/
    private double length;
    private double width;
    /*Static*/
    /*Constructor*/
    Rectangle(final double length, final double width){
        this.length = length;
        this.width = width;
    }
    /*Abstract*/
    public double perimeter(){
        return ((this.length+this.width)*2);
    }
    public void draw(){
        System.out.print("도형 Rectangle을 그립니다.\n");
    }
    /*Public*/
    /*ToString*/
    public String toString() {
        return ("Circle [length="+this.length+", width="+this.width+"]");
    }
}
