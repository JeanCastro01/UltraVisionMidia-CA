package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.CustomerController;
import controller.LoginController;

public class Login extends JFrame {


	private JPanel contentPane;
	private JTextField textFieldUsernameEmployee;
	private JPasswordField textFieldPasswordEmployee;
	private JButton ButtonLogin;
	private JFrame newemployee;

	// This window needs to know who the controller is
	// This window needs to know who the controller is
	private LoginController controllerInternalRef;

	public Login(LoginController controller) throws ParseException {

		// Putting the reference of the controller in the local reference
		this.controllerInternalRef = controller;

		// We encapsulated the building process of the window
		attributesSetter();

	}

	private void attributesSetter() throws ParseException {
	

	

		newemployee = new JFrame();

		newemployee.setTitle("Ultra Vision Midia");
		newemployee.setVisible(true);
		newemployee.setSize(new Dimension(800, 600));
		newemployee.setLocationRelativeTo(null);
		newemployee.setResizable(false);

		newemployee.setSize(new Dimension(800, 600));

		contentPane = new JPanel();
		contentPane.setSize(new Dimension(800, 600));
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		newemployee.setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 6, 788, 94);
		contentPane.add(panel);

		JLabel NewLabelEmployee = new JLabel("Login");
		NewLabelEmployee.setIcon(new ImageIcon(NewEmployee.class.getResource("/imagens/employee.png")));
		panel.add(NewLabelEmployee);

		textFieldUsernameEmployee = new JTextField();
		textFieldUsernameEmployee.setBounds(238, 120, 450, 26);
		contentPane.add(textFieldUsernameEmployee);
		textFieldUsernameEmployee.setColumns(10);

		textFieldPasswordEmployee = new JPasswordField();
		textFieldPasswordEmployee.setBounds(238, 178, 450, 26);
		contentPane.add(textFieldPasswordEmployee);
		textFieldPasswordEmployee.setColumns(10);

		JLabel textFieldEmployeeUsername = new JLabel("Username");
		textFieldEmployeeUsername.setBounds(93, 125, 110, 16);
		contentPane.add(textFieldEmployeeUsername);

		JLabel textFieldEmployeePassword = new JLabel("Password");
		textFieldEmployeePassword.setBounds(93, 183, 98, 16);
		contentPane.add(textFieldEmployeePassword);

		ButtonLogin = new JButton("Log In");
		ButtonLogin.setBounds(238, 241, 117, 29);
		contentPane.add(ButtonLogin);
		ButtonLogin.addActionListener((ActionListener) controllerInternalRef);
		ButtonLogin.setActionCommand("login");

		newemployee.validate();
		newemployee.repaint();
	}

	public JButton getButtonRegisterMusicLive() {
		return ButtonLogin;
	}

	public String getTextFieldUsernameEmployee() {
		return textFieldUsernameEmployee.getText();
	}

	public String getTextFieldPasswordEmployee() {
		return textFieldPasswordEmployee.getText();
	}

}