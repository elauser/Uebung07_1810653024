public class Aufgabe1 {
    public static void main(String[]args){
        int a = 1;
        int b = 0;

        try{
            int c = a/b;
        }catch(ArithmeticException e){
            System.err.println("fehler");
        }
        System.out.println("ende der methode");
    }
}
