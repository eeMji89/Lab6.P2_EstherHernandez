
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Conquistadores extends Alienigenas {
    private ArrayList <Planeta> Conquistados;

    public Conquistadores() {
        super();
    }

    public Conquistadores(ArrayList<Planeta> Conquistados) {
        this.Conquistados = Conquistados;
    }

    public Conquistadores( String nombre, Raza raza, int edad, String amenaza) {
        super(nombre, raza, edad, amenaza);
        this.Conquistados = Conquistados;
    }
    
    public ArrayList<Planeta> getConquistados() {
        return Conquistados;
    }

    public void setConquistados(ArrayList<Planeta> Conquistados) {
        this.Conquistados = Conquistados;
    }

    @Override
    public String toString() {
        return "Conquistadores{" +super.toString()+ "Conquistados=" + Conquistados + '}';
    }
    
    
    
    
}
