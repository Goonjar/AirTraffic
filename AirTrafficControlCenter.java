
//Mediator Class
import java.util.Date;

public class AirTrafficControlCenter {

    public static void doMediator(Aircraft aircraft, String request) {

        String response = "please waiting ...";
        if ("ask for landing".equals(request)) {
            response = " please landing";
        } else if (("ask for launch").equals(request)) {
            response = " please take off";
        }


        System.out.println(new Date().toString() + ":" + aircraft.getIdentifier() + response);
    }
}