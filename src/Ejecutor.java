
package proyectoclinicasf;
import javax.swing.JOptionPane;

public class Ejecutor {
    private Clientes DatosPersonales[]=new Clientes[1];
    
public void LlenarDatos(){
    int x;
    for(x=0;x<DatosPersonales.length;x++){
        Clientes Cl=new Clientes();
        Cl.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre: "));
        Cl.setApellidos(JOptionPane.showInputDialog(null, "Digite sus apellidos: "));
        Cl.setCedula(JOptionPane.showInputDialog(null, "Digite su número de cédula: "));
        Cl.setMotivoConsulta(JOptionPane.showInputDialog(null, "Digite el servicio que quisiera realizar: ").charAt(x));
            
        
        
    }
  }
}
