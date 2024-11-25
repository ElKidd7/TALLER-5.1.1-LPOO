
package taller.pkg5.pkg1.pkg1.lpoo;

import java.util.Date;

public class Gasto {
    private int gastoID;
    private String categoria;
    private float monto;
    private Date fecha;

    // Constructor
    public Gasto(int gastoID, String categoria, float monto, Date fecha) {
        this.gastoID = gastoID;
        this.categoria = categoria;
        this.monto = monto;
        this.fecha = fecha;
    }

    // Getters y Setters
    public int getGastoID() {
        return gastoID;
    }

    public void setGastoID(int gastoID) {
        this.gastoID = gastoID;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}

