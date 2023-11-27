package Final.Week14Practice.P02;

public class MyPair<T>{
    private T first;
    private T second;
    public MyPair(final T first, final T second){
        this.first = first;
        this.second = second;
    }
    @Override
    public String toString() {
        return ("value1 : "+this.first+"\t\tvalue2 : "+this.second);
    }
}
