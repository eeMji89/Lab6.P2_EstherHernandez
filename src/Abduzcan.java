/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Abduzcan extends Alienigenas {
    private int animales;

    public Abduzcan() {
        super();
    }

    public Abduzcan(int animales) {
        this.animales = animales;
    }

    public Abduzcan(int animales, String nombre, Raza raza, int edad, String amenaza) {
        super(nombre, raza, edad, amenaza);
        this.animales = animales;
    }

    public int getAnimales() {
        return animales;
    }

    public void setAnimales(int animales) {
        this.animales = animales;
    }

    @Override
    public String toString() {
        return "Abduzcan{"+ super.toString()+ "animales=" + animales + '}';
    }
    
    
}
