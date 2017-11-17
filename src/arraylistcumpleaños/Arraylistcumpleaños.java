/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistcumpleaños;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author jutsu
 */
public class Arraylistcumpleaños {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definir arreglo de cumpleaños
        ArrayList<String> cumpleaños = new ArrayList ();
        //variable para introduccion de cumpleaños
        String cumple;
        //variable para introducir o no los cumpleaños
        int contador;
        //Variable para mostrar los cumpleaños
        String elcumple = "";
        //Introducir cumpleaños y guardarlos en el arreglo
        do {
            cumple = JOptionPane.showInputDialog(null, "Teclee un cumpleaños y su nombre con Mayuscula");
            cumpleaños.add(cumple);
            //preguntar si desea agregar otro
            contador = JOptionPane.showConfirmDialog(null, "¿Desea agregar otro cumpleaños?","Arreglo de cumpleaños",JOptionPane.YES_NO_OPTION);
            //Comprueba si/no
        } while (contador == JOptionPane.YES_NO_OPTION);
        //Desplegar cumpleaños
        for (int i = 0; i < cumpleaños.size(); i++) {
            elcumple += "Cumpleaños: " + i + ", " + cumpleaños.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, elcumple);
    }
    
}
