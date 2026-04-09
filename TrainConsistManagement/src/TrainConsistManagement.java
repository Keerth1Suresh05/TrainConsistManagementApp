import java.util.Map;
import java.util.HashMap;

public class TrainConsistManagement {
    /*
     * @author developer
     * @version 6.0
     */
    public static void main(String[] args){

        System.out.println("======================================");
        System.out.println(" === Train Consist Management App === ");
        System.out.println("======================================");

        System.out.println("\n-- Map Bogie to Capacity (HashMap) --");

        Map <String, Integer> capacityMap = new HashMap<>();

        capacityMap.put("First Class",24);
        capacityMap.put("Cargo",120);
        capacityMap.put("Sleeper",72);
        capacityMap.put("AC Chair",56);

        System.out.println("\nBogie Capacity Details :");
        for(Map.Entry<String,Integer> entry : capacityMap.entrySet() ){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

        System.out.println("\nbogie-capacity mapping completed...");
    }
}