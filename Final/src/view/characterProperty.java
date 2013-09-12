/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.TextField;
import javax.swing.JTextField;

/**
 *
 * @author Win -8
 */
public class characterProperty {

    public static void letterUppercase(JTextField tf, int index) {
        if (!tf.getText().isEmpty()) {
            if (Character.isLowerCase(tf.getText().charAt(index))) {
                tf.setText(new String(String.valueOf(tf.getText().charAt(index))).toUpperCase() + tf.getText().substring(index+1));
            }
        }
    }
    public static void letterLowercase(JTextField tf, int index) {
        if (!tf.getText().isEmpty()) {
            if (Character.isUpperCase(tf.getText().charAt(index))) {
                tf.setText(new String(String.valueOf(tf.getText().charAt(index))).toLowerCase() + tf.getText().substring(index+1));
            }
        }
    }
    public static void letterFont(JTextField[] tf, Font f){
        for(JTextField set:tf){
            set.setFont(f);
        }
    }
}
