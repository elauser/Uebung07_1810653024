import javax.swing.*;

public class Aufgabe5 {
    public static void main (String[]args){
        //Checked exception Sind Probleme die man im Programmcode lösen muss.
        Integer[] negativeArraySizeException = new Integer[-1];
        //Unchecked exception Sind Probleme die vom User verursacht werden z.B nach Zahleneingabe 1:0 ArithmeticException
        int a = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine eins ein"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine null ein"));
        System.out.println(a/b);
    }
}
