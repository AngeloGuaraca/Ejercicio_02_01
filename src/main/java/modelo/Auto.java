/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author user
 */
public class Auto {
    private String placa;
    private String nombre;
    private String tipoMaterial;
    private int    year;
    private String color;

    public Auto(String placa, String nombre, String tipoMaterial, int year, String color) {
        this.placa = placa;
        this.nombre = nombre;
        this.tipoMaterial = tipoMaterial;
        this.year = year;
        this.color = color;
    }

    public Auto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
           
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "placa=" + placa + ", nombre=" + nombre +
                ", tipoMaterial=" + tipoMaterial + ", year=" + year +
                ", color=" + color + '}';
    }
    
    
    
}
