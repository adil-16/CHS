
package computerhardwarestore;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.text.*;

public class TesterCHS {

    
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yy");

        System.out.println(dateFormat.format(date));
} 
    }
    
