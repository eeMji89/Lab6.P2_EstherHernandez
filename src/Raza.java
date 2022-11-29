/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Raza {
    private Planeta p;
    private String nombre;

    public Raza(Planeta p, String nombre) {
        this.p = p;
        this.nombre = nombre;
    }

    public Raza() {
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
