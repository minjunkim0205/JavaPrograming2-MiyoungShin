package Week5Practice.T05;

public class Point3D {
    /*Private*/
    private int z;
    /*Static*/
    /*Constructor*/
    Point3D() {
        this.z = 0;
    }
    /*Abstract*/
    /*Public*/
    public void setZ(final int z) {
        this.z = z;
    }
    private int getZ() {
        return (this.z);
    }
    /*ToString*/
    public String toString() {
        return ("z="+this.z);
    }
}