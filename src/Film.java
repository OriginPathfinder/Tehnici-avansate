
public class Film {

    static int pretBilet = 30000;
    static String cinematograf = "Patria";
    public String nume;
    public int durata;
    public boolean luatOscar ;

public Film (String num, int nrMin, boolean oscar) {
    nume = num;
    durata = nrMin;
    luatOscar = oscar;
}
static int getPretBilet() {
return pretBilet;
}
    static int getDurata(Film f ) {
        return f.durata;
    }
static void printCinema(Film f ){
    System.out.println("Filmul "+f.nume+" este difuzat la cinematograful "+ f.cinematograf);
   // f.afisare(); // apel non-static
}
public void afisare (){
    System.out.println("Nume: "+nume);
    System.out.println("Durata: "+getDurata(this) + " (minute)");
    if (luatOscar)
        System.out.println("Filmul are premiu Oscar");
        else
            System.out.println("Filmul nu a primit premiu Oscar");
printCinema(this); // apel Static
}

    public static void main(String[] args) {
    System.out.println("Pretul unui bilet este: "+Film.getPretBilet() + " lei");
    Film f1 = new Film("Titanic",180,true);
    f1.afisare();
    //Film.printCinema(f1);

    }
}
