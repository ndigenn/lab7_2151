import java.util.ArrayList;
import java.util.List;

public class AnimalDriver {

    public static void main(String[] args) {
        IAnimal human = new Mammal("Human", "Homo", "sapiens", 2);
        IAnimal wideBandAnemonefish = new Fish("wide-band anemonefish", "Amphiprion", "latezonatus", 8);

        IAnimal cat = new Mammal("house cat", "Felis", "Catus", 4);
        IAnimal shark = new Fish("great white shark", "Carcharodon", "carcharias", 5);

        List<IAnimal> myAnimals = new ArrayList<>();

        myAnimals.add(human);
        myAnimals.add(wideBandAnemonefish);
        myAnimals.add(cat);
        myAnimals.add(shark);

        //Do not change anything above this line------------------------------------------------------------------------

        int leg_count = 0;
        int fin_count = 0;
        for (IAnimal animal : myAnimals) {
            System.out.println(animal.getDescription());
            if (animal instanceof Mammal) {
                leg_count += ((Mammal) animal).getLegCount();
            } else if (animal instanceof Fish) {
                fin_count += ((Fish) animal).getFinCount();
            }
        }

        System.out.println("Total fins: " + fin_count);
        System.out.println("Total legs: " + leg_count);
    }
}
