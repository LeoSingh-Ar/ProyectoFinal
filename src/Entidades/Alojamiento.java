/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;



/**
 *
 * @author Tomas
 */
public class Alojamiento {
    
    private int idAlojamiento;
    private boolean estado;
    private String servicio;
    private double importeDiario;
    private Ciudad ciudadDestino;
    private String tipoAlojamiento;

    public Alojamiento() {
    }

    public Alojamiento(boolean estado, String servicio, double importeDiario, Ciudad ciudadDestino, String tipoAlojamiento) {

        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDestino = ciudadDestino;
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public Alojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(double importeDiario) {
        this.importeDiario = importeDiario;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }
    
    @Override
    public String toString() {
        return idAlojamiento + "- " + tipoAlojamiento + ", " + servicio + ", " + estado;
                
        //"Ciudad{" + "idCiudad=" + idCiudad + ", nombre=" + nombre + ", provincia=" + provincia + ", pais=" + pais + '}';
    }
    
}
