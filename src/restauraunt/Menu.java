package restauraunt;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
   private  ArrayList<MenuItem> menuItems = new ArrayList<>();
   private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}




        //methods
//        MenuItem tiramisu = new MenuItem("dessert", "espresso chocolate goodness destined to fill your tummy and keep" +
//                " you up all night", 6.99, true);
//        System.out.println(tiramisu);
        //methods to create:
        // new Item: if item is x amount of days old then go to false
        // pulling key and using hashmap (ex: pull all appetizers and print those menu items)



