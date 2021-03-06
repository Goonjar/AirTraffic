
/*

Main. References airplane classes and mediator
*/
public class CommandCenter 
{
    public static void main(String[] args) {
        Airbus airbus001 = new Airbus(001);
        Airbus airbus002 = new Airbus(002);
        Jet jet001 = new Jet(001);

        AirTrafficControlCenter.doMediator(airbus001, Aircraft.ASK_FOR_LANDING);
        AirTrafficControlCenter.doMediator(airbus002, Aircraft.ASK_FOR_LAUNCH);
        AirTrafficControlCenter.doMediator(jet001, Aircraft.ASK_FOR_LAUNCH);

    }
}