package com.esprit.naturespirit.interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Auth extends JFrame {
	private JTextField tfUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Auth frame = new Auth();
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
	public Auth() {
		getContentPane().setBackground(new Color(204, 255, 204));
		setTitle("Authentication");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(105, 78, 76, 14);
		getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(105, 126, 71, 14);
		getContentPane().add(lblPassword);
		
		tfUsername = new JTextField();
		tfUsername.setBounds(224, 75, 86, 20);
		getContentPane().add(tfUsername);
		tfUsername.setColumns(10);
		
		JButton btnCnx = new JButton("Connexion");
		btnCnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCnx.setBounds(110, 207, 89, 23);
		getContentPane().add(btnCnx);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(209, 207, 89, 23);
		getContentPane().add(btnReset);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(224, 123, 86, 23);
		getContentPane().add(passwordField);
	}
}
