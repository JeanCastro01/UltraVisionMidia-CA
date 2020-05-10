package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import controller.CustomerController;
import controller.EmployeeController;

public class NewEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsernameEmployee;
	private JTextField textFieldPasswordEmployee;
	private JButton ButtonRegisterMusicLive;
	private JFrame newemployee;

	// This window needs to know who the controller is
	private EmployeeController controllerInternalRef;

	public NewEmployee(EmployeeController controller) throws ParseException {

		// Putting the reference of the controller in the local reference
		this.controllerInternalRef = controller;

		// We encapsulated the building process of the window
		attributesSetter();

	}

	private void attributesSetter() throws ParseException {

		/**
		 * Launch the application.
		 */

		/**
		 * Create the frame.
		 */

		newemployee = new JFrame();

		newemployee.setTitle("Ultra Vision Midia");
		newemployee.setVisible(true);
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

		JLabel NewLabelEmployee = new JLabel("New Employee");
		NewLabelEmployee.setIcon(new ImageIcon(NewEmployee.class.getResource("/imagens/employee.png")));
		panel.add(NewLabelEmployee);

		textFieldUsernameEmployee = new JTextField();
		textFieldUsernameEmployee.setBounds(238, 120, 450, 26);
		contentPane.add(textFieldUsernameEmployee);
		textFieldUsernameEmployee.setColumns(10);

		textFieldPasswordEmployee = new JTextField();
		textFieldPasswordEmployee.setBounds(238, 178, 450, 26);
		contentPane.add(textFieldPasswordEmployee);
		textFieldPasswordEmployee.setColumns(10);

		JLabel textFieldEmployeeUsername = new JLabel("Username");
		textFieldEmployeeUsername.setBounds(93, 125, 110, 16);
		contentPane.add(textFieldEmployeeUsername);

		JLabel textFieldEmployeePassword = new JLabel("Password");
		textFieldEmployeePassword.setBounds(93, 183, 98, 16);
		contentPane.add(textFieldEmployeePassword);

		ButtonRegisterMusicLive = new JButton("Register");
		ButtonRegisterMusicLive.setBounds(238, 241, 117, 29);
		contentPane.add(ButtonRegisterMusicLive);
		ButtonRegisterMusicLive.addActionListener((ActionListener) controllerInternalRef);
		ButtonRegisterMusicLive.setActionCommand("Register");

		newemployee.validate();
		newemployee.repaint();
	}

	public String getTextFieldUsernameEmployee() {

		String username = textFieldUsernameEmployee.getText();
		return username;
	}

	public String getTextFieldPasswordEmployee() {

		String password = textFieldPasswordEmployee.getText();
		return password;
	}

	public JButton getButtonRegisterMusicLive() {
		return ButtonRegisterMusicLive;
	}

}
