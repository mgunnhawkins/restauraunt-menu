package restauraunt;
import java.util.Date;

public class MenuItem {
    //fields
    private String name;
    private Double price;
    private String description;
    private String category; //look up enum to create own variable type
    private Boolean newItem = false;
    private Integer dateCreated = new Date().getDay(); //can use for loop to update

    //constructor
    public MenuItem (String name, String category, String description, Double price, Boolean newItem){
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.newItem = newItem;
    }

    //getters and setters
    public String getName(){ return name;}

    public void setName(String name) { this.name = name; }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNewItem() {
        return newItem;
    }

    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }

    public String featuredItem(){
        String featuredItem = "";
        if (newItem = true){
                featuredItem = "*** New Item ***";
            }
        return featuredItem;
    }

    //determine whether or not two menu items are equal


}

