package com.masai.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class ComboBox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox window = new ComboBox();
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
	public ComboBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 747, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Combo Box Example");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(137, 27, 486, 81);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.addItem("Maths");
		comboBox.addItem("Commerce");
		comboBox.addItem("Arts");
		comboBox.addItem("Bio");
		
		
		comboBox.setBounds(287, 155, 165, 45);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Select Subject : ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(58, 153, 231, 45);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
