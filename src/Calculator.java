

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.util.EventListener;
public class Calculator {
    private char operator;
    private double num1,num2;
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

    private void getOperator(String btnText){
        operator=btnText.charAt(0);
        num1=num1+Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }
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

        buttonleft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnLeftText=textDisplay.getText()+buttonleft.getText();
                textDisplay.setText(btnLeftText);
            }
        });
        buttonright.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnRightText=textDisplay.getText()+buttonright.getText();
                textDisplay.setText(btnRightText);
            }
        });
        buttonac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }
        });

        buttondel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String delText = textDisplay.getText();
                if (delText != null && !delText.isEmpty()) {
                    delText = delText.substring(0, delText.length() - 1);
                    textDisplay.setText(delText); // Update the text display
                }
            }
            });
        buttonplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText=buttonplus.getText();
                getOperator(btnText);
            }
        });
        buttonminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText=buttonminus.getText();
                getOperator(btnText);
            }
        });
        buttonmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText=buttonmul.getText();
                getOperator(btnText);
            }
        });
        buttondivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText=buttondivide.getText();
                getOperator(btnText);
            }
        });
        buttonsin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText=buttonsin.getText();
                getOperator(btnText);
            }
        });
        buttoncos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText=buttoncos.getText();
                getOperator(btnText);
            }
        });
        Buttontan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText=Buttontan.getText();
                getOperator(btnText);
            }
        });
        sinInvButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText=sinInvButton.getText();
                getOperator(btnText);
            }
        });
        cosInvButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText=cosInvButton.getText();
                getOperator(btnText);
            }
        });
        tanInvButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText=tanInvButton.getText();
                getOperator(btnText);
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        lnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cubertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a1XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        xXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        xNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
