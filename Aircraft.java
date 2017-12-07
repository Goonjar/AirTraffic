
//Simple Interface for my two aircraft types
public interface Aircraft {

    static final String  ASK_FOR_LAUNCH = "ask for launch";
    static final String  ASK_FOR_LANDING = "ask for landing";
    String getIdentifier();
    void flyRouter();
}