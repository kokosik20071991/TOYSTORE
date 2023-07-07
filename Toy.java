public class Toy {
    private int id;                     // Идентификатор игрушки 
    private String name;                // Название игрушки
    private int quantity;               // Количество
    private double frequency;           // Частота выпадения игрушки 
    
    
    public Toy(int id, String name, int quantity, double frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getQuantity() {
        return quantity;
    }


    public double getFrequency() {
        return frequency;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
    
}