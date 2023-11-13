package Final.Week12Practice.P02;

import java.time.LocalDateTime;

public class TimeTest {
    public static String getCustomInfo(final LocalDateTime info){
        int year = info.getYear();
        int month = info.getMonthValue();
        int day = info.getDayOfMonth();
        int h = info.getHour();
        int m = info.getMinute();
        int s = info.getSecond();
        return (year+"년"+month+"월"+day+"일"+h+"시"+m+"분"+s+"초");
    }
    public static void main(String[] args) {
        System.out.print("[현재]\n");
        LocalDateTime now = LocalDateTime.now();
        System.out.print(getCustomInfo(now)+"\n");

        System.out.print("[현재 에서 5일후]\n");
        now = now.plusDays(5);
        System.out.print(getCustomInfo(now)+"\n");
    }
}
