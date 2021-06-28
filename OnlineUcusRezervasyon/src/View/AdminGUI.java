package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Model.Admin;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;

public class AdminGUI extends JFrame {
	static Admin admin = new Admin();
	private JPanel contentPane;
	private DefaultTableModel userModel = null;
	private Object[] userData=null; 
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminGUI frame = new AdminGUI(admin);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public AdminGUI(Admin admin) throws SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ABRA\\Desktop\\indir.png"));
		userModel = new DefaultTableModel();
		Object[] colUserName = new Object [7];
		colUserName [0]= "ID";
		colUserName [1]= "Adý";
		colUserName [2]= "Soyadý";
		colUserName [3]= "Þifre";
		colUserName [4]= "Email";
		colUserName [5]= "Doðum Tarihi";
		colUserName [6]= "TC";
		
		userModel.setColumnIdentifiers(colUserName);
		userData = new Object[7];
		
		for(int i = 0; i<admin.getUserList().size(); i++) {
			userData[0] = admin.getUserList().get(i).getId();
			userData[1] = admin.getUserList().get(i).getName() ;
			userData[2] = admin.getUserList().get(i).getLastName() ;
			userData[3] = admin.getUserList().get(i).getPassword() ;
			userData[4] = admin.getUserList().get(i).geteMail() ;
			userData[5] = admin.getUserList().get(i).getDateofbirth() ;
			userData[6] = admin.getUserList().get(i).getIdentitynumber() ;
			
			userModel.addRow(userData);
		}
		
		setTitle("ADMÝN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 498);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Adminpanel1 = new JLabel("Hoþgeldiniz SAYIN"+" "+ admin.getAdmin_name() );
		Adminpanel1.setBounds(10, 10, 273, 34);
		Adminpanel1.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		contentPane.add(Adminpanel1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 64, 472, 387);
		contentPane.add(scrollPane);
		
		table = new JTable(userModel);
		scrollPane.setViewportView(table);
		
	}
}
