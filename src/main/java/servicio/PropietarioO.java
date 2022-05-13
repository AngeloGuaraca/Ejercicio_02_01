/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Propietario;

/**
 *
 * @author user
 */
public class PropietarioO implements PropietarioCon {
    
    
    public final List<Propietario> propietarioList=new ArrayList<>();

    @Override
    public Propietario crear(Propietario f) {
       
        this.propietarioList.add(f);
        return f;
        
        
    }

    @Override
    public Propietario modificar(int nf, Propietario f) {
        this.propietarioList.set(this.searchposicion(nf), f);
        return f;
    }

    @Override
    public Propietario eliminar(int f) {
        var propiedad=this.propietarioList.get(f);
        this.propietarioList.remove(f);
        return propiedad;
        
    }

    @Override
    public List<Propietario> listar() {
        return this.propietarioList;
       
    }

    @Override
    public int searchposicion(int c) {
        var posicion =-1;
        var i=0;
        for(var auxpro:this.propietarioList){
            if(auxpro.getCodigo()==c){
                posicion=i;
                break;
            }
            i++;
        }
        return posicion;
    }
    
}
