package Y1W;

/**
 * Child class. Contains a new attribute 'price' of type double. 
 */
public class Vegetable extends Plant {

     // Variable declaration
     private double price;

     // Default Constructor
     public Vegetable() {
          super();
          price = 0.00;
     }

     // Parameterized Constructor
     public Vegetable(String name, String type, String country, String howUsed,
               double price) {
          super(name, type, country, howUsed);
          this.price = price;
     }

     // Abstract Methods
     public String country() {
          return "Country of origin: " + getCountry() + "\n";
     }

     public String howUsed() {
          return "How its used: " + getHowUsed() + "\n";
     }

     // toString() method
     @Override
     public String toString() {
          return super.toString() + String.format("Price per Kg: $%.2f", price)
                    + "\n";
     }

     // equals() method
     public boolean equals(Object obj) {

          if (this == obj) // self check
               return true;
          if (obj == null) // null check
               return false;
          if (!(obj instanceof Vegetable)) // type check and cast
               return false;

          Vegetable veg = (Vegetable) obj;

          return super.equals(veg) && this.price == veg.getPrice();

     }

     // Getter
     public double getPrice() {
          return price;
     }

     // Setter
     public void setPrice(double price) {
          this.price = price;
     }

}
