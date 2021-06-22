package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Admin;
import Model.User;
import Service.DataBaseConnection;
import Service.Helper;

import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtOnlineUakRezervasyon;
	private JTabbedPane tabbedPane;
	private JPanel member_register;
	private JLabel �ye_soyad;
	private JLabel �ye_dt;
	private JLabel �ye_mail;
	private JLabel �ye_sifre;
	private JTextField �yeolma_ad�;
	private JTextField �yeolma_soyad�;
	private JTextField �yeolma_mail;
	private JTextField �yeolma_dt;
	private JLabel �ye_tc;
	private JTextField �yeolma_tc;
	private JLabel lblSoyad_1;
	private JLabel lblSoyad_2;
	private JButton �yegirisbuton;
	private JPasswordField adminsifre;
	private DataBaseConnection Conn = new DataBaseConnection();
	private JTextField �yegirismail;
	private JTextField adminid;
	private JPasswordField �yeolma_sifre;
	private JPasswordField uyegirisipassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setResizable(false);
		setForeground(Color.BLUE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ABRA\\Desktop\\indir.png"));
		setTitle("Online U�u� Rezervasyonu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 457);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtOnlineUakRezervasyon = new JTextField();
		txtOnlineUakRezervasyon.setBounds(15, 10, 771, 34);
		contentPane.add(txtOnlineUakRezervasyon);
		txtOnlineUakRezervasyon.setEditable(false);
		txtOnlineUakRezervasyon.setBackground(Color.GREEN);
		txtOnlineUakRezervasyon.setForeground(Color.BLACK);
		txtOnlineUakRezervasyon.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnlineUakRezervasyon.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtOnlineUakRezervasyon.setText("ONL�NE U�AK REZERVASYON S�STEM�\r\n");
		txtOnlineUakRezervasyon.setColumns(10);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(15, 100, 762, 319);
		contentPane.add(tabbedPane);

		member_register = new JPanel();
		member_register.setBackground(Color.WHITE);
		tabbedPane.addTab("�YE OLMAK", null, member_register, null);
		member_register.setLayout(null);

		JLabel �ye_ad = new JLabel("  AD                    :");
		�ye_ad.setFont(new Font("Tahoma", Font.BOLD, 12));
		�ye_ad.setBounds(10, 25, 125, 28);
		member_register.add(�ye_ad);

		�ye_soyad = new JLabel("  SOYAD              :");
		�ye_soyad.setFont(new Font("Tahoma", Font.BOLD, 12));
		�ye_soyad.setBounds(10, 64, 113, 28);
		member_register.add(�ye_soyad);

		�ye_dt = new JLabel("  DO�UM TAR�H� :");
		�ye_dt.setFont(new Font("Tahoma", Font.BOLD, 12));
		�ye_dt.setBounds(10, 146, 125, 28);
		member_register.add(�ye_dt);

		�ye_mail = new JLabel("  E - MAIL           :");
		�ye_mail.setFont(new Font("Tahoma", Font.BOLD, 12));
		�ye_mail.setBounds(10, 184, 125, 28);
		member_register.add(�ye_mail);

		�ye_sifre = new JLabel("  ��FRE               :");
		�ye_sifre.setFont(new Font("Tahoma", Font.BOLD, 12));
		�ye_sifre.setBounds(10, 222, 125, 28);
		member_register.add(�ye_sifre);

		�yeolma_ad� = new JTextField();
		�yeolma_ad�.setBounds(127, 24, 277, 33);
		member_register.add(�yeolma_ad�);
		�yeolma_ad�.setColumns(10);

		�yeolma_soyad� = new JTextField();
		�yeolma_soyad�.setBounds(127, 63, 277, 33);
		member_register.add(�yeolma_soyad�);
		�yeolma_soyad�.setColumns(10);

		�yeolma_mail = new JTextField();
		�yeolma_mail.setBounds(127, 184, 277, 33);
		member_register.add(�yeolma_mail);
		�yeolma_mail.setColumns(10);

		�yeolma_dt = new JTextField();
		�yeolma_dt.setBounds(127, 145, 277, 33);
		member_register.add(�yeolma_dt);
		�yeolma_dt.setColumns(10);

		�ye_tc = new JLabel("  TC K�ML�K NO    :");
		�ye_tc.setFont(new Font("Tahoma", Font.BOLD, 12));
		�ye_tc.setBounds(10, 103, 125, 33);
		member_register.add(�ye_tc);

		�yeolma_tc = new JTextField();
		�yeolma_tc.setBounds(127, 106, 277, 33);
		member_register.add(�yeolma_tc);
		�yeolma_tc.setColumns(10);

		�yeolma_sifre = new JPasswordField();
		�yeolma_sifre.setBounds(127, 228, 277, 33);
		member_register.add(�yeolma_sifre);

		JButton �yeolma_butonu = new JButton("KAYIT OL");
		User user = new User();
		�yeolma_butonu.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				if (�yeolma_ad�.getText().length() == 0 || �yeolma_soyad�.getText().length() == 0
						|| �yeolma_tc.getText().length() == 0 || �yeolma_dt.getText().length() == 0
						|| �yeolma_mail.getText().length() == 0 || �yeolma_sifre.getText().length() == 0) {

					Helper.showMsg("fill");
				} else {
					try {
						if(�yeolma_tc.getText().length()<11 || �yeolma_tc.getText().length()>11) {
							Helper.showMsg("�yetchatas�");
							
						}
						else if(�yeolma_sifre.getText().length()<8) {
							Helper.showMsg("�yesifrehatas�");
							
						}
						else {
						boolean control = user.addUser(getDefaultCloseOperation(), �yeolma_ad�.getText(),
								�yeolma_soyad�.getText(), �yeolma_tc.getText(), �yeolma_sifre.getText(),
								�yeolma_dt.getText(), �yeolma_mail.getText());
						if (control) {
							Helper.showMsg("success");
							�yeolma_ad�.setText(null);
							�yeolma_soyad�.setText(null);
							�yeolma_sifre.setText(null);
							�yeolma_mail.setText(null);
							�yeolma_dt.setText(null);
							�yeolma_tc.setText(null);

						}
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}

			}
		});
		�yeolma_butonu.setFont(new Font("Tahoma", Font.BOLD, 25));
		�yeolma_butonu.setBackground(Color.WHITE);
		�yeolma_butonu.setBounds(449, 110, 237, 54);
		member_register.add(�yeolma_butonu);

		JPanel �yegirissayfas� = new JPanel();
		�yegirissayfas�.setBackground(Color.WHITE);
		tabbedPane.addTab("G�R��", null, �yegirissayfas�, null);
		�yegirissayfas�.setLayout(null);

		lblSoyad_1 = new JLabel("E MAIL        :");
		lblSoyad_1.setBounds(120, 70, 79, 35);
		lblSoyad_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		�yegirissayfas�.add(lblSoyad_1);

		lblSoyad_2 = new JLabel("��FRE          :");
		lblSoyad_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSoyad_2.setBounds(120, 115, 79, 35);
		�yegirissayfas�.add(lblSoyad_2);

		�yegirisbuton = new JButton("G�R��");
		�yegirisbuton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (�yegirismail.getText().length() == 0 || uyegirisipassword.getText().length() == 0) {
					Helper.showMsg("fill");

				} else {

					try {
						Connection con = Conn.connDb();
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT * FROM customer");
						while (rs.next()) {
							if (�yegirismail.getText().equals(rs.getString("email"))
									&& uyegirisipassword.getText().equals(rs.getString("password"))) {

								User user = new User();
								user.setName(rs.getString("name"));
								user.setLastName(rs.getString("lastname"));
								user.setPassword(rs.getString("password"));
								user.seteMail(rs.getString("email"));
								user.setDateofbirth(rs.getString("dateofbirth"));
								user.setIdentitynumber(rs.getString("identitynumber"));
								UserGUI uGUI = new UserGUI(user);
								uGUI.setVisible(true);
								dispose();
							} else {
								Helper.showMsg("kullan�c�girishatas�");

							}

						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});
		�yegirisbuton.setFont(new Font("Tahoma", Font.BOLD, 25));
		�yegirisbuton.setBounds(140, 186, 393, 63);
		�yegirissayfas�.add(�yegirisbuton);

		�yegirismail = new JTextField();
		�yegirismail.setBounds(209, 71, 305, 35);
		�yegirissayfas�.add(�yegirismail);
		�yegirismail.setColumns(10);

		uyegirisipassword = new JPasswordField();
		uyegirisipassword.setBounds(209, 116, 305, 34);
		�yegirissayfas�.add(uyegirisipassword);

		JPanel ADM�N = new JPanel();
		ADM�N.setBackground(Color.WHITE);
		tabbedPane.addTab("ADM�N", null, ADM�N, null);
		ADM�N.setLayout(null);

		JLabel admin_id = new JLabel("ADM�N    :");
		admin_id.setBounds(137, 59, 93, 51);
		admin_id.setFont(new Font("Tahoma", Font.BOLD, 12));
		ADM�N.add(admin_id);

		JLabel lblSoyad_2_1 = new JLabel("��FRE      :");
		lblSoyad_2_1.setBounds(137, 139, 73, 15);
		lblSoyad_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		ADM�N.add(lblSoyad_2_1);

		JButton admin_button = new JButton("G�R��");
		admin_button.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (adminid.getText().length() == 0 || adminsifre.getText().length() == 0) {
					Helper.showMsg("fill");
				}
				try {
					Connection admincon = Conn.connDb();
					Statement st = admincon.createStatement();
					ResultSet rs = st.executeQuery("SELECT * FROM admins");
					while (rs.next()) {

						if (adminid.getText().equals(rs.getString("admin_name"))
								&& adminsifre.getText().equals(rs.getString("admin_password"))) {
							
							Admin admin = new Admin();
							admin.setId(rs.getInt("id_admin"));
							admin.setAdmin_name(rs.getString("admin_name"));
							admin.setAdmin_password("admin_password");
							AdminGUI aGUI = new AdminGUI(admin);
							aGUI.setVisible(true);
							dispose();

						} else {
							Helper.showMsg("admingirishatas�");
						}

					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		admin_button.setFont(new Font("Tahoma", Font.BOLD, 25));
		admin_button.setBounds(187, 199, 309, 51);
		ADM�N.add(admin_button);

		adminsifre = new JPasswordField();
		adminsifre.setBounds(203, 120, 293, 34);
		ADM�N.add(adminsifre);

		adminid = new JTextField();
		adminid.setBounds(203, 62, 293, 41);
		ADM�N.add(adminid);
		adminid.setColumns(10);

	}
}
