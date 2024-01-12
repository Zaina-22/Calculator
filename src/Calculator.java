

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.util.EventListener;
public class Calculator {
    private JPanel Calculator;
    private JTextField textDisplay;
    private JButton buttonminus;
    private JButton buttondivide;
    private JButton buttontwo;
    private JButton buttonthree;
    private JButton buttonfour;
    private JButton Buttonseven;
    private JButton buttonzero;
    private JButton buttondel;
    private JButton buttonsix;
    private JButton buttonnine;
    private JButton button10x;
    private JButton buttonac;
    private JButton buttonmul;
    private JButton buttonone;
    private JButton button5;
    private JButton buttoneight;
    private JButton buttonpoint;
    private JButton buttonplus;
    private JButton buttonequalto;
    private JButton buttonans;
    private JButton buttonleft;
    private JButton buttonright;
    private JButton buttonsin;
    private JButton buttoncos;
    private JButton Buttontan;
    private JButton xXButton;
    private JButton xNButton;
    private JButton sinInvButton;
    private JButton cosInvButton;
    private JButton tanInvButton;
    private JButton a1XButton;
    private JButton sqrtButton;
    private JButton cubertButton;
    private JButton logButton;
    private JButton lnButton;

    public Calculator() {
        buttonone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText()+ buttonone.getText();
                textDisplay.setText(btnOneText);
            }
        });
        buttontwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText()+ buttontwo.getText();
                textDisplay.setText(btnTwoText);
            }
        });
        buttonthree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText()+buttonthree.getText();
                textDisplay.setText(btnThreeText);
                }
        });
        buttonfour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText= textDisplay.getText()+buttonfour.getText();
                textDisplay.setText(btnFourText);

            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFivetext= textDisplay.getText()+button5.getText();
                textDisplay.setText(btnFivetext);
            }
        });
        buttonsix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText()+buttonsix.getText();
                textDisplay.setText(btnSixText);
            }
        });
        Buttonseven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText()+Buttonseven.getText();
                textDisplay.setText(btnSevenText);
            }
        });
        buttoneight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String btnEightText= textDisplay.getText()+buttoneight.getText();
            textDisplay.setText(btnEightText);
            }
        });
        buttonnine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String btnNineText=textDisplay.getText()+buttonnine.getText();
            textDisplay.setText(btnNineText);
            }
        });
        buttonzero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText=textDisplay.getText()+buttonzero.getText();
                textDisplay.setText(btnZeroText);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
