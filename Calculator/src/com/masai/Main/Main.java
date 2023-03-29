package com.masai.Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Trebuchet MS", Font.BOLD, 28));
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 27));
		textField.setBounds(176, 172, 170, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		textField_1.setColumns(10);
		textField_1.setBounds(743, 172, 170, 40);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Addition");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = 0;
				int n2 = 0;
				
				try {
					
					n = Integer.parseInt(textField.getText());
					n2 = Integer.parseInt(textField_1.getText());
					String result = (n+n2)+"";
					
					txtAnswer.setText(result);
					
					textField.setText(null);
					textField_1.setText(null);
					
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
					textField.setText(null);
					textField_1.setText(null);
					txtAnswer.setText("Answer");
				}
				
				
			
				
				
			}
		});
		btnNewButton.setBounds(54, 299, 164, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSubstraction = new JButton("Subtraction");
		btnSubstraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n = 0;
				int n2 = 0;
				
				try {
					
					n = Integer.parseInt(textField.getText());
					n2 = Integer.parseInt(textField_1.getText());
					String result = (n-n2)+"";
					
					txtAnswer.setText(result);
					
					textField.setText(null);
					textField_1.setText(null);
					
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
					textField.setText(null);
					textField_1.setText(null);
					txtAnswer.setText("Answer");
				}
				
				
			}
		});
		btnSubstraction.setFont(new Font("Arial", Font.BOLD, 20));
		btnSubstraction.setBackground(new Color(0, 128, 255));
		btnSubstraction.setBounds(54, 383, 164, 40);
		frame.getContentPane().add(btnSubstraction);
		
		JButton btnMultiplication = new JButton("Multiplication");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n = 0;
				int n2 = 0;
				
				try {
					
					n = Integer.parseInt(textField.getText());
					n2 = Integer.parseInt(textField_1.getText());
					String result = (n*n2)+"";
					
					txtAnswer.setText(result);
					
					textField.setText(null);
					textField_1.setText(null);
					
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
					textField.setText(null);
					textField_1.setText(null);
					txtAnswer.setText("Answer");
				}
				
				
			}
		});
		btnMultiplication.setFont(new Font("Arial", Font.BOLD, 20));
		btnMultiplication.setBackground(new Color(0, 128, 255));
		btnMultiplication.setBounds(54, 467, 164, 40);
		frame.getContentPane().add(btnMultiplication);
		
		JButton btnDivsion = new JButton("Division");
		btnDivsion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n = 0;
				int n2 = 0;
				
				try {
					
					n = Integer.parseInt(textField.getText());
					n2 = Integer.parseInt(textField_1.getText());
					String result = (n+n2)+"";
					
					txtAnswer.setText(result);
					
					textField.setText(null);
					textField_1.setText(null);
					
					if(n2==0) {
						txtAnswer.setText("Not Valid");
						JOptionPane.showMessageDialog(null, "Number 2 not be 0");
						txtAnswer.setText("Anwser");
					}else {
						
						txtAnswer.setText((n/n2)+"");
						
					}
					
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
					textField.setText(null);
					textField_1.setText(null);
					txtAnswer.setText("Answer");
				}
				
				
				
	
				
				
				
				
			}
		});
		btnDivsion.setFont(new Font("Arial", Font.BOLD, 20));
		btnDivsion.setBackground(new Color(0, 128, 255));
		btnDivsion.setBounds(54, 552, 164, 40);
		frame.getContentPane().add(btnDivsion);
		
		txtAnswer = new JTextField();
		txtAnswer.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAnswer.setText("Answer");
		txtAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		txtAnswer.setBounds(536, 407, 319, 54);
		frame.getContentPane().add(txtAnswer);
		txtAnswer.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First Number : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(11, 176, 155, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSecondNumber = new JLabel("Second Number : ");
		lblSecondNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSecondNumber.setBounds(536, 174, 197, 40);
		frame.getContentPane().add(lblSecondNumber);
		
		JLabel lblNewLabel_1 = new JLabel("Calculator");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 40));
		lblNewLabel_1.setBounds(258, 34, 397, 99);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 945, 693);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
