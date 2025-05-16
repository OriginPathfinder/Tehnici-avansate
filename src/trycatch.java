public class trycatch {

        public static int calculeazaPatrat(String input) throws NumberFormatException {
            int numar = Integer.parseInt(input);
            return numar * numar;
        }

        public static void main(String[] args) {
            String input = "abc";

            try {
                int rezultat = calculeazaPatrat(input);
                System.out.println("Rezultatul este: " + rezultat);
            } catch (NumberFormatException e) {
                System.out.println("Eroare: input-ul \"" + input + "\" nu este un număr valid.");
            }
        }
    }



