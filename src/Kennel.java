import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;

    public Kennel(){
        petList = new ArrayList<>();
    }

    public Kennel(Pet[] pets){
        this();
        for(Pet pet : petList){
            petList.add(pet);
        }
    }

    public void addPet(Pet pet){
        petList.add(pet);
    }


    //Implement me!!
    //All pets in the petList should print their name followed by what they say
    public void allSpeak(){

    }
}
