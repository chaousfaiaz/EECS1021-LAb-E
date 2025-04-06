import java.util.Timer;
/**
 * The MAIN class
 *
 * The Main class includes a timer that will start the
 * TimerTask associated with the Urban Forest!
 *
 * It will simulate a year's worth of growth every five
 * seconds ... forever!
 */
public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new UrbanForest("treelist.csv"), 0, 5000);
    }
}
