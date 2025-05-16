public class StivaExceptie {

   public static class ExceptieStiva extends Exception {
        public ExceptieStiva(String mesaj) {
            super(mesaj);
        }
    }
    static class Stiva {
        private int[] elemente;
        private int varf;
        private int capacitate;

        public Stiva(int n) {
            capacitate = n;
            elemente = new int[n];
            varf = -1;
        }

        public void push(int valoare) throws ExceptieStiva {
            if (varf >= capacitate - 1) {
                throw new ExceptieStiva("Stiva este plina. Nu se poate adauga elementul " + valoare);
            }
            elemente[++varf] = valoare;
        }

        public int pop() throws ExceptieStiva {
            if (varf < 0) {
                throw new ExceptieStiva("Stiva este goala. Nu se poate extrage niciun element.");
            }
            return elemente[varf--];
        }

        public void afisare() {
            System.out.print("Stiva curenta: ");
            for (int i = 0; i <= varf; i++) {
                System.out.print(elemente[i] + " ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
            Stiva stiva = new Stiva(3);

            try {
                stiva.push(10);
                stiva.push(20);
                stiva.push(30);
                stiva.afisare();


                stiva.push(40);

            } catch (ExceptieStiva e) {
                System.out.println("Eroare: " + e.getMessage());
            }

            try {
                System.out.println("Element scos: " + stiva.pop());
                System.out.println("Element scos: " + stiva.pop());
                System.out.println("Element scos: " + stiva.pop());
                stiva.afisare();
                System.out.println("Element scos: " + stiva.pop());

            } catch (ExceptieStiva e) {
                System.out.println("Eroare: " + e.getMessage());
            }
        }
    }