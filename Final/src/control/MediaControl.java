/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.comm.CommPortIdentifier;
import javax.comm.SerialPort;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Win -8
 */
public class MediaControl {

    char c = '"';
    char ctrtZ = (char) 26;
    static SerialConnection serialcons;
    static CommPortIdentifier portId;
    static Enumeration portList;

    public static SerialConnection setPort(String port) {
        try {
    SerialParameters serialparams;
            serialparams = new SerialParameters(port, 9600, 0, 0, 8, 1, 0);
            serialcons = new SerialConnection(serialparams);
            serialcons.openConnection();
            System.out.println("Connected....");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No such Port...", "Port Settings", JOptionPane.WARNING_MESSAGE);
        }
        return serialcons;
    }

    public static Vector getPorts() {
        portList = CommPortIdentifier.getPortIdentifiers();
        Vector v = new Vector();
        while (portList.hasMoreElements()) {
            portId = (CommPortIdentifier) portList.nextElement();
            v.add(portId.getName());
        }
        return v;
    }
}
