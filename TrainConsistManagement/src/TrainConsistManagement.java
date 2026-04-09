import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagement {
    /*
     * @author developer
     * @version 2.0
     */
    public static void main(String[] args){

        System.out.println("======================================");
        System.out.println(" === Train Consist Management App === ");
        System.out.println("======================================");

        System.out.println("\n-- Track Unique Bogie IDs --");
        Set <String> bogies = new HashSet<>();

        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        bogies.add("BG101");
        bogies.add("BG102");

        System.out.println("\nBogie IDs After Insertion :");
        System.out.println(bogies);

        System.out.println("\nNote:\nDuplicates are automatically ignored by HashSet");

        System.out.println("\nuniqueness validation completed...");
    }
}