package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class NewEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsernameEmployee;
	private JTextField textFieldPasswordEmployee;
	private JButton ButtonRegisterMusicLive;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					NewEmployee frame = new NewEmployee();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public NewEmployee() {
		
		JFrame newemployee = new JFrame ();
		
		
	    
		newemployee.setTitle("Ultra Vision Midia");
		
		
		
		getContentPane().setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
		newemployee.setSize(new Dimension(800, 600));
		getContentPane().setSize(new Dimension(800, 660));
		getContentPane().setLayout(null);
		
		
		
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
		
		newemployee.validate();
		newemployee.repaint();
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getTextFieldUsernameEmployee() {
		return textFieldUsernameEmployee;
	}

	public void setTextFieldUsernameEmployee(JTextField textFieldUsernameEmployee) {
		this.textFieldUsernameEmployee = textFieldUsernameEmployee;
	}

	public JTextField getTextFieldPasswordEmployee() {
		return textFieldPasswordEmployee;
	}

	public void setTextFieldPasswordEmployee(JTextField textFieldPasswordEmployee) {
		this.textFieldPasswordEmployee = textFieldPasswordEmployee;
	}

	public JButton getButtonRegisterMusicLive() {
		return ButtonRegisterMusicLive;
	}

	public void setButtonRegisterMusicLive(JButton buttonRegisterMusicLive) {
		ButtonRegisterMusicLive = buttonRegisterMusicLive;
	}
	
}
