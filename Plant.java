package Y1W;

/**
 * Parent Class. Contains abstract methods so other child classes can write their
 * own code. 
 */
public abstract class Plant {

     // Variable declaration
     private String name;
     private String type;
     private String country;
     private String howUsed;

     // Default Constructor
     public Plant() {
          name = "EMPTY";
          type = "EMPTY";
          country = "EMPTY";
          howUsed = "EMPTY";
     }

     // Parameterized Constructor
     public Plant(String name, String type, String country, String howUsed) {
          this.name = name;
          this.type = type;
          this.country = country;
          this.howUsed = howUsed;
     }

     // Abstract methods, designed so each child class writes its own code
     abstract String country();
     abstract String howUsed();

     // toString() method
     @Override
     public String toString() {
          return "Name: " + name + "\nType: " + type + "\nCountry of Origin: " +
                    country + "\nHow Used: " + howUsed + "\n";
     }

     // equals() method
     @Override
     public boolean equals(Object obj) {
          if (this == obj) // self check
               return true;
          if (obj == null) // null check
               return false;
          if (!(obj instanceof Plant)) // type check and cast
               return false;

          Plant plant = (Plant) obj;

          return this.name.equals(plant.name) &&
                    this.type.equals(plant.type) &&
                    this.country.equals(plant.country) &&
                    this.howUsed.equals(plant.howUsed);

     }

     // Getters
     public String getName() {
          return name;
     }

     public String getType() {
          return type;
     }

     public String getCountry() {
          return country;
     }

     public String getHowUsed() {
          return howUsed;
     }

     // Setters
     public void setName(String name) {
          this.name = name;
     }

     public void setType(String type) {
          this.type = type;
     }

     public void setCountry(String country) {
          this.country = country;
     }

     public void setHowUsed(String howUsed) {
          this.howUsed = howUsed;
     }

}
