/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Propietario;

/**
 *
 * @author user
 */
public interface PropietarioCon {
    
    public Propietario crear (Propietario f);
    public Propietario modificar (int nf, Propietario f);
    public Propietario eliminar (int f);
    public List<Propietario> listar();
    public int searchposicion(int c);
}
