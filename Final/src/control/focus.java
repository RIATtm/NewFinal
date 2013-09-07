/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.DefaultFocusManager;

/**
 *
 * @author AT
 */
public class focus {
    

    public static void textFieldsNext(KeyEvent evt, Component cmpNext, Component cmpBack) {
        DefaultFocusManager df = new DefaultFocusManager();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            df.focusNextComponent(cmpNext);
        }

        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            df.focusPreviousComponent(cmpBack);
        }
    }
}
