package Week1.ClockSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ExactClock extends Clock implements Hour, Minute, Seconds, Milliseconds{   //------------------- INHERITANCE -----------------------//
    private int hour;
    private int minute;
    private int second;
    private int milliseconds;

    public ExactClock(int hour, int minute, int second, int milliseconds) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.milliseconds = milliseconds;
    }

    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
    @Override
    public String getTime() {
        return timeFormatter.format(LocalDateTime.now().withHour(getHour()).withMinute(getMinute()).withSecond(getSeconds()).withNano(getMilliSeconds())) ;
    }

    //------------------- ENCAPSULATION -----------------------//
    @Override
    public int getHour() {
        return this.hour;
    }
    @Override
    public int getMilliSeconds() {
        return this.milliseconds;
    }
    @Override
    public int getMinute() {
        return this.minute;
    }
    @Override
    public int getSeconds() {
        return this.second;
    }
}
