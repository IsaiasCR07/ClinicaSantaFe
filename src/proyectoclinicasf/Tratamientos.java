
package proyectoclinicasf;
import javax.swing.JOptionPane;
public class Tratamientos {
    private String gotasBetametasona;
    private String gotasEndometaxina;
    private String gotasArtificiales;
    private String Reposo;
    private String Revision;
    
    public Tratamientos(){
        this.gotasBetametasona="";
        this.gotasEndometaxina="";
        this.gotasArtificiales="";
        this.Reposo="";
        this.Revision="";
    }

    public String getGotasBetametasona() {
        return gotasBetametasona;
    }

    public void setGotasBetametasona(String gotasBetametasona) {
        this.gotasBetametasona = gotasBetametasona;
    }

    public String getGotasEndometaxina() {
        return gotasEndometaxina;
    }

    public void setGotasEndometaxina(String gotasEndometaxina) {
        this.gotasEndometaxina = gotasEndometaxina;
    }

    public String getGotasArtificiales() {
        return gotasArtificiales;
    }

    public void setGotasArtificiales(String gotasArtificiales) {
        this.gotasArtificiales = gotasArtificiales;
    }

    public String getReposo() {
        return Reposo;
    }

    public void setReposo(String Reposo) {
        this.Reposo = Reposo;
    }

    public String getRevision() {
        return Revision;
    }

    public void setRevision(String Revision) {
        this.Revision = Revision;
    }
}
