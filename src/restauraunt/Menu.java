package restauraunt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;

public class Menu {
    //fields
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate menuLastUpdated;
    private String printedMenu;

    //getters and setters
    public ArrayList<MenuItem> getMenuItem() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }


    // menu was last updated
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
        menuLastUpdated = LocalDate.now();
    }

    public void removeItem(String name){
        for (MenuItem item: menuItems){
            if (item.getName().equals(name)){
                menuItems.remove(item);
                displayMenu();
                break;
            } else {
                System.out.println("Unable to remove. Menu item does not exist.");
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







