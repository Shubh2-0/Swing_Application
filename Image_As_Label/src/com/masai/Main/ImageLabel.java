package com.masai.Main;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImageLabel {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageLabel window = new ImageLabel();
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
	public ImageLabel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 943, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 35));
		lblNewLabel.setBounds(351, 42, 358, 141);
		frame.getContentPane().add(lblNewLabel);
		ImageIcon img1 = new ImageIcon(getClass().getResource("/images/user2.png"));
		Image i1 = img1.getImage();
		Image new_image1 = i1.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		img1 = new ImageIcon(new_image1);
		lblNewLabel.setIcon(img1);
		
		
		lblNewLabel_1 = new JLabel("Username  :");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1.setBounds(47, 193, 223, 53);
		frame.getContentPane().add(lblNewLabel_1);
		img1 = new ImageIcon(getClass().getResource("/images/user.png"));
		i1 = img1.getImage();
		new_image1 = i1.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		img1 = new ImageIcon(new_image1);
		lblNewLabel_1.setIcon(img1);
		
		
		JLabel lblNewLabel_2 = new JLabel("Password  :");
		ImageIcon img = new ImageIcon(getClass().getResource("/images/password.png"));
		Image i = img.getImage();
		Image new_image = i.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		img = new ImageIcon(new_image);
		
		lblNewLabel_2.setIcon(img);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2.setBounds(47, 310, 223, 51);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(302, 193, 452, 54);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(302, 309, 452, 54);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"Your User name is : "+ textField.getText()+"\n Password is : "+textField_1.getText());
				
			}
		});
		btnNewButton.setFont(new Font("Inter Black", Font.BOLD, 35));
		btnNewButton.setBounds(386, 444, 210, 60);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}
}
