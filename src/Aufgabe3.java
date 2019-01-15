import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe3 {
    public static void main(String[]args){
        String email = JOptionPane.showInputDialog("Geben Sie ihre email ein");
        try {
            checkEmail(email);
        } catch (InvalidEmailException e) {
            e.printStackTrace();
        }
    }
    public static void checkEmail(String email) throws InvalidEmailException{
        Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
        Matcher m = pattern.matcher(email);
        if(!m.find())throw new InvalidEmailException("Invalid Email adress");
    }
}
