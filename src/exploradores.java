
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class exploradores extends Alienigenas {
    private ArrayList <Planeta> pexplorados;
    private Planeta favorito;

    public exploradores() {
        super();
    }

    public exploradores(ArrayList<Planeta> pexplorados, Planeta favorito) throws Exception {
        this.pexplorados = pexplorados;
        this.setFavorito(favorito);
    }

    public exploradores(Planeta favorito, String nombre, Raza raza, int edad, String amenaza) throws Exception {
        super(nombre, raza, edad, amenaza);
        
        this.setFavorito(favorito);
    }

    public ArrayList<Planeta> getPexplorados() {
        return pexplorados;
    }

    public void setPexplorados(ArrayList<Planeta> pexplorados) {
        this.pexplorados = pexplorados;
    }

    public Planeta getFavorito() {
        return favorito;
    }

    public void setFavorito(Planeta favorito) throws Exception {
        try {
            for (int i = 0; i < pexplorados.size(); i++) {
                if (favorito.equals(pexplorados.get(i))) {
                    this.favorito = favorito;
                } else {
                    throw new Exception("El planeta debe estar dentro de la lista de planetas explorados");
                }
            }
        } catch (Exception ex) {

        }

    }

    @Override
    public String toString() {
        return "exploradores{" + super.toString() + "pexplorados=" + pexplorados + ", favorito=" + favorito + '}';
    }
    
    
}
