package Week5Practice.T05;

public class Point2D {
    /*Private*/
    private int x;
    private int y;
    /*Static*/
    /*Constructor*/
    Point2D(){
        this.x = 0;
        this.y = 0;
    }
    /*Abstract*/
    /*Public*/
    public void setX(final int x){
        this.x = x;
    }
    public void setY(final int y){
        this.y = y;
    }
    private int getX(){
        return (this.x);
    }
    private int getY(){
        return (this.y);
    }
    /*ToString*/
    public String toString() {
        return ("x=" + x + ",\ty=" + y);
    }
}
