import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.bind.ParseConversionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {
	private double total1 = 0.0;
	private double total2 = 0.0;
	private char operator;

	private JPanel contentPane;
	private JTextField mainScreen;

	private void getOperator(String btnText) {
		operator = btnText.charAt(0);
		total1 = total1 + Double.parseDouble(mainScreen.getText());
		mainScreen.setText("");
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		setTitle("Sarandi's Calculator");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		mainScreen = new JTextField();
		mainScreen.setBounds(239, 47, 294, 83);
		contentPane.add(mainScreen);
		mainScreen.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBounds(50, 174, 680, 450);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnSeven = mainScreen.getText() + btn7.getText();
				String mainScreen1 = mainScreen.getText();
				mainScreen.setText(btnSeven);

			}
		});
		btn7.setBounds(36, 72, 129, 67);
		panel.add(btn7);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String btnFour = mainScreen.getText() + btn4.getText();
				String mainScreen1 = mainScreen.getText();
				mainScreen.setText(btnFour);
			}
		});
		btn4.setBounds(36, 165, 129, 67);
		panel.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnFive = mainScreen.getText() + btn5.getText();
				String mainScreen1 = mainScreen.getText();
				mainScreen.setText(btnFive);
			}
		});
		btn5.setBounds(227, 165, 129, 67);
		panel.add(btn5);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String btnEight = mainScreen.getText() + btn8.getText();
				String mainScreen1 = mainScreen.getText();
				mainScreen.setText(btnEight);
			}
		});
		btn8.setBounds(227, 72, 129, 67);
		panel.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnNine = mainScreen.getText() + btn9.getText();
				String mainScreen1 = mainScreen.getText();
				mainScreen.setText(btnNine);
			}
		});
		btn9.setBounds(398, 72, 129, 67);
		panel.add(btn9);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnSix = mainScreen.getText() + btn6.getText();
				String mainScreen1 = mainScreen.getText();
				mainScreen.setText(btnSix);
			}
		});
		btn6.setBounds(398, 165, 129, 67);
		panel.add(btn6);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnOne = mainScreen.getText() + btn1.getText();
				String mainScreen1 = mainScreen.getText();
				mainScreen.setText(btnOne);
			}
		});
		btn1.setBounds(36, 272, 129, 67);
		panel.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnTwo = mainScreen.getText() + btn2.getText();
				String mainScreen1 = mainScreen.getText();
				mainScreen.setText(btnTwo);
			}
		});
		btn2.setBounds(227, 272, 129, 67);
		panel.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String btnThree = mainScreen.getText() + btn3.getText();
				String mainScreen1 = mainScreen.getText();
				mainScreen.setText(btnThree);
			}
		});
		btn3.setBounds(398, 272, 129, 67);
		panel.add(btn3);

		JButton btnDia = new JButton("/");
		btnDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_text = btnDia.getText();
				getOperator(button_text);

			}
		});
		btnDia.setBounds(566, 72, 88, 67);
		panel.add(btnDia);

		JButton btnEpi = new JButton("*");
		btnEpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_text = btnEpi.getText();
				getOperator(button_text);
			}
		});
		btnEpi.setBounds(566, 165, 88, 67);
		panel.add(btnEpi);

		JButton btnSin = new JButton("+");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_text = btnSin.getText();
				getOperator(button_text);

			}
		});
		btnSin.setBounds(566, 272, 88, 67);
		panel.add(btnSin);

		JButton btnPlin = new JButton("-");
		btnPlin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_text = btnPlin.getText();
				getOperator(button_text);
			}
		});
		btnPlin.setBounds(566, 370, 88, 67);
		panel.add(btnPlin);

		JButton btnIson = new JButton("=");
		btnIson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * total2=total1+Double.parseDouble(mainScreen.getText());
				 * mainScreen.setText(Double.toString(total2)); //total1=0;
				 */
				switch (operator) {
				case '+':
					total2 = total1 + Double.parseDouble(mainScreen.getText());
					break;
				case '-':
					total2 = total1 - Double.parseDouble(mainScreen.getText());
					break;
				case '*':
					total2 = total1 * Double.parseDouble(mainScreen.getText());
					break;
				case '/':
					total2 = total1 / Double.parseDouble(mainScreen.getText());
					break;
				default:
					break;
				}
				mainScreen.setText(Double.toString(total2));
			}
		});
		btnIson.setBounds(398, 370, 129, 67);
		panel.add(btnIson);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnZero = mainScreen.getText() + btn0.getText();
				String mainScreen1 = mainScreen.getText();
				mainScreen.setText(btnZero);
			}
		});
		btn0.setBounds(227, 370, 129, 67);
		panel.add(btn0);

		JButton btnTeleia = new JButton(".");
		btnTeleia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnTeleiaTel = mainScreen.getText() + btnTeleia.getText();
				String mainScreen1 = mainScreen.getText();
				mainScreen.setText(btnTeleiaTel);
			}
		});
		btnTeleia.setBounds(36, 370, 129, 67);
		panel.add(btnTeleia);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total1 = 0;
				total2 = 0;
				mainScreen.setText("");
			}
		});
		btnClear.setBounds(227, 7, 216, 46);
		panel.add(btnClear);
	}
}
