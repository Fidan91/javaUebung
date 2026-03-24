import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
// import java.util.Set;

class Main{
    public static void main (String[] args){

        // Hashmap erzeugen
        HashMap<String, String> capital = new HashMap<>();

        // Werte hinzufügen
        capital.put("England", "London");
        capital.put("Türkei", "Ankara");
        capital.put("Deutschland", "Berlin");
        capital.put("Italien", "Rom");
        capital.put("Frankreich", "Paris");
        capital.put("Belgien", "Brussel");
        capital.put("Portugal", "Lissabon");
        capital.put("Spanien", "Madrid");
        capital.put("Russland", "Moskau");
        capital.put("Palästina", "Jerusalem");
        capital.put("Südafrika", "Kapstadt");
        capital.put("Aserbaidschan", "Baku");
        capital.put("Georgien", "Tiflis");
        capital.put("Bosnien & Herzogowina", "Sarajevo");
        capital.put("Schweden", "Stockholm");

        // in einer Liste speichern
        List<String> countries = new ArrayList<>();
        countries.addAll(capital.keySet());

        // Random + Scanner erzeugen
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        while(true){    //endlosschleife

            //zuerst Index erzeugen
            int index = random.nextInt(countries.size());
            String country = countries.get(index);
            System.out.println("Was ist die Hauptstadt von " + country + "?");
            
            // Benutzereingabe mit scanner
            if (scan.next().equals(capital.get(country))){
                System.out.println("Richtig!");
            }else{
                System.out.println("Leider Falsch! Die richtige Antwort lautet: " + capital.get(country));
            }
            
            scan.close();
        }

    // Ausgeben mit Set
        // Set<String> keySet = capital.keySet();
        // for(String s : keySet){
        //     System.out.println("Die Hauptstadt von " + s +": " + capital.get(s));
        // }

    }
}