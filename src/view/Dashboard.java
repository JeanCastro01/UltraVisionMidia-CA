package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;

import controller.CustomerController;
import controller.EmployeeController;
import controller.LoyaltyCardController;
import controller.MovieController;
import controller.MusicLiveController;
import controller.TVBoxController;

import javax.swing.JMenuItem;

public class Dashboard extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	
	

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
		JMenuItemNewCustomer.setActionCommand("New Customer");
        JMenuItemNewCustomer.addActionListener((ActionListener) this);

		
		JMenuItem JMenuItemNewMusicLive = new JMenuItem("New MusicLive");
		JMenuRegister.add(JMenuItemNewMusicLive);
		JMenuItemNewMusicLive.setActionCommand("New MusicLive");
		JMenuItemNewMusicLive.addActionListener((ActionListener) this);
		
		JMenuItem JMenuItemNewMovie = new JMenuItem("New Movie");
		JMenuRegister.add(JMenuItemNewMovie);
		JMenuItemNewMovie.setActionCommand("New Movie");
		JMenuItemNewMovie.addActionListener((ActionListener) this);
		//contentPane.add(JMenuItemNewMovie);
		
		JMenuItem JMenuItemTVBox = new JMenuItem("New TVBox");
		JMenuRegister.add(JMenuItemTVBox);
		JMenuItemTVBox.setActionCommand("New TVBox");
		JMenuItemTVBox.addActionListener((ActionListener) this);
		//contentPane.add(JMenuItemTVBox);
		
		JMenuItem JMenuItemNewEmployee = new JMenuItem("New Employee");
		JMenuRegister.add(JMenuItemNewEmployee);
		JMenuItemNewEmployee.setActionCommand("New Employee");
		JMenuItemNewEmployee.addActionListener((ActionListener) this);
		//contentPane.add(JMenuItemNewEmployee);
		
		JMenu JMenuLoyaltyCard = new JMenu("Loyalty Card");
		menuBar.add(JMenuLoyaltyCard);
		//contentPane.add(JMenuLoyaltyCard);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New Loyalty Card");
		JMenuLoyaltyCard.add(mntmNewMenuItem);
		mntmNewMenuItem.setActionCommand("New Loyalty Card");
		mntmNewMenuItem.addActionListener((ActionListener) this);
		//contentPane.add(mntmNewMenuItem);
	
		
         
 		dashboard.validate();
 		dashboard.repaint();
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
        String ac = e.getActionCommand();
        if (ac.equals("New Customer")) {
            
            new CustomerController();
        }
        else if (e.getActionCommand().equals("New MusicLive")) {
            new MusicLiveController();
        }
         else if (e.getActionCommand().equals("New Movie")) {
             new MovieController();
        }
           else if (e.getActionCommand().equals("New TVBox")) {
             new TVBoxController();
        }
        
             else if (e.getActionCommand().equals("New Employee")) {
             new EmployeeController();
        }
             else if (e.getActionCommand().equals("New Loyalty Card")) {
             new LoyaltyCardController();
        }
             else if (e.getActionCommand().equals("logout")) {
           this.dispose();
          // new LoginController();
           //new index();
        }
	}
}
