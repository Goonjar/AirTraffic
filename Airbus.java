

public class Airbus implements Aircraft {

    String identifier;


    public Airbus(int id) {
        this.identifier = "Airbus-" + id;
    }

    public void flyRouter() {
        System.out.println(identifier +  " flies from C to D");
    }

    public String getIdentifier() {
        return identifier;
    }
}