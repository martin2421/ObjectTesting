package Y1W;

/****
 * Name: Martin Atanacio
 * Student Number: T00684924
 * Assignment Number: 3
 * Due Date: February 7th, 2022
 * Program Description: Testing the use of equals() method through a parent and
 * a child class, as well as creating an abstract parent class alongside some
 * abstract methods to be used and manipulated by the child classes.
 ****/

public class PlantDriver {

     /**
      * Main Method
      */
     public static void main(String[] args) {

          // Testing Spice Object
          spiceTest();

          // Testing Vegetable abstract methods
          vegetableTest();

          // Tetsing Medicinal abstract methods
          medicinalTest();

     }

     /**
      * Helper Methods
      */
     public static void spiceTest() {

          /**
           * Initializing an empty and two parameterized (including one duplicated)
           * Spice objects
           */
          Spice spice0 = new Spice();
          Spice spice1 = new Spice("Cinnamon", "Spice", "China",
                    "Added to Desserts", "Bark of Cinnamomum Tree");
          Spice spice1_dup = new Spice("Cinnamon", "Spice", "China",
                    "Added to Desserts", "Bark of Cinnamomum Tree");
          Spice spice2 = new Spice("Ginger", "Spice", "Nepal",
                    "Added to Desserts", "Rhizome of Zingiber Officinale plant");

          // Print Header
          System.out.println("\n**********************************************" +
                    "*****************************************************");
          System.out.println("Testing creation of Spice objects, toString(), " +
                    "abstract and equals methods, accessors and mutators:");
          System.out.println("***********************************************" +
                    "****************************************************");

          /**
           * Testing toString() method
           */
          System.out.println("Testing toString() methods:\n");

          System.out.println("spice0: \tEmpty spice object:\n" +
                    spice0.toString());
          System.out.println("spice1: \tParamaterized spice object:\n" +
                    spice1.toString());
          System.out.println("spice1_dup: \tDuplicated spice object:\n" +
                    spice1_dup.toString());
          System.out.println("spice2: \t2nd Parameterized spice object:\n" +
                    spice2.toString());

          /**
           * Testing accessors (getters)
           */
          System.out.println("Testing accessor to get name, type, country, " +
                    "howUsed, part, and price:\n");

          System.out.print("Name: " + spice2.getName() +
                    " (testing name getter)\n");
          System.out.print("Type: " + spice2.getType() +
                    " (testing type getter)\n");
          System.out.print("Country: " + spice2.getCountry() +
                    " (testing country getter)\n");
          System.out.print("How its used: " + spice2.getHowUsed() +
                    " (testing howUsed getter)\n");
          System.out.print("Part of plant used: " + spice2.getPart() +
                    " (testing part getter)\n");

          /**
           * Testing mutator (setters)
           */
          System.out.println("\nTesting mutator to change name, type, country, " +
                    "howUsed, part, and price:\n");

          spice1.setName("Dried Herbs");
          spice1.setType("Plant");
          spice1.setCountry("Egypt");
          spice1.setHowUsed("Added to Soups");
          spice1.setPart("Leaves");

          System.out.print("Name: " + spice1.getName() +
                    " (testing name setter)\n");
          System.out.print("Type: " + spice1.getType() +
                    " (testing type setter)\n");
          System.out.print("Country: " + spice1.getCountry() +
                    " (testing country setter)\n");
          System.out.print("How its used: " + spice1.getHowUsed() +
                    " (testing howUsed setter)\n");
          System.out.print("Part of plant used: " + spice1.getPart() +
                    " (testing part setter)\n");

          /**
           * Testing abstract method country()
           */
          System.out.println("\nTesting country() abstract method for all 3 " +
                    "Spice objects\n");
          System.out.println("Null Spice\n" + spice0.country());
          System.out.println("Spice #1\n" + spice1.country());
          System.out.println("Spice #2\n" + spice2.country());

          /**
           * Testing abstract method howUsed()
           */
          System.out.println("Testing howUsed() abstract method for all 3 " +
                    "Spice objects\n");
          System.out.println("Null Spice\n" + spice0.howUsed());
          System.out.println("Spice #1\n" + spice1.howUsed());
          System.out.println("Spice #2\n" + spice2.howUsed());

          /**
           * Testing equals() method
           */

          // null check
          System.out.println("Testing a complete Spice object against null:");
          System.out.println("Is spice1 equals to null? " + spice1.equals(null) +
                    " (because spice1 has attributes)\n");

          // self check
          System.out.println("Testing a complete Spice object against itself:");
          System.out.println("Is spice1 equals to spice1? " + spice1.equals(spice1)
                    + " (because they are the same object)\n");

          // complete vs duplicate
          spice1 = spice1_dup; // reverting spice1 to original content

          System.out.println("Testing a complete Spice object against a " +
                    "duplicate Spice object with same attributes:");
          System.out.println("Is spice1 equals to spice1_dup? " +
                    spice1.equals(spice1_dup) + " (because they have the same " +
                    "content)\n");

          // complete vs different complete
          System.out.println("Testing a complete Spice object against a different "
                    + "Spice object:");
          System.out.println("Is spice1 equals to spice2? " + spice1.equals(spice2)
                    + " (because they have different content)\n");

     }

     public static void vegetableTest() {

          /**
           * Initializing an empty and two parameterized (including one duplicated)
           * Vegetable objects
           */
          Vegetable veg0 = new Vegetable();
          Vegetable veg1 = new Vegetable("Corn", "Vegetable", "Mexico",
                    "Many uses (salads, cornmeal, syrup)", 0.25);
          Vegetable veg1_dup = new Vegetable("Corn", "Vegetable", "Mexico",
                    "Many uses (salads, cornmeal, syrup)", 0.25);
          Vegetable veg2 = new Vegetable("Potato", "Vegetable", "Peru",
                    "Baked or fried to create potato chips", 0.15);

          // Print Header
          System.out.println("\n************************************************" +
                    "*****************");
          System.out.println("Testing creation of Vegetable objects and their " +
                    "abstract methods:");
          System.out.println("**************************************************" +
                    "***************");

          System.out.println("Null Vegetable object:\n" + veg0.toString());
          System.out.println("1st Vegetable object:\n" + veg1.toString());
          System.out.println("Duplicate of 1st Vegetable object:\n" +
                    veg1_dup.toString());
          System.out.println("2nd Vegetable object:\n" + veg2.toString());

          /**
           * Testing abstract method country()
           */
          System.out.println("Testing country() abstract method for all 3 " +
                    "Vegetable objects\n");
          System.out.println("Null Vegetable country:\n" + veg0.country());
          System.out.println("Vegetable #1 country:\n" + veg1.country());
          System.out.println("Vegetable #2 country:\n" + veg2.country());

          /**
           * Testing abstract method howUsed()
           */
          System.out.println("Testing howUsed() abstract method for all 3 " +
                    "Vegetable objects\n");
          System.out.println("Null Vegetable how its used:\n" + veg0.howUsed());
          System.out.println("Vegetable #1 how its used:\n" + veg1.howUsed());
          System.out.println("Vegetable #2 how its used:\n" + veg2.howUsed());

     }

     public static void medicinalTest() {

          /**
           * Initializing an empty and two parameterized (including one duplicated)
           * Medicinal objects
           */
          Medicinal med0 = new Medicinal();
          Medicinal med1 = new Medicinal("Aspirin", "Medicinal", "Germany",
                    "Pain relief", "Tablets");
          Medicinal med1_dup = new Medicinal("Aspirin", "Medicinal", "Germany",
                    "Pain relief", "Tablets");
          Medicinal med2 = new Medicinal("Digoxin", "Medicinal", "United Kingdom",
                    "Treat heart failure", "Liquid");

          // Print header
          System.out.println("\n*****************************************" +
                    "*************************************");
          System.out.println("Testing creation of Medicinal objects and their " +
                    "equals() and abstract methods:");
          System.out.println("**************************************************" +
                    "****************************");

          /**
           * Testing abstract method country()
           */
          System.out.println("Testing country() abstract method for all 3 " +
                    "Medicinal objects\n");
          System.out.println("Null Medicinal\n" + med0.country());
          System.out.println("Medicinal #1\n" + med1.country());
          System.out.println("Medicinal #2\n" + med2.country());

          /**
           * Testing abstract method howUsed()
           */
          System.out.println("Testing howUsed() abstract method for all 3 " +
                    "Medicinal objects\n");
          System.out.println("Null Medicinal\n" + med0.howUsed());
          System.out.println("Medicinal #1\n" + med1.howUsed());
          System.out.println("Medicinal #2\n" + med2.howUsed());

          /**
           * Testing equals() method
           */

          // null check
          System.out.println("Testing a complete Medicinal object against null:");
          System.out.println("Is med1 equals to null? " + med1.equals(null) +
                    " (because med1 has attributes)\n");

          // self check
          System.out.println("Testing a complete Medicinal object against " +
                    "itself:");
          System.out.println("Is med1 equals to med1? " +
                    med1.equals(med1) + " (because they are the same object)" +
                    "\n");

          // complete vs duplicate
          med1 = med1_dup; // reverting spice1 to original content

          System.out.println("Testing a Medicinal object against a duplicate " +
                    "Medicinal object with same attributes:");
          System.out.println("Is med1 equals to med1_dup? " +
                    med1.equals(med1_dup) + " (because they have the same " +
                    "content)\n");

          // complete vs different complete
          System.out.println("Testing a complete Medicinal object against a " +
                    "different Medicinal object:");
          System.out.println("Is med1 equals to med2? " + med1.equals(med2)
                    + " (because they have different content)\n");

     }

}
