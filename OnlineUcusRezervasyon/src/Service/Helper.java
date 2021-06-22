package Service;
import javax.swing.JOptionPane;




public class Helper {

	public static void showMsg(String str) {
	
		String msg;
		
		switch (str) {
		case "fill":
			msg="Lütfen Tüm alanlarý doldurunuz .";
			break;
		case "success":
			msg="Ýþlem Baþarýlý ";
			break;
		case "kullanýcýgirishatasý"	:
		 	msg ="email yada þifrenizi kontrol ediniz...";
		 	break;
		case "admingirishatasý":
			msg="giris bilgilerinizi kontrol ediniz ...";
			break;
		case "üyetchatasý":
			msg="Tc kimlik numaranýz 11 haneli olmalý ...";
			break;
		case "üyesifrehatasý":
			msg="Sifrenizi 8 Karakterden az girmeyiniz";
			break;
		default:
			msg=str;
		}
		JOptionPane.showMessageDialog(null, msg,"Mesaj",JOptionPane.WARNING_MESSAGE);
		
		
	}
	
}
