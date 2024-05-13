
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frmCalculator;								//Here are all the buttons that were created
	private JTextField textField;
	private JButton button0;
	private JButton button1;
	private JButton button4;
	private JButton button7;
	private JButton buttonRest;
	private JButton buttonClear;
	private JButton button8;
	private JButton button5;
	private JButton button2;
	private JButton buttonDot;
	private JButton buttonEqual;
	private JButton buttonPlus;
	private JButton button3;
	private JButton button6;
	private JButton buttonMinus;
	private JButton buttonDivide;
	private JButton button9;
	private JButton buttonDel;
	private JButton buttonTimes;
	private JButton buttonPlusMinus;
	
	double first;										//Just like the double used for to the calculations
	double second;
	double result;
	String operation;									//And the String to show the answer and do the operations
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton buttonPercent;

	public static void main(String[] args) {			//This part is related with the creation of the window created to run the calculator
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() { 													//Initialization of the calculator
		initialize();
	}

	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 408, 460);								//Size of the calculator
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vinicius' CALCULATOR");			//Label text
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));				//Label Font, type and size of the text
		lblNewLabel.setBounds(45, 11, 210, 14);								//Size of the Label
		frmCalculator.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();										//The text field where we can see our inputs and the output
		textField.setBounds(10, 36, 268, 48);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		button0 = new JButton("0");											//Creating the object of the button of number zero
		button0.setEnabled(false);											//It is enabled at first
		button0.addActionListener(new ActionListener() {					//Adding an action for the button
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button0.getText();	//Setting the button text to an variable to later do an operation 
				textField.setText(number);
			}
		});
		button0.setBounds(80, 360, 60, 48);								//Size and where the button is located in the calculator window
		frmCalculator.getContentPane().add(button0);								//Name of the variable of the button
		
		button1 = new JButton("1");
		button1.setEnabled(false);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button1.getText();
				textField.setText(number);
			}
		});
		button1.setBounds(10, 300, 60, 48);
		frmCalculator.getContentPane().add(button1);
		
		button4 = new JButton("4");
		button4.setEnabled(false);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button4.getText();
				textField.setText(number);
			}
		});
		button4.setBounds(10, 240, 60, 48);
		frmCalculator.getContentPane().add(button4);
		
		button7 = new JButton("7");
		button7.setEnabled(false);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button7.getText();
				textField.setText(number);
			}
		});
		button7.setBounds(10, 180, 60, 48);
		frmCalculator.getContentPane().add(button7);
		
		buttonRest = new JButton("%");
		buttonRest.setEnabled(false);
		buttonRest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";						//Defining the type of the operation
			}
		});
		buttonRest.setBounds(10, 120, 60, 48);
		frmCalculator.getContentPane().add(buttonRest);
		
		buttonClear = new JButton("C");
		buttonClear.setEnabled(false);
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);						//Setting the text Field as null
			}
		});
		buttonClear.setBounds(150, 120, 60, 48);
		frmCalculator.getContentPane().add(buttonClear);
		
		button8 = new JButton("8");
		button8.setEnabled(false);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button8.getText();
				textField.setText(number);
			}
		});
		button8.setBounds(80, 180, 60, 48);
		frmCalculator.getContentPane().add(button8);
		
		button5 = new JButton("5");
		button5.setEnabled(false);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button5.getText();
				textField.setText(number);
			}
		});
		button5.setBounds(80, 240, 60, 48);
		frmCalculator.getContentPane().add(button5);
		
		button2 = new JButton("2");
		button2.setEnabled(false);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button2.getText();
				textField.setText(number);
			}
		});
		button2.setBounds(80, 300, 60, 48);
		frmCalculator.getContentPane().add(button2);
		
		buttonDot = new JButton(".");
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + buttonDot.getText();
				textField.setText(number);
			}
		});
		buttonDot.setEnabled(false);
		buttonDot.setBounds(150, 360, 60, 48);
		frmCalculator.getContentPane().add(buttonDot);
		
		buttonEqual = new JButton("=");
		buttonEqual.setEnabled(false);
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText()); 		//Here is the code of what which operation should do with the numbers selected according with the  
				if (operation == "+") {									//operation selected
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} 
				else if (operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "/") {
					if (second == 0) {
						answer = String.format("Error!");
						textField.setText(answer);
					} else {
						result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					}
					
				}
				else if (operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "Percent"){
					result = (first / 100) * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		buttonEqual.setBounds(220, 360, 60, 48);
		frmCalculator.getContentPane().add(buttonEqual);
		
		buttonPlus = new JButton("+");
		buttonPlus.setEnabled(false);
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		buttonPlus.setBounds(220, 300, 60, 48);
		frmCalculator.getContentPane().add(buttonPlus);
		
		button3 = new JButton("3");
		button3.setEnabled(false);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button3.getText();
				textField.setText(number);
			}
		});
		button3.setBounds(150, 300, 60, 48);
		frmCalculator.getContentPane().add(button3);
		
		button6 = new JButton("6");
		button6.setEnabled(false);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button6.getText();
				textField.setText(number);
			}
		});
		button6.setBounds(150, 240, 60, 48);
		frmCalculator.getContentPane().add(button6);
		
		buttonMinus = new JButton("-");
		buttonMinus.setEnabled(false);
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		buttonMinus.setBounds(220, 240, 60, 48);
		frmCalculator.getContentPane().add(buttonMinus);
		
		buttonDivide = new JButton("/");
		buttonDivide.setEnabled(false);
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		buttonDivide.setBounds(80, 120, 60, 48);
		frmCalculator.getContentPane().add(buttonDivide);
		
		button9 = new JButton("9");
		button9.setEnabled(false);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button9.getText();
				textField.setText(number);
			}
		});
		button9.setBounds(150, 180, 60, 48);
		frmCalculator.getContentPane().add(button9);
		
		buttonDel = new JButton("\uF0E7");
		buttonDel.setEnabled(false);
		buttonDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String delete = null;
				
				if(textField.getText().length() > 0); {
					
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					delete = str.toString();
					textField.setText(delete);
				}
			}
		});
		buttonDel.setBounds(220, 120, 60, 48);
		frmCalculator.getContentPane().add(buttonDel);
		
		buttonTimes = new JButton("*");
		buttonTimes.setEnabled(false);
		buttonTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
				
			}
		});
		buttonTimes.setBounds(220, 180, 60, 48);
		frmCalculator.getContentPane().add(buttonTimes);
		
		buttonPercent = new JButton("Percent");
		buttonPercent.setEnabled(false);
		buttonPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "Percent";
			}
		});
		buttonPercent.setBounds(290, 120, 92, 48);
		frmCalculator.getContentPane().add(buttonPercent);
		
		JButton buttonPlusMinus = new JButton("+/-");
		buttonPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		buttonPlusMinus.setEnabled(false);
		buttonPlusMinus.setBounds(10, 360, 60, 48);
		frmCalculator.getContentPane().add(buttonPlusMinus);
		
		JRadioButton buttonON = new JRadioButton("ON");			//Creating the option to turn on the calculator
		buttonON.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				button1.setEnabled(true);						//Making all the button Enabled
				button2.setEnabled(true);
				button3.setEnabled(true);
				button4.setEnabled(true);
				button5.setEnabled(true);
				button6.setEnabled(true);
				button7.setEnabled(true);
				button8.setEnabled(true);
				button9.setEnabled(true);
				button0.setEnabled(true);
				buttonDel.setEnabled(true);
				buttonPlus.setEnabled(true);
				buttonMinus.setEnabled(true);
				buttonDivide.setEnabled(true);
				buttonTimes.setEnabled(true);
				buttonDot.setEnabled(true);
				buttonRest.setEnabled(true);
				buttonClear.setEnabled(true);
				buttonEqual.setEnabled(true);
				buttonPlusMinus.setEnabled(true);
				buttonPercent.setEnabled(true);
			}
		});
		buttonGroup.add(buttonON);
		buttonON.setBounds(10, 90, 70, 25);
		frmCalculator.getContentPane().add(buttonON);
		
		JRadioButton buttonOFF = new JRadioButton("OFF");			//Creating the option to turn off the calculator
		buttonOFF.setSelected(true);
		buttonOFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
				button1.setEnabled(false);						   	//Making all the button Enabled(False), so they will not work.
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				button0.setEnabled(false);
				buttonDel.setEnabled(false);
				buttonPlus.setEnabled(false);
				buttonMinus.setEnabled(false);
				buttonDivide.setEnabled(false);
				buttonTimes.setEnabled(false);
				buttonDot.setEnabled(false);
				buttonRest.setEnabled(false);
				buttonClear.setEnabled(false);
				buttonEqual.setEnabled(false);
				buttonPlusMinus.setEnabled(false);
				buttonPercent.setEnabled(false);
			}
		});
		buttonGroup.add(buttonOFF);
		buttonOFF.setBounds(80, 90, 70, 25);
		frmCalculator.getContentPane().add(buttonOFF);
		
		
		
	
	}
}
