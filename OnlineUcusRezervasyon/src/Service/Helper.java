package Service;
import javax.swing.JOptionPane;




public class Helper {

	public static void showMsg(String str) {
	
		String msg;
		
		switch (str) {
		case "fill":
			msg="L�tfen T�m alanlar� doldurunuz .";
			break;
		case "success":
			msg="��lem Ba�ar�l� ";
			break;
		case "kullan�c�girishatas�"	:
		 	msg ="email yada �ifrenizi kontrol ediniz...";
		 	break;
		case "admingirishatas�":
			msg="giris bilgilerinizi kontrol ediniz ...";
			break;
		case "�yetchatas�":
			msg="Tc kimlik numaran�z 11 haneli olmal� ...";
			break;
		case "�yesifrehatas�":
			msg="Sifrenizi 8 Karakterden az girmeyiniz";
			break;
		default:
			msg=str;
		}
		JOptionPane.showMessageDialog(null, msg,"Mesaj",JOptionPane.WARNING_MESSAGE);
		
		
	}
	
}
