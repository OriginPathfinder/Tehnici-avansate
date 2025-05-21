import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract class Corpuri {
    public abstract double calculeazaAriaBazei();
    public abstract double calculeazaAriaLaterala();
    public abstract double calculeazaVolumul();
}


class ParalelipipedCalcul extends Corpuri {
    private double lungime, latime, inaltime;

    public ParalelipipedCalcul(double lungime, double latime, double inaltime) {
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public double calculeazaAriaBazei() {
        return lungime * latime;
    }

    public double calculeazaAriaLaterala() {
        return 2 * inaltime * (lungime + latime);
    }

    public double calculeazaVolumul() {
        return lungime * latime * inaltime;
    }
}
class ConCalcul extends Corpuri {
    private double raza, inaltime;

    public ConCalcul(double raza, double inaltime) {
        this.raza = raza;
        this.inaltime = inaltime;
    }

    public double calculeazaAriaBazei() {
        return Math.PI * raza * raza;
    }

    public double calculeazaAriaLaterala() {
        double generatoare = Math.sqrt(raza * raza + inaltime * inaltime);
        return Math.PI * raza * generatoare;
    }

    public double calculeazaVolumul() {
        return (1.0 / 3.0) * Math.PI * raza * raza * inaltime;
    }
}
class CilindruCalcul extends Corpuri {
    private double raza, inaltime;

    public CilindruCalcul(double raza, double inaltime) {
        this.raza = raza;
        this.inaltime = inaltime;
    }

    public double calculeazaAriaBazei() {
        return Math.PI * raza * raza;
    }

    public double calculeazaAriaLaterala() {
        return 2 * Math.PI * raza * inaltime;
    }

    public double calculeazaVolumul() {
        return Math.PI * raza * raza * inaltime;
    }
}
public class GeometrieApp extends JFrame {


    private JPanel MainPanell;
    private JButton MeniuButton;
    private JButton ExitButton;
    private JButton ParapButton;
    private JButton ConButton;
    private JButton CilindruButton;

    public  GeometrieApp (){
        setContentPane(MainPanell);
    setTitle("Aplicatie Geometrie");
    setSize(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        ParapButton.setVisible(false);
        ConButton.setVisible(false);
        CilindruButton.setVisible(false);

        MeniuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParapButton.setVisible(true);
                ConButton.setVisible(true);
                CilindruButton.setVisible(true);
            }
        });
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Esti sigur ca vrei sa iesi?", "Confirmare", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) System.exit(0);
            }
        });
        ParapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Paralelipiped();
            }
        });
        ConButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ConFrame();
            }
        });
        CilindruButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cilindru();
            }
        });
    }

    public static void main(String[] args) {
        new GeometrieApp();
    }


}
