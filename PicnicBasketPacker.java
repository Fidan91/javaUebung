import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class PackPicnicBasket {
    public static String packPicnicBasket(String[] items, int[] quantities, int maxWeight) {
        // Write code here

        // Create list 
        HashMap<String, Integer> finalBasket = new HashMap<>();
        
        // iterate list and adding items to the basket 
        for(int i = 0; i < items.length; i++){
            if(maxWeight >= quantities[i]){
                finalBasket.put(items[i], quantities[i]);
            }else {
                continue;
            }
            maxWeight -= quantities[i];
        }
        // sortieren
        TreeMap<String, Integer> sorted = new TreeMap<>(finalBasket);
        // check packed items
        if(finalBasket.isEmpty()){
            return "Basket is too heavy!";
        }else{
            String result = "";
            for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
                result += entry.getKey() +  ": " + entry.getValue() + "\n";
            }

            return result;
        }
    }
}
