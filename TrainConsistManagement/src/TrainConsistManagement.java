import java.util.Set;
import java.util.LinkedHashSet;

public class TrainConsistManagement {
    /*
     * @author developer
     * @version 5.0
     */
    public static void main(String[] args){

        System.out.println("======================================");
        System.out.println(" === Train Consist Management App === ");
        System.out.println("======================================");

        System.out.println("\n-- Maintain Ordered Bogie Consist --");

        Set <String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        System.out.println("\nFinal Train Formation :");
        System.out.println(formation);

        System.out.println("\nNote:\nLinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nformation setup completed...");
    }
}