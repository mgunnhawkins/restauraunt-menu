package restauraunt;
import restauraunt.Menu;
import restauraunt.MenuItem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem tiramisu = new MenuItem("tiramisu", "dessert", "espresso chocolate goodness destined to fill your " +
                "tummy and keep" +
                " you up all night", 6.99, true);
        System.out.println(tiramisu);
        //methods to create:
        // new Item: if item is x amount of days old then go to false
        // pulling key and using hashmap (ex: pull all appetizers and print those menu items)
    }
}
