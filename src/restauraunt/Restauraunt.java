package restauraunt;

public class Restauraunt {

    public static void main(String[] args) {
        // write your code here

        Menu menu = new Menu();



        //menu Items:
        menu.addMenuItem(new MenuItem("bruschetta", "appetizer", "fresh tomatoes, onions, and basil on toasted " +
                "Italian bread", 8.99, false));

        menu.addMenuItem(new MenuItem("aranccinni", "appetizer", "breaded and fried risotto balls stuffed with " +
                "mozzarella", 6.99, true));

        menu.addMenuItem(new MenuItem("house salad", "appetizer", "simple house salad with house dressing", 4.99,
                false));

        menu.addMenuItem(new MenuItem("salmon", "main", "cedar planked salmon with rice", 27.00, false));
        menu.addMenuItem(new MenuItem("balsamic chicken", "main","chicken with a balsamic glaze over mashed potatoes",
                25.00, true));
        menu.addMenuItem(new MenuItem("filet mignon", "main", "juicy 6oz filet topped with garlic butter and " +
                "roasted garlic mashed potatoes", 35.00, true));

        menu.addMenuItem(new MenuItem("tiramisu", "dessert","espresso chocolate goodness destined to fill your tummy " +
                "and keep you up all night", 6.99, true));
        menu.addMenuItem(new MenuItem("chocolate cake", "dessert", "decadent chocolate cake with dark chocolate " +
                "ganache", 5.99, false));
        menu.addMenuItem(new MenuItem("lemon sorbet", "a refreshing scoop of homemade lemon sorbet", "dessert", 5.99,
                true));
        menu.addMenuItem(new MenuItem("lemon sorbet", "a refreshing scoop of homemade lemon sorbet", "dessert", 5.99,
                true));

        //methods to create:

        menu.displayMenu();
        menu.displayItem("tiramisu");
        // new Item: if item is x amount of days old then go to false
        // pulling key and using hashmap (ex: pull all appetizers and print those menu items)
    }
}
