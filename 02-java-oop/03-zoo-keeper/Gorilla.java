public class Gorilla extends Mammal {

    public Gorilla() {
        super(100);
    }
    public void throwSomething(){
        System.out.println("Duck!");
        this.energyLevel -= 5;
    }
    public void eatBanana(){
        System.out.println("Does the Gorilla like the banana?");
        this.energyLevel += 10;
    }
    public void climb() {
        System.out.println("Climbing Empire State Building");
        this.energyLevel -= 10;
    }
}
