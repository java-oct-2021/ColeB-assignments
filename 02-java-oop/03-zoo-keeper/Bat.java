public class Bat extends Mammal {
    public Bat(){
        super(300);
    }

    public void fly(){
        System.out.println("I'm FLYING!!!!");
        this.energyLevel -= 50;
    }

    public void eatHumans(){
        System.out.println("Tastes like pork");
        this.energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("I'm attacking the town!");
        this.energyLevel -= 100;
    }
}