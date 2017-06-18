
public class Bottle<Drink> {
    private Drink content = null;

    public boolean isEmpty() {
        if(this.content == null) {
            return true;
        }
        else {
            return false;
        }
    }
    public void fill(Drink content) throws IllegalStateException {
        if(this.content != null) {
            throw new IllegalStateException("Bottle is already filled.");
        }
        this.content = content;
        //System.out.println("The bottle has been filled with " + content.toString());

    }

    public Drink empty() throws IllegalStateException {
        Drink oldDrink;
        oldDrink = this.content;
        if(this.content == null) {
          throw new IllegalStateException("Bottle is already empty.");
        }
        this.content = null;

        return oldDrink;

    }
}
