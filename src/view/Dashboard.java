package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JMenuItem;

public class Dashboard extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Dashboard frame = new Dashboard();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		
//	}

	/**
	 * Create the frame.
	 */
	public Dashboard()  {
		
		
		
		JFrame dashboard = new JFrame();
		

		dashboard.setTitle("Ulta Vision Midia");
		dashboard.setVisible(true);
		
		contentPane = new JPanel();
		dashboard.setContentPane(contentPane);
		contentPane.setBackground(Color.BLACK);
		getContentPane().setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
		dashboard.setSize(new Dimension(800, 600));
		getContentPane().setSize(new Dimension(800, 660));
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Dashboard.class.getResource("/imagens/ULtrAVISION.png")));
		lblNewLabel_1.setBounds(143, 48, 565, 360);
		contentPane.add(lblNewLabel_1);
		
		
		contentPane = new JPanel();
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("ProgressBar.foreground"));
		panel.setBounds(64, 6, 629, 437);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Dashboard.class.getResource("/imagens/ULtrAVISION.png")));
		panel.add(lblNewLabel);
		//contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		dashboard.setJMenuBar(menuBar);
		//contentPane.add(menuBar);
		
		JMenu JMenuRent = new JMenu("Rent");
		JMenuRent.setIcon(new ImageIcon(Dashboard.class.getResource("/imagens/homepage2-removebg-preview.png")));
		menuBar.add(JMenuRent);
		//contentPane.add(JMenuRent);
		
		JMenuItem MenuItemMusicLive = new JMenuItem("Music Live");
		JMenuRent.add(MenuItemMusicLive);
		//contentPane.add(MenuItemMusicLive);
		
		JMenuItem MenuItemMovie = new JMenuItem("Movie");
		JMenuRent.add(MenuItemMovie);
		//contentPane.add(MenuItemMovie);
		
		JMenuItem MenuItemTVBox = new JMenuItem("TVBox");
		JMenuRent.add(MenuItemTVBox);
		//contentPane.add(MenuItemTVBox);
		
		JMenuItem JMenuItemLiveConcert = new JMenuItem("Live Concert");
		JMenuRent.add(JMenuItemLiveConcert);
		//contentPane.add(JMenuItemLiveConcert);
		
		JMenu JMenuRegister = new JMenu("Register");
		menuBar.add(JMenuRegister);
		//contentPane.add(JMenuRegister);
		
		JMenuItem JMenuItemNewCustomer = new JMenuItem("New Customer");
		JMenuRegister.add(JMenuItemNewCustomer);
		//contentPane.add(JMenuItemNewCustomer);
		JMenuItemNewCustomer.setActionCommand("New Customer");
        JMenuItemNewCustomer.addActionListener((ActionListener) this);

		
		JMenuItem JMenuItemNewMusicLive = new JMenuItem("New MusicLive");
		JMenuRegister.add(JMenuItemNewMusicLive);
		//contentPane.add(JMenuItemNewMusicLive);
		
		JMenuItem JMenuItemNewMovie = new JMenuItem("New Movie");
		JMenuRegister.add(JMenuItemNewMovie);
		//contentPane.add(JMenuItemNewMovie);
		
		JMenuItem JMenuItemTVBox = new JMenuItem("New TVBox");
		JMenuRegister.add(JMenuItemTVBox);
		//contentPane.add(JMenuItemTVBox);
		
		JMenuItem JMenuItemNewEmployee = new JMenuItem("New Employee");
		JMenuRegister.add(JMenuItemNewEmployee);
		//contentPane.add(JMenuItemNewEmployee);
		
		JMenu JMenuLoyaltyCard = new JMenu("Loyalty Card");
		menuBar.add(JMenuLoyaltyCard);
		//contentPane.add(JMenuLoyaltyCard);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New Loyalty Card");
		JMenuLoyaltyCard.add(mntmNewMenuItem);
		//contentPane.add(mntmNewMenuItem);
	
		
         
 		dashboard.validate();
 		dashboard.repaint();
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
