import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Paralelipiped extends JFrame {


    private JPanel MainPanell;
    private JLabel pLungime;
    private JLabel pLatime;
    private JLabel pInaltime;
    private JTextField DateLungime;
    private JTextField Dateinaltime;
    private JButton buttonCalculare;
    private JLabel info;
    private JTextField DateLatime;

    private JButton Exit;
    private JLabel rr;
    private JTextArea RezultatField;

    public Paralelipiped (){
        setContentPane(MainPanell);
        setTitle("PARALELIPIPED");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        buttonCalculare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double l = Double.parseDouble(DateLungime.getText());
                    double L = Double.parseDouble(DateLatime.getText());
                    double h = Double.parseDouble(Dateinaltime.getText());

                    if (l <= 0 || L <= 0 || h <= 0) throw new IllegalArgumentException();

                    ParalelipipedCalcul p = new ParalelipipedCalcul(l, L, h);
                    RezultatField.setText("Aria Bazei: " + p.calculeazaAriaBazei() + System.lineSeparator() +
                            "Aria Laterala: " + p.calculeazaAriaLaterala() +
                            "\nVolum: " + p.calculeazaVolumul());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Date invalide! Introduceti doar valori pozitive.");
                }
            }
        });
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Esti sigur ca vrei sa iesi?", "Confirmare", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) System.exit(0);
            }
        });
    }






    public static void main(String[] args) {
        new Paralelipiped();
    }


}
