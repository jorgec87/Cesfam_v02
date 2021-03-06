package cl.cesfam.ENTITY;
// Generated 16-04-2017 17:23:15 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * EventoStock generated by hbm2java
 */
public class EventoStock  implements java.io.Serializable {


     private int idEventoStock;
     private Medicamento medicamento;
     private Paciente paciente;
     private Date fechaEventoStock;
     private char reserva;
     private String observacion;
     private int estado;

    public EventoStock() {
    }

	
    public EventoStock( Date fechaEventoStock, char reserva, int estado) {
       
        this.fechaEventoStock = fechaEventoStock;
        this.reserva = reserva;
        this.estado = estado;
    }
    public EventoStock( Medicamento medicamento, Paciente paciente, Date fechaEventoStock, char reserva, String observacion, int estado) {
      
       this.medicamento = medicamento;
       this.paciente = paciente;
       this.fechaEventoStock = fechaEventoStock;
       this.reserva = reserva;
       this.observacion = observacion;
       this.estado = estado;
    }
   
    public int getIdEventoStock() {
        return this.idEventoStock;
    }
    
    public void setIdEventoStock(int idEventoStock) {
        this.idEventoStock = idEventoStock;
    }
    public Medicamento getMedicamento() {
        return this.medicamento;
    }
    
    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Date getFechaEventoStock() {
        return this.fechaEventoStock;
    }
    
    public void setFechaEventoStock(Date fechaEventoStock) {
        this.fechaEventoStock = fechaEventoStock;
    }
    public char getReserva() {
        return this.reserva;
    }
    
    public void setReserva(char reserva) {
        this.reserva = reserva;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public int getEstado() {
        return this.estado;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }




}


