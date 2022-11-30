/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Alienigenas {
    private String nombre;
    private Raza raza;
    private int edad;
    private String amenaza;

    public Alienigenas() {
        
    }

    public Alienigenas(String nombre, Raza raza, int edad, String amenaza) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.amenaza = amenaza;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAmenaza() {
        return amenaza;
    }

    public void setAmenaza(String amenaza) {
        this.amenaza = amenaza;
    }

    @Override
    public String toString() {
        return "Alienigenas{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", amenaza=" + amenaza + '}';
    }
    
}
