package Mid.Week02Practice.P02;

public class Movie {
    // Private
    // Public
    String title;
    String director;
    Integer score;
    Integer since;

    public Movie(String title, String director, Integer score, Integer since) {
        this.title = title;
        this.director = director;
        this.score = score;
        this.since = since;
    }
    // To string
    /*
    public String toString(){
        return "제목="+this.title+"\n감독="+this.director+"\n평점="+this.score+"\n발표 연도="+this.since;
    }
    */
}
