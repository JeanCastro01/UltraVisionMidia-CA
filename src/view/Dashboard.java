package view;

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

public class Dashboard extends JFrame {
	
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
	public Dashboard() {
		
		
		
		JFrame dashboard = new JFrame();
		
		dashboard.setTitle("Ulta Vision Midia");
		dashboard.setVisible(true);
		
		getContentPane().setBackground(UIManager.getColor("ProgressBar.selectionForeground"));
		dashboard.setSize(new Dimension(800, 600));
		getContentPane().setSize(new Dimension(800, 660));
		getContentPane().setLayout(null);
		dashboard.setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("ProgressBar.foreground"));
		panel.setBounds(64, 6, 629, 437);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Dashboard.class.getResource("/imagens/ULtrAVISION.png")));
		panel.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu JMenuRent = new JMenu("Rent");
		JMenuRent.setIcon(new ImageIcon(Dashboard.class.getResource("/imagens/homepage2.png")));
		menuBar.add(JMenuRent);
		
		JMenuItem MenuItemMusicLive = new JMenuItem("Music Live");
		JMenuRent.add(MenuItemMusicLive);
		
		JMenuItem MenuItemMovie = new JMenuItem("Movie");
		JMenuRent.add(MenuItemMovie);
		
		JMenuItem MenuItemTVBox = new JMenuItem("TVBox");
		JMenuRent.add(MenuItemTVBox);
		
		JMenuItem JMenuItemLiveConcert = new JMenuItem("Live Concert");
		JMenuRent.add(JMenuItemLiveConcert);
		
		JMenu JMenuRegister = new JMenu("Register");
		menuBar.add(JMenuRegister);
		
		JMenuItem JMenuItemNewCustomer = new JMenuItem("New Customer");
		JMenuRegister.add(JMenuItemNewCustomer);
		JMenuItemNewCustomer.setActionCommand("New Customer");
        JMenuItemNewCustomer.addActionListener((ActionListener) this);

		
		JMenuItem JMenuItemNewMusicLive = new JMenuItem("New MusicLive");
		JMenuRegister.add(JMenuItemNewMusicLive);
		
		JMenuItem JMenuItemNewMovie = new JMenuItem("New Movie");
		JMenuRegister.add(JMenuItemNewMovie);
		
		JMenuItem JMenuItemTVBox = new JMenuItem("New TVBox");
		JMenuRegister.add(JMenuItemTVBox);
		
		JMenuItem JMenuItemNewEmployee = new JMenuItem("New Employee");
		JMenuRegister.add(JMenuItemNewEmployee);
		
		JMenu JMenuLoyaltyCard = new JMenu("Loyalty Card");
		menuBar.add(JMenuLoyaltyCard);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New Loyalty Card");
		JMenuLoyaltyCard.add(mntmNewMenuItem);
	
		
         
 		dashboard.validate();
 		dashboard.repaint();
		
	}


}
