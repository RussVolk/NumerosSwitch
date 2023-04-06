/* switch(variable)
    caso 1:  Instrucciones;
               break;
.
.
.
*/
package pkgswitch;

import javax.swing.JOptionPane;

public class Switch {


    public static void main(String[] args) {
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número del 1 al 5"));
        
        switch (dato){
            
            case 1: JOptionPane.showMessageDialog(null, "El número es 1");
            break;
            
            case 2: JOptionPane.showMessageDialog(null, "El número es 2");
            break;
            
            case 3: JOptionPane.showMessageDialog(null, "El número es 3");
            break;
           
            case 4: JOptionPane.showMessageDialog(null, "El número es 4");
            break;
            
            case 5: JOptionPane.showMessageDialog(null, "El número es 5");
            break;
            
            default: JOptionPane.showMessageDialog(null, "¡UPS! el número que ingresaste no está dentro del rango");
            
        }
    }
    
}
