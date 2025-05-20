import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cilindru extends JFrame  {
    private JLabel info;
    private JLabel pRaza;
    private JTextField DateRaza;
    private JLabel pinaltimeac;
    private JButton buttonCalculare;
    private JLabel rr;
    private JTextArea RezultatField;
    private JButton Exit;
    private JTextField DataInaltime;
    private JPanel MainPanell;

    public Cilindru() {

        setContentPane(MainPanell);
        setTitle("CILINDRU");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);



        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(null, "Esti sigur ca vrei sa iesi?", "Confirmare", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) System.exit(0);
            }
        });
        buttonCalculare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double r = Double.parseDouble(DateRaza.getText());
                    double h = Double.parseDouble(DataInaltime.getText());

                    if (r <= 0 || h <= 0) throw new IllegalArgumentException();

                    CilindruCalcul c = new CilindruCalcul(r, h);
                    RezultatField.setText("Aria Bazei: " + c.calculeazaAriaBazei() +
                            "\nAria Laterala: " + c.calculeazaAriaLaterala() +
                            "\nVolum: " + c.calculeazaVolumul());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Date invalide! Introduceti doar valori pozitive.");
                }


            }
        });

    }
    public static void main(String[] args) {
        new Cilindru();
}}
