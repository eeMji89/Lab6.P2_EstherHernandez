
import java.util.ArrayList;


/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Raza {
    private Planeta p;
    private String nombre;
    private ArrayList<Alienigenas> Aliens;

    public Raza(Planeta p, String nombre) {
        this.p = p;
        this.nombre = nombre;
    }

    public Raza() {
    }

    public ArrayList<Alienigenas> getAliens() {
        return Aliens;
    }

    public void setAliens(ArrayList<Alienigenas> Aliens) {
        this.Aliens = Aliens;
    }
    
    public Planeta getP() {
        return p;
    }

    public void setP(Planeta p) {
        this.p = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
