package restauraunt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //fields
    private  ArrayList<MenuItem> menuItems = new ArrayList<>();
    private int lastDayUpdated = new Date().getDay();
    private LocalDate menuLastUpdated;

    //constructor
    public Menu(ArrayList<MenuItem> menuItems, LocalDate menuLastUpdated){
        this.menuItems = menuItems;
        this.menuLastUpdated = menuLastUpdated;
    }
    //getters and setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public LocalDate getLastUpdated() {
        return menuLastUpdated;
    }

    public void setMenuLastUpdated(LocalDate menuLastUpdated) {
        this.menuLastUpdated = menuLastUpdated;
    }
}
        //methods

//addMenuItem() - last updated
//remove MenuItem();
//        MenuItem tiramisu = new MenuItem("dessert", "espresso chocolate goodness destined to fill your tummy and keep" +
//                " you up all night", 6.99, true);
//        System.out.println(tiramisu);

        //methods to create:
        // new Item: if item is x amount of days old then go to false
        // pulling key and using hashmap (ex: pull all appetizers and print those menu items)

        //Instance methods:
        // add menu item
        // remove menu items from the menu.
        // menu item is new.
        // menu was last updated.
        // print single menu item
        // print entire menu.




