package cl.cesfam.ENTITY;
// Generated 16-04-2017 17:23:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Componente generated by hbm2java
 */
public class Componente  implements java.io.Serializable {


     private int idComponente;
     private String nombreComponente;
     private Set composicions = new HashSet(0);

    public Componente() {
    }

	
    public Componente(String nombreComponente) {
        
        this.nombreComponente = nombreComponente;
    }
    public Componente( String nombreComponente, Set composicions) {
       
       this.nombreComponente = nombreComponente;
       this.composicions = composicions;
    }
   
    public int getIdComponente() {
        return this.idComponente;
    }
    
    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }
    public String getNombreComponente() {
        return this.nombreComponente;
    }
    
    public void setNombreComponente(String nombreComponente) {
        this.nombreComponente = nombreComponente;
    }
    public Set getComposicions() {
        return this.composicions;
    }
    
    public void setComposicions(Set composicions) {
        this.composicions = composicions;
    }




}

