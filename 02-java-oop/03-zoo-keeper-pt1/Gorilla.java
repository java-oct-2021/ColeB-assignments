public class Gorilla extends Mammal {
    public Gorilla(int energyLevel) {
        super(energyLevel);
    }
    public void throwSomething(){
        System.out.println("Duck!");
        energyLevel -= 5;
    }
    public void eatBanana(){
        System.out.println("Does the Gorilla like the banana?");
        energyLevel += 10;
    }
    public void climb() {
        System.out.println("Climbing Empire State Building");
        energyLevel -= 10;
    }
}
