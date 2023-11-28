package Final.Week14Practice.P05;

public class Board {
    private String title;
    private String writer;

    public Board(final String title, final String writer){
        this.title = title;
        this.writer = writer;
    }

    public String getTitle() {
        return (this.title);
    }
    public String getWriter() {
        return (this.writer);
    }
    @Override
    public String toString(){
        return ("Board [subject="+this.title+", writer="+this.writer+"]");
    }
}
