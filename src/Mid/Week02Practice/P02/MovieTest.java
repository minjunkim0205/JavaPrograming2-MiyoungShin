package Mid.Week02Practice.P02;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie = new Movie("hallym", "software", 10, 2022);
        System.out.print("==== 객체 정보 출력 ====\n");
        System.out.print("제목="+movie.title+"\n감독="+movie.director+"\n평점="+movie.score+"\n발표 연도="+movie.since);
    }
}
