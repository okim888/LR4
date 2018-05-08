public class LR4_b2_alarm {

    public static void main(String[] args) {
        alarmClock(1, false);
        alarmClock(5, false);
        alarmClock(0, false);
    }

    public static String alarmClock(int day, boolean vacation) {
        String a = "7:00";
        String b = "10:00";
        String c = "off";
        boolean vac = false;
        if (vac == vacation) {
            if (day == 0 || day == 6) {
                return b;
            } else {
                return a;
            }
        } else {
            if (day == 0 || day == 6) {
                return c;
            } else {
                return b;
            }
        }
    }
}


   /* Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
   and a boolean indicating if we are on vacation,
   return a string of the form "7:00" indicating when the alarm clock should ring.
   Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
   Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

public class LR4_b2_alarm {

    public static void main(String[] args) {
        alarmClock(1, false) → "7:00"
        alarmClock(5, false) → "7:00"
        alarmClock(0, false) → "10:00"

        public static void alarmClock(int day, boolean vacation) {
        String a = "7:00";
        String b = "10:00";
        String c = "off";
        boolean vac = false;
        if (vac == vacation) {
            if (day == 0 || day == 6) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        } else {
            if (day == 0 || day == 6) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        }

    }
    }

        */