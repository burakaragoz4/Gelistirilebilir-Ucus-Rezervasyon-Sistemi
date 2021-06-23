/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayarlar;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author chame
 */
public class ButtonAyarlari {
    
    private static Color orijinalRenk;
    public static void setBackgRenk(JButton button, Color orijRenk) {
        orijinalRenk= button.getBackground();
        button.setBackground(orijRenk);
    }
    public static void setOrijRenk(JButton button) {
        button.setBackground(orijinalRenk);
    }
    
}
