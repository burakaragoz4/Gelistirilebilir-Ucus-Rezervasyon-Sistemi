package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.User;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class UserGUI extends JFrame {
	static  User user = new User ();
	private JPanel pane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserGUI frame = new UserGUI(user);
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
	public UserGUI(User user) {
		setTitle("REZERVASYON SÝSTEMÝ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 929, 549);
		pane = new JPanel();
		pane.setBackground(Color.WHITE);
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		pane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hoþgeldiniz Sayýn " + user.getName());
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblNewLabel.setBounds(0, 10, 250, 30);
		pane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ÇIKIÞ YAP");
		btnNewButton.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(632, 10, 215, 47);
		pane.add(btnNewButton);
	}
}
