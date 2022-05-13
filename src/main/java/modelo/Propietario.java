/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author user
 */
public class Propietario {
    private String nombre; 
    private String cedula;       
    private int yearNacimiento;
    private int codigo;
    private String direccion;

    public Propietario(String nombre, String cedula, int yearNacimiento, int codigo, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.yearNacimiento = yearNacimiento;
        this.codigo = codigo;
        this.direccion = direccion;
    }

    public Propietario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", cedula=" 
                + cedula + ", yearNacimiento=" + yearNacimiento +
                ", codigo=" + codigo + ", direccion=" + direccion + '}';
    }
    
    
    
}
