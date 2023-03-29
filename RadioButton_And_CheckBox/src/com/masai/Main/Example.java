package com.masai.Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example {

	private JFrame frame;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example window = new Example();
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
	public Example() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 672, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Examples of Radio Buttons And Check Boxs");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Open Sans Semibold", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 10, 638, 72);
		frame.getContentPane().add(lblNewLabel);
		
		chckbxNewCheckBox = new JCheckBox("Checkbox 1");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxNewCheckBox.isSelected()) {
					
					chckbxNewCheckBox_1.setSelected(false);
					chckbxNewCheckBox_2.setSelected(false);
					chckbxNewCheckBox_3.setSelected(false);
					
				
					
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		chckbxNewCheckBox.setBounds(58, 159, 179, 40);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("Checkbox 2");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxNewCheckBox_1.isSelected()) {
					
					chckbxNewCheckBox.setSelected(false);
					chckbxNewCheckBox_2.setSelected(false);
					chckbxNewCheckBox_3.setSelected(false);
					
				
					
				}
				
			}
		});
		chckbxNewCheckBox_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		chckbxNewCheckBox_1.setBounds(58, 230, 126, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("Checkbox 3");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxNewCheckBox_2.isSelected()) {
					
					chckbxNewCheckBox.setSelected(false);
					chckbxNewCheckBox_1.setSelected(false);
					chckbxNewCheckBox_3.setSelected(false);
					
				
					
				}
				
			}
		});
		chckbxNewCheckBox_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		chckbxNewCheckBox_2.setBounds(58, 287, 126, 21);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		chckbxNewCheckBox_3 = new JCheckBox("Checkbox 4");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxNewCheckBox_3.isSelected()) {
					
					
					chckbxNewCheckBox.setSelected(false);
					chckbxNewCheckBox_1.setSelected(false);
					chckbxNewCheckBox_2.setSelected(false);
					
				
					
				}
				
				
			}
		});
		chckbxNewCheckBox_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		chckbxNewCheckBox_3.setBounds(58, 355, 126, 21);
		frame.getContentPane().add(chckbxNewCheckBox_3);
		
		rdbtnNewRadioButton = new JRadioButton("Radio buttonn 1");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNewRadioButton.isSelected()) {
					
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
					
				}
				
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.ITALIC, 16));
		rdbtnNewRadioButton.setBounds(427, 168, 165, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Radio button 2");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNewRadioButton_1.isSelected()) {
					
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
					
				}
				
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
		rdbtnNewRadioButton_1.setBounds(427, 229, 165, 22);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Radio button 3");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNewRadioButton_2.isSelected()) {
					
					
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
					
				}
				
			}
		});
		rdbtnNewRadioButton_2.setFont(new Font("Arial Black", Font.ITALIC, 16));
		rdbtnNewRadioButton_2.setBounds(427, 289, 165, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Radio button 4");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNewRadioButton_3.isSelected()) {
					
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					
				}
			}
		});
		rdbtnNewRadioButton_3.setFont(new Font("Arial Black", Font.ITALIC, 16));
		rdbtnNewRadioButton_3.setBounds(427, 357, 165, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
	}
}
