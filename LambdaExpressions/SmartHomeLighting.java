import java.util.*;

public class SmartHomeLighting {
    interface LightBehavior {
        void activate();
    }
    public static void main(String[] args) {
        LightBehavior motion = () -> System.out.println("Lights ON with motion sensor");
        LightBehavior timeOfDay = () -> System.out.println("Lights dim at evening");
        LightBehavior voice = () -> System.out.println("Lights change color with voice");

        motion.activate();
        timeOfDay.activate();
        voice.activate();
    }
}
