
public class Main {

    public static void main(String[] args) {
        Bottle<Drink> bottle =  new Bottle<>();
        Beer beer = new Beer("duff");
        Wine wine = new RedWine("gatonegro");


        try {
            bottle.fill(beer);
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
