
package proyectoclinicasf; 
import javax.swing.JOptionPane;
public class Clientes {
    private String cedula;
    private String nombre;
    private String apellidos;
    private double metodoPago;
    private String motivoConsulta;
 
    public Clientes(){
      this.cedula="";
      this.nombre="";
      this.apellidos="";
      this.metodoPago=0.00;
      this.motivoConsulta="";
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(double metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }
}
