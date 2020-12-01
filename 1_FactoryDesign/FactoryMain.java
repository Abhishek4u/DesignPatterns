import com.phone.Android;
import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class FactoryMain {

    public static void main(String[] args) {

        // 1. Traditional Way
        OS obj = new Android();
        obj.spec();

        // 2. Using FactoryDesign we will create factory which will give 
            // corresponding os 
        OperatingSystemFactory osf = new OperatingSystemFactory();

        OS obj2 = osf.getInstance("iOS");
        obj2.spec();

    }
}