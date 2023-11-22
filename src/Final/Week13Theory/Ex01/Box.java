package Final.Week13Theory.Ex01;

public class Box<TYPE>{
    private TYPE data;
    public Box(final TYPE data){
        this.data = data;
    }
    public void setData(final TYPE data){
        this.data = data;
    }
    public TYPE getData(){
        return (this.data);
    }
    @Override
    public String toString() {
        return (super.toString());
    }
}
