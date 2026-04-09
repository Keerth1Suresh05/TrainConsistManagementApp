import java.util.List;
import java.util.LinkedList;

public class TrainConsistManagement {
    /*
     * @author developer
     * @version 4.0
     */
    public static void main(String[] args){

        System.out.println("======================================");
        System.out.println(" === Train Consist Management App === ");
        System.out.println("======================================");

        System.out.println("\n-- Maintain Ordered Bogie Consist --");

        List <String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist :");
        System.out.println(trainConsist);

        trainConsist.add(1,"Pantry Car");
        System.out.println("\nAfter Inserting 'Pantry Car' at position 2 :");
        System.out.println(trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("\nAfter Removing First and Last Bogie :");
        System.out.println(trainConsist);

        System.out.println("\nordered consist operations completed...");
    }
}