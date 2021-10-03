package com.company;
import java.awt.*;
import javax.swing.*;


class Practice4 extends JFrame
{
    JButton ACMilanButton = new JButton("AC Milan");
    JButton RealMadridButton = new JButton("Real Madrid");

    JLabel Result = new JLabel("Result: 0 X 0");
    JLabel LastScorer = new JLabel("Last Scorer: N/A");
    JLabel Winner = new JLabel("Winner: N/A");

    int ACMilanScore  = 0;
    int RealMadridScore = 0;

    public Practice4() {
        setSize(400,400);
        setLayout(new BorderLayout());
        add(ACMilanButton,BorderLayout.WEST);
        add(RealMadridButton,BorderLayout.EAST);
        add(Result,BorderLayout.SOUTH);
        add(LastScorer,BorderLayout.NORTH);
        add(Winner,BorderLayout.CENTER);

        ACMilanButton.addActionListener(ae-> {
            ACMilanScore++;
            LastScorer.setText("Last Scorer: AC Milan");
            printResults();
        });

        RealMadridButton.addActionListener(ae-> {
            RealMadridScore++;
            LastScorer.setText("Last Scorer: Real Madrid");
            printResults();
        });
    }

    void printResults() {
        Result.setText(String.format("Result: %d X %d", ACMilanScore, RealMadridScore));
        if(ACMilanScore > RealMadridScore)
            Winner.setText("Winner: AC Milan");
        else Winner.setText("Winner: Real Madrid");

        if(ACMilanScore == RealMadridScore)
            Winner.setText("Winner: draw");
    }

    public static void main(String[] args) {
        new Practice4().setVisible(true);
    }
}