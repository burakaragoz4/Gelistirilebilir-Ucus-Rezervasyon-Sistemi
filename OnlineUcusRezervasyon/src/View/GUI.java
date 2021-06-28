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
	private JLabel üye_soyad;
	private JLabel üye_dt;
	private JLabel üye_mail;
	private JLabel üye_sifre;
	private JTextField üyeolma_adý;
	private JTextField üyeolma_soyadý;
	private JTextField üyeolma_mail;
	private JTextField üyeolma_dt;
	private JLabel üye_tc;
	private JTextField üyeolma_tc;
	private JLabel lblSoyad_1;
	private JLabel lblSoyad_2;
	private JButton üyegirisbuton;
	private JPasswordField adminsifre;
	private DataBaseConnection Conn = new DataBaseConnection();
	private JTextField üyegirismail;
	private JTextField adminid;
	private JPasswordField üyeolma_sifre;
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
		setTitle("Online Uçuþ Rezervasyonu");
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
		txtOnlineUakRezervasyon.setText("ONLÝNE UÇAK REZERVASYON SÝSTEMÝ\r\n");
		txtOnlineUakRezervasyon.setColumns(10);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(15, 100, 762, 319);
		contentPane.add(tabbedPane);

		member_register = new JPanel();
		member_register.setBackground(Color.WHITE);
		tabbedPane.addTab("ÜYE OLMAK", null, member_register, null);
		member_register.setLayout(null);

		JLabel üye_ad = new JLabel("  AD                    :");
		üye_ad.setFont(new Font("Tahoma", Font.BOLD, 12));
		üye_ad.setBounds(10, 25, 125, 28);
		member_register.add(üye_ad);

		üye_soyad = new JLabel("  SOYAD              :");
		üye_soyad.setFont(new Font("Tahoma", Font.BOLD, 12));
		üye_soyad.setBounds(10, 64, 113, 28);
		member_register.add(üye_soyad);

		üye_dt = new JLabel("  DOÐUM TARÝHÝ :");
		üye_dt.setFont(new Font("Tahoma", Font.BOLD, 12));
		üye_dt.setBounds(10, 146, 125, 28);
		member_register.add(üye_dt);

		üye_mail = new JLabel("  E - MAIL           :");
		üye_mail.setFont(new Font("Tahoma", Font.BOLD, 12));
		üye_mail.setBounds(10, 184, 125, 28);
		member_register.add(üye_mail);

		üye_sifre = new JLabel("  ÞÝFRE               :");
		üye_sifre.setFont(new Font("Tahoma", Font.BOLD, 12));
		üye_sifre.setBounds(10, 222, 125, 28);
		member_register.add(üye_sifre);

		üyeolma_adý = new JTextField();
		üyeolma_adý.setBounds(127, 24, 277, 33);
		member_register.add(üyeolma_adý);
		üyeolma_adý.setColumns(10);

		üyeolma_soyadý = new JTextField();
		üyeolma_soyadý.setBounds(127, 63, 277, 33);
		member_register.add(üyeolma_soyadý);
		üyeolma_soyadý.setColumns(10);

		üyeolma_mail = new JTextField();
		üyeolma_mail.setBounds(127, 184, 277, 33);
		member_register.add(üyeolma_mail);
		üyeolma_mail.setColumns(10);

		üyeolma_dt = new JTextField();
		üyeolma_dt.setBounds(127, 145, 277, 33);
		member_register.add(üyeolma_dt);
		üyeolma_dt.setColumns(10);

		üye_tc = new JLabel("  TC KÝMLÝK NO    :");
		üye_tc.setFont(new Font("Tahoma", Font.BOLD, 12));
		üye_tc.setBounds(10, 103, 125, 33);
		member_register.add(üye_tc);

		üyeolma_tc = new JTextField();
		üyeolma_tc.setBounds(127, 106, 277, 33);
		member_register.add(üyeolma_tc);
		üyeolma_tc.setColumns(10);

		üyeolma_sifre = new JPasswordField();
		üyeolma_sifre.setBounds(127, 228, 277, 33);
		member_register.add(üyeolma_sifre);

		JButton üyeolma_butonu = new JButton("KAYIT OL");
		User user = new User();
		üyeolma_butonu.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				if (üyeolma_adý.getText().length() == 0 || üyeolma_soyadý.getText().length() == 0
						|| üyeolma_tc.getText().length() == 0 || üyeolma_dt.getText().length() == 0
						|| üyeolma_mail.getText().length() == 0 || üyeolma_sifre.getText().length() == 0) {

					Helper.showMsg("fill");
				} else {
					try {
						if(üyeolma_tc.getText().length()<11 || üyeolma_tc.getText().length()>11) {
							Helper.showMsg("üyetchatasý");
							
						}
						else if(üyeolma_sifre.getText().length()<8) {
							Helper.showMsg("üyesifrehatasý");
							
						}
						else {
							Helper.showMsg("üyeolundu");
						boolean control = user.addUser(getDefaultCloseOperation(), üyeolma_adý.getText(),
								üyeolma_soyadý.getText(), üyeolma_tc.getText(), üyeolma_sifre.getText(),
								üyeolma_dt.getText(), üyeolma_mail.getText());
						if (control) {
							Helper.showMsg("success");
							üyeolma_adý.setText(null);
							üyeolma_soyadý.setText(null);
							üyeolma_sifre.setText(null);
							üyeolma_mail.setText(null);
							üyeolma_dt.setText(null);
							üyeolma_tc.setText(null);

						}
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

				}

			}
		});
		üyeolma_butonu.setFont(new Font("Tahoma", Font.BOLD, 25));
		üyeolma_butonu.setBackground(Color.WHITE);
		üyeolma_butonu.setBounds(449, 110, 237, 54);
		member_register.add(üyeolma_butonu);

		JPanel üyegirissayfasý = new JPanel();
		üyegirissayfasý.setBackground(Color.WHITE);
		tabbedPane.addTab("GÝRÝÞ", null, üyegirissayfasý, null);
		üyegirissayfasý.setLayout(null);

		lblSoyad_1 = new JLabel("E MAIL        :");
		lblSoyad_1.setBounds(120, 70, 79, 35);
		lblSoyad_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		üyegirissayfasý.add(lblSoyad_1);

		lblSoyad_2 = new JLabel("ÞÝFRE          :");
		lblSoyad_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSoyad_2.setBounds(120, 115, 79, 35);
		üyegirissayfasý.add(lblSoyad_2);

		üyegirisbuton = new JButton("GÝRÝÞ");
		üyegirisbuton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (üyegirismail.getText().length() == 0 || uyegirisipassword.getText().length() == 0) {
					Helper.showMsg("fill");

				} else {

					try {
						Connection con = Conn.connDb();
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT * FROM customer");
						while (rs.next()) {
							if (üyegirismail.getText().equals(rs.getString("email"))
									&& uyegirisipassword.getText().equals(rs.getString("password"))) {

								User user = new User();
								user.setName(rs.getString("name"));
								user.setLastName(rs.getString("lastname"));
								user.setPassword(rs.getString("password"));
								user.seteMail(rs.getString("email"));
								user.setDateofbirth(rs.getString("dateofbirth"));
								user.setIdentitynumber(rs.getString("identitynumber"));
								SeferSecEkrani SeferSecGUI = new SeferSecEkrani();
								SeferSecGUI.setVisible(true);
								dispose();
							} else {
								

							}

						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});
		üyegirisbuton.setFont(new Font("Tahoma", Font.BOLD, 25));
		üyegirisbuton.setBounds(140, 186, 393, 63);
		üyegirissayfasý.add(üyegirisbuton);

		üyegirismail = new JTextField();
		üyegirismail.setBounds(209, 71, 305, 35);
		üyegirissayfasý.add(üyegirismail);
		üyegirismail.setColumns(10);

		uyegirisipassword = new JPasswordField();
		uyegirisipassword.setBounds(209, 116, 305, 34);
		üyegirissayfasý.add(uyegirisipassword);

		JPanel ADMÝN = new JPanel();
		ADMÝN.setBackground(Color.WHITE);
		tabbedPane.addTab("ADMÝN", null, ADMÝN, null);
		ADMÝN.setLayout(null);

		JLabel admin_id = new JLabel("ADMÝN    :");
		admin_id.setBounds(137, 59, 93, 51);
		admin_id.setFont(new Font("Tahoma", Font.BOLD, 12));
		ADMÝN.add(admin_id);

		JLabel lblSoyad_2_1 = new JLabel("ÞÝFRE      :");
		lblSoyad_2_1.setBounds(137, 139, 73, 15);
		lblSoyad_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		ADMÝN.add(lblSoyad_2_1);

		JButton admin_button = new JButton("GÝRÝÞ");
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
							Helper.showMsg("admingirishatasý");
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
		ADMÝN.add(admin_button);

		adminsifre = new JPasswordField();
		adminsifre.setBounds(203, 120, 293, 34);
		ADMÝN.add(adminsifre);

		adminid = new JTextField();
		adminid.setBounds(203, 62, 293, 41);
		ADMÝN.add(adminid);
		adminid.setColumns(10);

	}
}
