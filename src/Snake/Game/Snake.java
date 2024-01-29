package Snake.Game;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Snake extends JFrame {

    private JLabel scoreLabel;

    public Snake() {
        initUI();
    }

    private void initUI() {
        add(new Board());

        // Create a score label
        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setForeground(java.awt.Color.white);
        add(scoreLabel, BorderLayout.SOUTH);

        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}





































