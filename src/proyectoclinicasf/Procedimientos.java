
package proyectoclinicasf;
import javax.swing.JOptionPane;
public class Procedimientos {
    private String cirugias;
    private String laser;
    private String cataratas;
    private String correccionMiopia;
    private String astigmatismo;
    private String transplanteCornea;
    private String retina;
    
    public Procedimientos(){
        this.cirugias="";
        this.laser="";
        this.cataratas="";
        this.correccionMiopia="";
        this.astigmatismo="";
        this.transplanteCornea="";
        this.retina="";
    }

    public String getCirugias() {
        return cirugias;
    }

    public void setCirugias(String cirugias) {
        this.cirugias = cirugias;
    }

    public String getLaser() {
        return laser;
    }

    public void setLaser(String laser) {
        this.laser = laser;
    }

    public String getCataratas() {
        return cataratas;
    }

    public void setCataratas(String cataratas) {
        this.cataratas = cataratas;
    }

    public String getCorreccionMiopia() {
        return correccionMiopia;
    }

    public void setCorreccionMiopia(String correccionMiopia) {
        this.correccionMiopia = correccionMiopia;
    }

    public String getAstigmatismo() {
        return astigmatismo;
    }

    public void setAstigmatismo(String astigmatismo) {
        this.astigmatismo = astigmatismo;
    }

    public String getTransplanteCornea() {
        return transplanteCornea;
    }

    public void setTransplanteCornea(String transplanteCornea) {
        this.transplanteCornea = transplanteCornea;
    }

    public String getRetina() {
        return retina;
    }

    public void setRetina(String retina) {
        this.retina = retina;
    }
    
}
