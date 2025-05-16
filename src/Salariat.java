class Salariat {

    public static final double impozit = 0.15 ;
    public  String name;
    public String functia;
    public int varsta ;
    public double salariubrut;
    public static double cursDolar = 4.56;
    public Salariat(String num,String func ,int ani,double sal ) {

        name=num;
        functia=func;
        varsta=ani;
        salariubrut=sal;
    }
    public double salariuNet ()
    {
        return salariubrut*(1-impozit);
    }
    public double SalariuBrutDolar ()
    {
        return salariubrut/cursDolar;
    }
    public double SalariuNetDolar ()
    {
        return salariuNet()/cursDolar;
    }

public void afisare ()
{
    System.out.println("Nume Salariat: "+name);
    System.out.println("Functia: "+functia);
    System.out.println("Varsta: "+varsta);
    System.out.println("Salariubrut: "+salariubrut+" lei");
    System.out.println("SalariuNet: "+salariuNet()+" lei");
    System.out.println("CursDolar: 1.00$ = "+cursDolar+" lei");
    System.out.println("SalariuBrutDolar: "+(float)(SalariuBrutDolar()) +" $");
    System.out.println("SalariuNetDolar: "+(float)(SalariuNetDolar()) +" $");

}
}
