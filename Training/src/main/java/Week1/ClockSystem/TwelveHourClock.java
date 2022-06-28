package Week1.ClockSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TwelveHourClock extends  Clock implements Hour, Minute, Seconds{

    private int hour;
    private int minute;
    private int second;

    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

    public TwelveHourClock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String getTime() {
        return timeFormatter.format(LocalDateTime.now().withHour(getHour()).withMinute(getMinute()).withSecond(getSeconds())) ;
    }

    @Override
    public int getHour() {
        return this.hour;
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
