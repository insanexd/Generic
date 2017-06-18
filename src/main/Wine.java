
public abstract class Wine extends Drink {
    //Attributes
    private String region;

    //Constructor
    public Wine(String region) {
        this.region = region;
    }
    public String getRegion() {
        return this.region;
    }
    public String toString() {
        return "This wine is from the " + region + "'s region.";
    }
}
