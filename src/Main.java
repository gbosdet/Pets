public class Main {
    public static void main(String[] args){
        Kennel kennel = new Kennel();
        kennel.addPet(new Cat("Chloe"));
        kennel.addPet(new Dog("Goldy"));
        kennel.addPet(new LoudDog("Trout"));
        kennel.allSpeak();

    }
}
