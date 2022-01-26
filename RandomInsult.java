import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;


public class RandomInsult implements ActionListener {

    private JLabel label;
    private JFrame frame;
    private JPanel panel;    

    public RandomInsult() {

        frame = new JFrame();

        JButton button = new JButton("Click Here");
        button.addActionListener(this);
        
        label = new JLabel("");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Insult Generator");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new RandomInsult();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String[] insults = {"Fuck You!", "You are a bitch.", "You are a pussy.", "You are an idiot."};
        Random random = new Random();
        int randomNumber = random.nextInt(insults.length);
        String text = (insults[randomNumber]);
        label.setText(text);        

    }
}

