import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormenMitSterne {

    public static void main(String[] args) throws IOException {
        //Initialisieren
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String form;


        System.out.print("Welche Form soll ich für dich zeichnen? ");
        form = reader.readLine();
        
        if (form.equals("kreis")){

            System.out.print("Gib den Radius an: ");
            int radius = Integer.parseInt(reader.readLine());

            System.out.print("Gib den Mittelpunkt X an: ");
            int mittelpunkt_X = Integer.parseInt(reader.readLine());
    
            System.out.print("Gib den Mittelpunkt Y an: ");
            int mittelpunkt_Y = Integer.parseInt(reader.readLine());
    
            System.out.print("Gib den Maximal Wert für X an: ");
            int max_x = Integer.parseInt(reader.readLine());
    
            System.out.print("Gib den Maximal Wert für Y an: ");
            int max_y = Integer.parseInt(reader.readLine());

            kreisZeichnen(radius, mittelpunkt_X, mittelpunkt_Y,  max_y, max_x);
    
        }else if(form.equals("viereck")){
            System.out.print("Gib die Seitenlänge für das Viereck an: ");
            int seitenlaenge = Integer.parseInt(reader.readLine());
            rechteckZeichnen(seitenlaenge, seitenlaenge);

        }else if (form.equals("rechteck")){
            System.out.print("Gib die Breite für das Rechteck an: ");
            int breite = Integer.parseInt(reader.readLine());
            
            System.out.print("Gib die Höhe für das Rechteck an: ");
            int hoehe = Integer.parseInt(reader.readLine());
            rechteckZeichnen(breite, hoehe);
        }else{
            System.out.println("Ungültige Eingabe! Bitte gebe kreis, viereck oder rechteck ein!");
        }

        reader.close();
    }

    public static void kreisZeichnen(int radius, int mittelpunkt_X, int mittelpunkt_Y, int max_y, int max_x){
        for (int y = 1; y <= max_y; y++){
            for (int x = 1; x <= max_x; x++){
                double distanz = Math.sqrt(Math.pow(mittelpunkt_X - x, 2) + Math.pow(mittelpunkt_Y - y, 2));

                if(distanz <= radius){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void rechteckZeichnen(int breite, int hoehe) {
        for (int y = 0; y < hoehe; y++) {
            for (int x = 0; x < breite; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
