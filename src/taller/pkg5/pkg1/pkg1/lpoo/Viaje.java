
package taller.pkg5.pkg1.pkg1.lpoo;

import java.util.Date;
import java.util.List;

public class Viaje {
    private int viajeID;
    private String destino;
    private Date fechaInicio;
    private Date fechaFin;
    private float presupuesto;
    private List<LugarVisitado> lugaresVisitados;
    private List<Gasto> gastos;

    // Constructor
    public Viaje(int viajeID, String destino, Date fechaInicio, Date fechaFin, float presupuesto) {
        this.viajeID = viajeID;
        this.destino = destino;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.presupuesto = presupuesto;
    }

    // Getters y Setters
    public int getViajeID() {
        return viajeID;
    }

    public void setViajeID(int viajeID) {
        this.viajeID = viajeID;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<LugarVisitado> getLugaresVisitados() {
        return lugaresVisitados;
    }

    public void setLugaresVisitados(List<LugarVisitado> lugaresVisitados) {
        this.lugaresVisitados = lugaresVisitados;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }
}

