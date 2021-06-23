package ayarlar;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class TextAyarlari {

    public static void isimKontrol(JTextField textField) {
              textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent basamak) {
                
                char k= basamak.getKeyChar();
                if (Character.isDigit(k) ) {
                    basamak.consume();
                }
            }
            
});
    }
    
    public static void kartNoKontrol(JTextField textField) {
             textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent basamak) {
               
                char k= basamak.getKeyChar();
                if (!Character.isDigit(k) || textField.getText().length()>13) {
                    basamak.consume();
                }
            }
            
});
    }
    public static void cvvKontrol(JTextField textField) {
             textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent basamak) {
                char k= basamak.getKeyChar();
                if (!Character.isDigit(k) || textField.getText().length()>2) {
                    basamak.consume();
                }
            }
            
});
    }
}
