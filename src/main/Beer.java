
public class Beer extends Drink {
    //Attributes
    private String brewery;

    //Constructor
    public Beer(String brewery) {
        this.brewery = brewery;
    }

    //Operations
    public String getBrewery() {
        return this.brewery;
    }
    public String toString() {
        return "This beer is from " + brewery + " brewery.";
    }
}
