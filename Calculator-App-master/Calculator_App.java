package com.calculatorjava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Calculator_App {

    private double total = 0.0;
    private double total_eva = 0.0;
    private char math_operator;
    private double memory = 0.0;


    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    private void operator(String btnText) {
        math_operator = btnText.charAt(0);
        total = total + Double.parseDouble(cal_screen.getText());
        cal_screen.setText("");
    }

    private int fact(int n) {
        int fact = 1;
        for(int i=2; i<=n; i++) {
            fact = fact*i;
        }
        return fact;
    }

    private JPanel mainPanel;
    private JTextField cal_screen;
    private JButton evaluate;
    private JButton addition;
    private JButton substraction;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a9Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a0Button;
    private JButton multiplication;
    private JButton a6Button;
    private JButton a3Button;
    private JButton dotButton;
    private JButton a10XButton;
    private JButton lg10Button;
    private JButton eButton;
    private JButton piButton;
    private JButton divide;
    private JButton percentage;
    private JButton plusMinus;
    private JButton ACButton;
    private JButton x2Button;
    private JButton x3Button;
    private JButton xYButton;
    private JButton eXButton;
    private JButton a1XButton;
    private JButton factorial;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton sqrtButton;
    private JButton sinhButton;
    private JButton coshButton;
    private JButton tanhButton;
    private JButton crootButton;
    private JButton rightParenthesisButton;
    private JButton leftParenthesisButton;
    private JButton radButton;
    private JButton a2ndButton;
    private JButton mcButton;
    private JButton maddButton;
    private JButton yXButton;
    private JButton lnButton;
    private JButton mrButton;
    private JButton EEButton;
    private JButton randButton;
    private JButton msubtractButton;






    public Calculator_App() {
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String zero = cal_screen.getText() + a0Button.getText();
                cal_screen.setText(zero);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String one = cal_screen.getText() + a1Button.getText();
                cal_screen.setText(one);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String two = cal_screen.getText() + a2Button.getText();
                cal_screen.setText(two);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String three = cal_screen.getText() + a3Button.getText();
                cal_screen.setText(three);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String four = cal_screen.getText() + a4Button.getText();
                cal_screen.setText(four);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String five = cal_screen.getText() + a5Button.getText();
                cal_screen.setText(five);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String six = cal_screen.getText() + a6Button.getText();
                cal_screen.setText(six);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String seven = cal_screen.getText() + a7Button.getText();
                cal_screen.setText(seven);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String eight = cal_screen.getText() + a8Button.getText();
                cal_screen.setText(eight);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nine = cal_screen.getText() + a9Button.getText();
                cal_screen.setText(nine);
            }
        });
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(cal_screen.getText().equals("")) {
                    cal_screen.setText("0.");
                } else if(cal_screen.getText().contains(".")) {
                    dotButton.setEnabled(false);
                } else {
                    String dot = cal_screen.getText() + dotButton.getText();
                    cal_screen.setText(dot);
                }
                dotButton.setEnabled(true);
            }
        });
        evaluate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                switch (math_operator) {
                    case '+':
                        total_eva = total + Double.parseDouble(cal_screen.getText());
                        break;
                    case '-':
                        total_eva = total - Double.parseDouble(cal_screen.getText());
                        break;
                    case '×':
                        total_eva = total * Double.parseDouble(cal_screen.getText());
                        break;
                    case '÷':
                        total_eva = total / Double.parseDouble(cal_screen.getText());
                        break;
                    case '%':
                        total_eva = total * Double.parseDouble(cal_screen.getText()) / 100;
                        break;
                    case '^':
                        total_eva = Math.pow(total,Double.parseDouble(cal_screen.getText()));
                        break;
                    case 'P':
                        int n = (int) total;
                        int r = Integer.parseInt(cal_screen.getText());

                        int uppart_part = fact(n);
                        int lower_part = fact(n-r);
                        Double ans = Double.parseDouble(String.valueOf(uppart_part/lower_part));
                        total_eva = ans;
                        break;
                    case 'C':
                        int n1 = (int) total;
                        int r1= Integer.parseInt(cal_screen.getText());

                        int uppar = fact(n1);
                        int lower = fact(r1)*fact(n1-r1);
                        Double ans1 = Double.parseDouble(String.valueOf(uppar/lower));
                        total_eva = ans1;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + math_operator);
                }
                cal_screen.setText(Double.toString(total_eva));
                total = 0;
                evaluate.setBackground(Color.ORANGE);
            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total_eva = 0;
                cal_screen.setText("");
            }
        });
        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String add = addition.getText();
                operator(add);
            }
        });
        substraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String sub = substraction.getText();
                operator(sub);
            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String mul = multiplication.getText();
                operator(mul);
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String div = divide.getText();
                operator(div);
            }
        });
        percentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String per = percentage.getText();
                operator(per);
            }
        });
        plusMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double plusMinus = Double.parseDouble(cal_screen.getText());
                Double pm = (-1 *  plusMinus);
                cal_screen.setText(Double.toString(pm));
            }
        });
        x2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double input = Double.parseDouble(cal_screen.getText());
                Double square = input*input;
                cal_screen.setText(Double.toString(square));
            }
        });
        x3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double input = Double.parseDouble(cal_screen.getText());
                Double cube = input*input*input;
                cal_screen.setText(Double.toString(cube));
            }
        });
        sinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double degree = Double.parseDouble(cal_screen.getText());
                double radian = Math.toRadians(degree);
                double sinAns = Math.sin(radian);
                cal_screen.setText(Double.toString(sinAns));
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double degree = Double.parseDouble(cal_screen.getText());
                double radian = Math.toRadians(degree);
                double cosAns = Math.cos(radian);
                cal_screen.setText(Double.toString(cosAns));
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double degree = Double.parseDouble(cal_screen.getText());
                double radian = Math.toRadians(degree);
                double tanAns = Math.tan(radian);
                cal_screen.setText(Double.toString(tanAns));
            }
        });
        eXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double exp1 = Double.parseDouble(cal_screen.getText());
                Double expAns = Math.exp(exp1);
                cal_screen.setText(Double.toString(expAns));
            }
        });
        sinhButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double input = Double.parseDouble(cal_screen.getText());
                Double sinhAns = Math.sinh(input);
                cal_screen.setText(Double.toString(sinhAns));
            }
        });
        coshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double input = Double.parseDouble(cal_screen.getText());
                Double coshAns = Math.cosh(input);
                cal_screen.setText(Double.toString(coshAns));
            }
        });
        tanhButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double input = Double.parseDouble(cal_screen.getText());
                Double tanhAns = Math.tanh(input);
                cal_screen.setText(Double.toString(tanhAns));
            }
        });
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double input = Double.parseDouble(cal_screen.getText());
                Double sqrtAns = Math.sqrt(input);
                cal_screen.setText(Double.toString(sqrtAns));
            }
        });
        a1XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double input = Double.parseDouble(cal_screen.getText());
                Double inverse = 1/input;
                cal_screen.setText(Double.toString(inverse));
            }
        });
        a10XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double input = Double.parseDouble(cal_screen.getText());
                Double tenPower = Math.pow(10, input);
                cal_screen.setText(Double.toString(tenPower));
            }
        });
        lg10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double input = Double.parseDouble(cal_screen.getText());
                Double log10 = Math.log10(input);
                cal_screen.setText(Double.toString(log10));
            }
        });

        piButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double piValue;
                if(cal_screen.getText().equals("")) {
                    piValue = Math.PI;
                } else {
                    piValue = Double.parseDouble(cal_screen.getText()) * Math.PI;
                }
                cal_screen.setText(String.valueOf(piValue));
            }
        });
        eButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double expon;
                if(cal_screen.getText().equals("")) {
                    expon = Math.exp(1);
                } else {
                    expon = Double.parseDouble(cal_screen.getText()) * Math.exp(1);
                }
                cal_screen.setText(String.valueOf(expon));
            }
        });
        factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int input = Integer.parseInt(cal_screen.getText());
                double fact = 1;
                if(input == 0) {
                    fact = 1;
                } else {
                    for(int i=input; i>=1; i--) {
                        fact *= i;
                    }
                }
                cal_screen.setText(Double.toString(fact));
            }
        });
        xYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String XresToY = xYButton.getText();
                operator(XresToY);
            }
        });
        crootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double input = Double.parseDouble(cal_screen.getText());
                Double cubeRoot = Math.cbrt(input);
                cal_screen.setText(Double.toString(cubeRoot));
            }
        });

        leftParenthesisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String currentText = cal_screen.getText();
                cal_screen.setText(currentText + ")");
            }
        });
        rightParenthesisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String currentText = cal_screen.getText();
                cal_screen.setText(currentText + "(");
            }
        });
        lnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double input = Double.parseDouble(cal_screen.getText());
                Double lnAns = Math.log(input);
                cal_screen.setText(Double.toString(lnAns));
            }
        });


        mrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String inputText = cal_screen.getText();
                if (!inputText.isEmpty()) {
                    try {
                        double currentMemoryValue = Double.parseDouble(inputText);
                        memory = currentMemoryValue;
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        });


        mcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                memory = 0.0;
            }
        });
        msubtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String inputText = cal_screen.getText();
                if (!inputText.isEmpty()) {
                    try {
                        double currentMemoryValue = Double.parseDouble(inputText);

                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        });


        maddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String inputText = cal_screen.getText();
                if (!inputText.isEmpty()) {
                    try {
                        double currentMemoryValue = Double.parseDouble(inputText);

                    } catch (NumberFormatException e) {

                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                }

            }
        });

        randButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Your logic for generating a random number (Rand)
                double randomValue = new Random().nextDouble();
                cal_screen.setText(Double.toString(randomValue));
            }
        });

        radButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Your logic for converting degrees to radians (Rad)
                double degrees = Double.parseDouble(cal_screen.getText());
                double radians = Math.toRadians(degrees);
                cal_screen.setText(Double.toString(radians));
            }
        });

        EEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String currentText = cal_screen.getText();
                cal_screen.setText(currentText + "E");
            }
        });
        yXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double x = Double.parseDouble(cal_screen.getText());
                double result = Math.sqrt(x);
                cal_screen.setText(Double.toString(result));
            }
        });





    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator_App");
        frame.setContentPane(new Calculator_App().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
