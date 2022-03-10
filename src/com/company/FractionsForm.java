package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FractionsForm extends JFrame{
    private JPanel rootPanel;
    private JTextField aNumerator;
    private JTextField bNumerator;
    private JTextField aDenominator;
    private JTextField bDenominator;
    private JTextField resultNumerator;
    private JTextField resultDenominator;
    private JComboBox comboBox;
    private JButton button;

    public FractionsForm() {
        setBounds(300,300,300,300);
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        comboBox.addItem("+");
        comboBox.addItem("-");
        comboBox.addItem("*");
        comboBox.addItem("/");
        setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(aNumerator.getText());
                int b = Integer.parseInt(aDenominator.getText());
                int c = Integer.parseInt(bNumerator.getText());
                int d = Integer.parseInt(bDenominator.getText());

                //создадим дроби
                Fraction fraction1 = new Fraction(a,b);
                Fraction fraction2 = new Fraction(c,d);

                //вычислим и запишем результат в поля результата
                if (comboBox.getItemAt(comboBox.getSelectedIndex()).equals("+")){
                    resultNumerator.setText(Fraction.sum(fraction1,fraction2).getNumerator() + "");
                    resultDenominator.setText(Fraction.sum(fraction1,fraction2).getDenominator() + "");
                }

                if (comboBox.getItemAt(comboBox.getSelectedIndex()).equals("*")){
                    resultNumerator.setText(Fraction.umnogenie(fraction1,fraction2).getNumerator() + "");
                    resultDenominator.setText(Fraction.umnogenie(fraction1,fraction2).getDenominator() + "");
                }

                if (comboBox.getItemAt(comboBox.getSelectedIndex()).equals("-")){
                    resultNumerator.setText(Fraction.minus(fraction1,fraction2).getNumerator() + "");
                    resultDenominator.setText(Fraction.minus(fraction1,fraction2).getDenominator() + "");
                }

                if (comboBox.getItemAt(comboBox.getSelectedIndex()).equals("/")){
                    resultNumerator.setText(Fraction.delenie(fraction1,fraction2).getNumerator() + "");
                    resultDenominator.setText(Fraction.delenie(fraction1,fraction2).getDenominator() + "");
                }
            }
        });
    }
}
