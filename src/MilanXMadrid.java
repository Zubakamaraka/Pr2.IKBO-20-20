import javax.swing.*;
import java.lang.*;

class MilanXMadrid extends JFrame
{
        private int milan = 0, real = 0;
        JButton but1 = new JButton("AC Milan");;
        JButton but2 = new JButton("Real Madrid");;
        JLabel lastScore = new JLabel("Result: " + milan+" X " + real);
        JLabel resLabel = new JLabel("Last Scorer: N/A");
        JLabel winLabel = new JLabel("Winner: DRAW");

        public MilanXMadrid()
        {
            super("Milan X Madrid");

            setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            but1.setBounds(50,100,150,100);
            but2.setBounds(300,100,150,100);
            lastScore.setBounds(30,200,200,200);
            resLabel.setBounds(30,300,200,200);
            winLabel.setBounds(40,400,200,200);
            add(but1);
            add(but2);
            add(lastScore);
            add(resLabel);
            add(winLabel);
            setSize(600,600);
            but1.addActionListener(e->
            {
                milan++;
                lastScore.setText("Result: " + milan+" X " + real);
                resLabel.setText("Last Scorer: AC Milan");
                if(milan > real)
                    winLabel.setText("Winner: AC Milan");
                else if(milan == real)
                    winLabel.setText("Winner: DRAW");
            });
            but2.addActionListener(e->
            {
                real++;
                lastScore.setText("Result: " + milan+" X " + real);
                resLabel.setText("Last Scorer: Real Madrid");
                if (real > milan)
                    winLabel.setText("Winner: Real Madrid");
                else if(milan == real)
                    winLabel.setText("Winner: DRAW");
            });
        }
    public static void main(String args[])
    {
        new MilanXMadrid().setVisible(true);
    }
}
