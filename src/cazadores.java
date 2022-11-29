

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class cazadores extends Alienigenas {
    private int humanos;

    public cazadores() {
        super();
    }
    
    

    public cazadores(int humanos) {
        this.humanos = humanos;
    }

    public cazadores(int humanos, String nombre, Raza raza, int edad, String amenaza) {
        super(nombre, raza, edad, amenaza);
        this.humanos = humanos;
    }

    public int getHumanos() {
        return humanos;
    }

    public void setHumanos(int humanos) {
        this.humanos = humanos;
    }

    @Override
    public String toString() {
        return "cazadores{"+ super.toString() + "humanos=" + humanos + '}';
    }
    
    
}
