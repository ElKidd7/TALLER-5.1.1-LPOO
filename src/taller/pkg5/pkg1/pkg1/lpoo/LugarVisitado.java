
package taller.pkg5.pkg1.pkg1.lpoo;

import java.util.Date;

public class LugarVisitado {
    private int lugarID;
    private String nombreLugar;
    private String ubicacion;
    private Date fechaVisita;
    private String comentario;

    // Constructor
    public LugarVisitado(int lugarID, String nombreLugar, String ubicacion, Date fechaVisita, String comentario) {
        this.lugarID = lugarID;
        this.nombreLugar = nombreLugar;
        this.ubicacion = ubicacion;
        this.fechaVisita = fechaVisita;
        this.comentario = comentario;
    }

    // Getters y Setters
    public int getLugarID() {
        return lugarID;
    }

    public void setLugarID(int lugarID) {
        this.lugarID = lugarID;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
