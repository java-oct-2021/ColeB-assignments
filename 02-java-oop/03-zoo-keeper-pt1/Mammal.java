/**
 * Mammal
 */
public class Mammal {
    protected int energyLevel = 10000;

    public int displayEnergy() {
        System.out.println("It's over 9000!: " + energyLevel);
        return energyLevel;
    }
    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }
}

// Tasks:
// ● Create a Mammal class that has an energyLevel and displayEnergy() method. The displayEnergy() method should show the animals energy level as well as return it.

// ● Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()

// ● For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease the energy level by 5

// ● For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10

// ● For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10

// ● Create a GorillaTest class to instantiate a gorilla and have it throw three things, eat bananas twice, and climb once.

// class Vehicle {
//     protected String brand = "Ford";        // Vehicle attribute
//     public void honk() {                    // Vehicle method
//       System.out.println("Tuut, tuut!");
//     }
//   }

//   class Car extends Vehicle {
//     private String modelName = "Mustang";    // Car attribute
//     public static void main(String[] args) {

//       // Create a myCar object
//       Car myCar = new Car();

//       // Call the honk() method (from the Vehicle class) on the myCar object
//       myCar.honk();

//       // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
//       System.out.println(myCar.brand + " " + myCar.modelName);
//     }
//   }