public class Main {
    public static void main(String[] args) {

        ClaseString claseString = new ClaseString("Automatica Intelligence");

        System.out.println("toString -> " + claseString.toString());
        System.out.println("length -> " + claseString.getLength());
        System.out.println("charAt -> " + claseString.charAt(7));
        System.out.println("toUpperCase -> " + claseString.toUpperCase());
        System.out.println("subString -> " + claseString.getSubString(11,23));
        System.out.println("replace -> " + claseString.replace("Automatica", "Academy"));
        System.out.println("¿Es palíndromo? " + claseString.esPalindromo("reconocer"));


        claseString.setText("    Automatica Intelligence");
        System.out.println("Texto con espacios -> " + claseString.toString());
        System.out.println("trim -> " + claseString.trim());








    }
}