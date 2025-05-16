import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TestGrila extends JFrame {

    private JPanel MainPanell;
    private JButton SubmitButton;
    private JRadioButton r3;
    private JRadioButton r2;
    private JRadioButton r1;
    private JLabel question1;
    private JCheckBox c1;
    private JCheckBox c2;
    private JCheckBox c3;
    private JLabel question2;
    ButtonGroup group;

    public TestGrila() {

            setContentPane(MainPanell);
            setTitle("Test grila");
            setSize(400, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setLayout(null);


        group = new ButtonGroup();
        group.add(r1); group.add(r2); group.add(r3);
        add(r1); add(r2); add(r3);


        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int punctaj = 0;
                if (r3.isSelected()) {
                    punctaj++;
                }
                if (!c1.isSelected() && c3.isSelected() && c2.isSelected()) {
                    punctaj++;
                }
                JOptionPane.showMessageDialog(null,
                        "Ati raspuns la intrebari!\nRaspunsuri corecte: " + punctaj + " din 2");
            }
        });
    }
    public static void main(String[] args) {
        new TestGrila();
    }
}
