
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Planeta {
    private String nombre;
    private String agua;
    private int tamano;
    private ArrayList<Alienigenas> habitantes ;

    public Planeta() {
    }

    public Planeta(String nombre, String agua, int tamano) {
        this.nombre = nombre;
        this.agua = agua;
        this.tamano = tamano;
    }
    

    public Planeta(String nombre, String agua, int tamano, ArrayList<Alienigenas> Visitas) {
        this.nombre = nombre;
        this.agua = agua;
        this.tamano = tamano;
        this.habitantes = Visitas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public ArrayList<Alienigenas> getVisitas() {
        return habitantes;
    }

    public void setVisitas(ArrayList<Alienigenas> Visitas) {
        this.habitantes = Visitas;
    }
    
    /*
    @Override
    public String toString() {
        return "Planeta{" + "nombre=" + nombre + ", agua=" + agua + ", tamano=" + tamano + ", habitantes=" + habitantes + '}';
    }
    */

   /* @Override
    public String toString() {
        return  nombre;
    }
    */
    
}
