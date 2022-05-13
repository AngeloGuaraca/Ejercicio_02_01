/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Auto;
import modelo.Propietario;
import servicio.PropietarioCon;

/**
 *
 * @author user
 */
public class Controlador {
    public class PropietarioControlador {

        private final Propietario propietarioCon;
    

        public PropietarioControlador() {
            this.propietarioCon = new Propietario() {
                
                public Propietario crear(int nf, String nC, String d, String c, int cd, String np){
                    
                    var propiedad = new Propietario();
                    var auto = new Auto ();
                    return null;
                    
                }
                
                
                public Propietario modificar(int nf, Propietario f) {
                    return  this.modificar(nf, f);
                }
                
                
                public Propietario eliminar(int f) {
                    return this.eliminar(f);
                }
                
                
                public List<Propietario> listar() {
                    return this.listar();
                    
                }
                
                
                
                
            };
        }
        
    }
    
}
