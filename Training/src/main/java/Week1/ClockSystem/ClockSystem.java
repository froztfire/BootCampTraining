package Week1.ClockSystem;

public class ClockSystem {

    private static final int HOUR = 1;
    private static final int MINUTE = 16;
    private static final int SECONDS = 45;
    private static final int MILLISECONDS = 500 * 1000000;


    public static void main(String[] args) {

        //------------------- POLYMORPHISM-----------------------//
        Clock clock;
        clock = new NormalClock(HOUR, MINUTE, SECONDS);
        System.out.println("A. NORMAL CLOCK: " + clock.getTime());
        clock = new ExactClock(HOUR, MINUTE, SECONDS, MILLISECONDS);
        System.out.println("B. EXACT CLOCK: " + clock.getTime());
        clock = new TwelveHourClock(HOUR, MINUTE, SECONDS);
        System.out.println("C. 12HR CLOCK: " +clock.getTime());
        clock = new RomanClock(HOUR);
        System.out.println("D. ROMAN HOUR CLOCK: " +clock.getTime());
        clock = new JapanClock(HOUR, MINUTE, SECONDS);
        System.out.println("E. JAPAN CLOCK: " +clock.getTime());
        clock = new TwelveHourJapanClock(HOUR, MINUTE, SECONDS);
        System.out.println("F. 12HR JAPAN CLOCK: " +clock.getTime());
    }
}
