package Week05Practice.P03;

abstract class Shape {
    /*Private*/
    private String name;
    private double y;
    private double x;
    /*Static*/
    /*Constructor*/
    Shape(final String name, final double y, final double x){
        this.name = name;
        this.y = y;
        this.x = x;
    }
    /*Abstract*/
    abstract double getArea();
    /*Public*/
    public String getName(){
        return (this.name);
    }
    public double getY(){
        return (this.y);
    }
    public double getX(){
        return (this.x);
    }
    /*ToString*/
}
