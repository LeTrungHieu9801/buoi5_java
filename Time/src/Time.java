import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Time {
    private int hour;
    private int minute;
    private int second;

    // constructor
    public Time(int hour , int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
    // get set
    public int getHour()
    {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute()
    {
        return this.minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond()
    {
        return this.second;
    }

    public void setSecond(int second) {
        this.minute = second;
    }
    public void setTime(int hour , int minute , int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString()
    {
        return  String.format("%s",hour<10? "0"+hour:""+hour) + ":" + String.format("%s",minute<10? "0"+minute:""+minute) + ":" +String.format("%s",second<10? "0"+second:""+second) ;
    }
    public Time nextSecond(){
        return new Time(this.hour, this.minute, this.second+1);
    }
    public Time previousSecond(){
        return new Time(this.hour, this.minute, this.second-1);
    }
    //main
    public static void main(String[] args) {
        System.out.println(new Time(23, 2, 3).toString());
        System.out.println(new Time(23, 2, 3).nextSecond().toString());
        System.out.println(new Time(23, 2, 3).previousSecond().toString());
    }

}
