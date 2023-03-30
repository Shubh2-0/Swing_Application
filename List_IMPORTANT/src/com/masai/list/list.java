package com.masai.list;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class list {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list window = new list();
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
	public list() {
		initialize();
	}
	
	DefaultListModel m = new DefaultListModel();
	private JList list;
	
	public void add(String value) {
		
		list.setModel(m);
		
		m.addElement(value);
	
		
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 826, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(219, 30, 274, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Roll Number : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(60, 32, 181, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				add(textField.getText());
				textField.setText(null);
				
				
			}
		});
		btnNewButton.setFont(new Font("Open Sans Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(545, 32, 122, 37);
		frame.getContentPane().add(btnNewButton);
		
		list = new JList();
		list.setVisibleRowCount(60);
		list.setFont(new Font("Cambria Math", Font.BOLD, 20));
		list.setBounds(79, 137, 274, 244);
		frame.getContentPane().add(list);
	}
}
