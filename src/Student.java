
public class Student {

    private String nume;
    private int an;
    private String grupa;
    private double notaSem1;
    private double notaSem2;


    private static int nrStudenti = 0;


    public Student(String nume, int an, String grupa, double notaSem1, double notaSem2) {
        this.nume = nume;
        this.an = an;
        this.grupa = grupa;
        this.notaSem1 = notaSem1;
        this.notaSem2 = notaSem2;
        nrStudenti++;
    }
    public double calculeazaMedia() {
        return (notaSem1 + notaSem2) / 2.0;
    }
    public void afisare() {
        System.out.printf("Nume: %s\nAn: %d\nGrupa: %s\nNota sem 1: %.2f\nNota sem 2: %.2f\nMedia: %.2f\n\n",
                nume, an, grupa, notaSem1, notaSem2, calculeazaMedia());
    }
    public static int getNrStudenti() {
        return nrStudenti;
    }


    public static void main(String[] args) {
        Student s1 = new Student("Andrei Popescu", 2, "211A", 8.5, 9.0);
        Student s2 = new Student("Maria Ionescu", 1, "111B", 7.0, 6.5);
        Student s3 = new Student("Ion Vasile", 3, "301C", 9.5, 10.0);
        Student s4 = new Student("Ana Georgescu", 2, "211A", 8.0, 7.5);

        s1.afisare();
        s2.afisare();
        s3.afisare();
        s4.afisare();

        System.out.println("Numar total de studenti: " + Student.getNrStudenti());
    }
}
