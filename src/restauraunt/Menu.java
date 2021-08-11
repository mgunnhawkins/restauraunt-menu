package restauraunt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;

public class Menu {
    //fields
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private int lastDayUpdated = new Date().getDay();
    private LocalDate menuLastUpdated;
    private String printedMenu;

    //getters and setters
    public ArrayList<MenuItem> getMenuItem() {
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

    public void addMenuItem(MenuItem menuItem) { //need to put class name in front of what I am passing through

        for(MenuItem existingItem:menuItems){
            if (menuItem.getName().equals(existingItem.getName())){
                System.out.println("Item already exists.");
                return; //if the item is found I need to exit the function so I do not add the item.
            }
        }

        menuItems.add(menuItem);
    }

    public void removeItem(String name){
        for (MenuItem item: menuItems){
            if (item.getName().equals(name)){
                //TODO:  remove item from menuItems
                displayMenu();
                break;
            }
        }
    }

    public void printItem(MenuItem item){//prints 1 item

        System.out.println(String.format("\n-----------------------------\n%s\n%s\nPrice: %f\n" ,item.getName(),
                item.getDescription(),
                item.getPrice()) + item.featuredItem() + "\n-----------------------------");
    }

    public void displayItem(String name){
        for (MenuItem item: menuItems){
            if (item.getName().equals(name)){
                printItem(item);
                break;
            }
        }
    }

    public void displayMenu(){
        for(MenuItem item: menuItems){
            printItem(item);
        }
    }

}
        //methods

//remove MenuItem();
//

        //methods to create:
        // new Item: if item is x amount of days old then go to false
        // pulling key and using hashmap (ex: pull all appetizers and print those menu items)

        //Instance methods:

        //determine whether or not two menu items are equal
        // menu item is new.
        // menu was last updated.





