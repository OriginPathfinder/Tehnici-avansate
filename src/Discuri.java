public class Discuri {

    public static class Disc {
        protected String nume;
        protected int capacitate;

        public Disc(String nume, int capacitate) {
            this.nume = nume;
            this.capacitate = capacitate;
        }

        public void afisare() {
            System.out.println("Disc: " + nume);
            System.out.println("Capacitate: " + capacitate + " MB");
        }
    }

   public static class Discheta extends Disc {
    private int stare; // 1 = write-protected, 0 = scriere permisa

    public Discheta(String nume, int capacitate, int stare) {
        super(nume, capacitate);
        this.stare = stare;
    }

    public void setStare(int stareNoua) {
        this.stare = stareNoua;
    }

    @Override
    public void afisare() {
        super.afisare();
        System.out.println("Stare: " + (stare == 1 ? "Write-protected" : "Scriere permisă"));
    }
}

public static class HardDisk extends Disc {
    private String controler;

    public HardDisk(String nume, int capacitate, String controler) {
        super(nume, capacitate);
        this.controler = controler;
    }

    @Override
    public void afisare() {
        super.afisare();
        System.out.println("Controler: " + controler);
    }
}


    public static void main(String[] args) {

        Disc d = new Disc("GenericDisc", 500);
        d.afisare();
        System.out.println();


        Discheta disk = new Discheta("Discheta1", 1440, 1);
        disk.afisare();
        disk.setStare(0);
        System.out.println("După modificarea stării:");
        disk.afisare();
        System.out.println();


        HardDisk hd = new HardDisk("HDD1", 1000000, "SATA");
        hd.afisare();
    }
}
