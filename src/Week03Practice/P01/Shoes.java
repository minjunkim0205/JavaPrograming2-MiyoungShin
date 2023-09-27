package Week03Practice.P01;

public class Shoes {
    /*Private*/
    private int size;
    private int cnt;
    private String type;
    /*Override*/
    public Shoes(int size, int cnt, String type) {
        this.size = size;
        this.cnt = cnt;
        this.type = type;
    }
    /*Public*/
    public void sell(int n) {
        cnt -= n;
    }
    public void add(int n) {
        cnt += n;
    }
    public int getCnt() {
        return this.cnt;
    }
    /*ToString*/
    public String toString() {
        return ("Shoes [size=" + this.size + ", cnt=" + this.cnt + ", type=" + this.type + "]");
    }
}
