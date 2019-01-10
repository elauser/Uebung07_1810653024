import javax.swing.*;

public class Aufgabe2 {
    public static void main (String[]args){
        zahl();
    }
    public static void zahl(){

        try{
            Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein"));
        }
        catch(NumberFormatException e){
            System.out.println("Falsche Eingabe");
            zahl();
        }
    }
}
