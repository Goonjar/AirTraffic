
public class Jet implements Aircraft {

    private String identifier;

    public Jet(int id) {
        this.identifier = "Jet-" + id;
    }

    public void flyRouter() {
        System.out.println("Jet-"+ identifier +  " flies from A to B");
    }

    public String getIdentifier() {
        return identifier;
    }
}