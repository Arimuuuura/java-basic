import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

//生年月日を入れると今日まで何日生きたか、現在日時を取得して算出する
class LifeTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("生年月日を教えて下さい");
        System.out.println("西暦何年ですか？");
        Integer year = scan.nextInt();
        System.out.println("何月ですか？");
        Integer month = scan.nextInt();
        System.out.println("何日ですか？");
        Integer day = scan.nextInt();

        // (今日の経過ミリ秒) - (誕生日の経過ミリ秒) / (一日のミリ秒) = (誕生からの経過日数)
        long dayPassed = (setCalendar(getDate("yyyy"), getDate("MM")-1, getDate("dd")).getTimeInMillis()
            - setCalendar(year, month-1, day).getTimeInMillis() ) / (24 * 60 * 60 * 1000 );

        System.out.print("今日は" + getDate("yyyy") + "年" + getDate("MM") + "月" + getDate("dd") + "日です。\n");
        System.out.print("誕生から" + dayPassed + "日経ちました。");
    }

    // 経過ミリ秒から現在の西暦、年月日取得
    private static int getDate(String pattern){
        Date date = new Date();
        SimpleDateFormat getFormat = new SimpleDateFormat(pattern);
        int currentDate = Integer.parseInt(getFormat.format(date));

        return currentDate;
    }

    // 年月日をCalendarクラスにセット
    private static Calendar setCalendar(Integer year, Integer month, Integer day){
        Calendar date = Calendar.getInstance();
        date.set(year, month, day);

        return date;
    }
}
