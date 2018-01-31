package lab5;

public class Customer {
    
    private int ID, discount;
    private String name;

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
    public int getDiscount() {
        return discount;
    }

    
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return ("ID: " + getID() + "\nName: " + getName() +
        "\nDiscount: " + getDiscount());
    }
    
    public Customer(){
        
    }
    
}
