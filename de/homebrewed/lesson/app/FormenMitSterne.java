package de.homebrewed.lesson.app;

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
        
        if (ShapeType.KREIS.name().equalsIgnoreCase(form)) {
            
            int radius = getParameter("Gib den Radius an: ", reader);
            int mittelpunkt_X = getParameter("Gib den Mittelpunkt X an: ", reader);
            int mittelpunkt_Y = getParameter("Gib den Mittelpunkt Y an: ", reader);
            int max_x = getParameter("Gib den Maximal Wert für X an: ", reader);
            int max_y = getParameter("Gib den Maximal Wert für Y an: ", reader);
            
            kreisZeichnen(radius, mittelpunkt_X, mittelpunkt_Y, max_y, max_x);
            
        } else if (ShapeType.VIERECK.name().equalsIgnoreCase(form)) {
           
            int seitenlaenge = getParameter("Gib die Seitenlänge für das Viereck an: ", reader);
            
            rechteckZeichnen(seitenlaenge, seitenlaenge);
            
        } else if (ShapeType.RECHTECK.name().equalsIgnoreCase(form)) {
            
            int breite = getParameter("Gib die Breite für das Rechteck an: ", reader);
            int hoehe = getParameter("Gib die Höhe für das Rechteck an: ", reader);
            
            rechteckZeichnen(breite, hoehe);
            
        } else {
            System.out.println("Ungültige Eingabe! Bitte gebe kreis, viereck oder rechteck ein!");
        }
    }
    
    private static int getParameter(String frage, BufferedReader reader) throws IOException {
        System.out.print(frage);
        return Integer.parseInt(reader.readLine());
    }
    
    public static void kreisZeichnen(int radius, int mitteX, int mitteY, int breite, int hoehe) {
        int radiusZumQuadrat = radius * radius;
        
        for (int y = 0; y < hoehe; y++) {
            for (int x = 0; x < breite; x++) {
                int dx = mitteX - x;
                int dy = mitteY - y;
                int distanzZumQuadrat = dx * dx + dy * dy;
                
                if (distanzZumQuadrat <= radiusZumQuadrat) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    private static void rechteckZeichnen(int breite, int hoehe) {
        String zeile = "*".repeat(breite);
        for (int i = 0; i < hoehe; i++) {
            System.out.println(zeile);
        }
    }
}
