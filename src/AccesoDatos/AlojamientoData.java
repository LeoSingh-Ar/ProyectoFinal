/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.Alojamiento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas
 */
public class AlojamientoData {
    private Connection con = null;
    
    public AlojamientoData() {
        con = Conexion.getConexion();
    }
    
    public void crearAlojamiento(Alojamiento alojamiento) {
        String sql = "INSERT INTO alojamiento (tipoAlojamiento, estado, servicio, importeDiario, idCiudadDestino) VALUES ( ?, ?, ?, ?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //ps.setDate(1, Date.valueOf(alojamiento.getFechaIn()));
            //ps.setDate(2, Date.valueOf(alojamiento.getFechaOn()));
            ps.setString(1, alojamiento.getTipoAlojamiento());
            ps.setBoolean(2, alojamiento.isEstado());
            ps.setString(3, alojamiento.getServicio());
            ps.setDouble(4, alojamiento.getImporteDiario());
            ps.setInt(5, alojamiento.getCiudadDestino().getIdCiudad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            System.out.println(rs);
            if (rs.next()){     
                alojamiento.setIdAlojamiento(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alojamiento creado con éxito.");
            }
            ps.close();
        } catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento" + ex.getMessage());
        }
    }
    
    public Alojamiento buscarAlojamientoPorId(int id) {
        Alojamiento alojamiento = new Alojamiento();
        CiudadData cd = new CiudadData();
        PreparedStatement ps = null;
        try {
            String sql = "SELECT tipoAlojamiento, servicio, importeDiario, idCiudadDestino FROM alojamiento WHERE idAlojamiento = ? AND estado = 1";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id ); 
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                alojamiento.setIdAlojamiento(id);
                alojamiento.setEstado(true);
                alojamiento.setTipoAlojamiento(rs.getString("tipoAlojamiento"));
                alojamiento.setServicio(rs.getString("servicio"));
                alojamiento.setImporteDiario(rs.getDouble("importeDiario"));
                alojamiento.setCiudadDestino(cd.buscarCiudadPorId(rs.getInt("idCiudadDestino")));
            }else{
                JOptionPane.showMessageDialog(null, "Alojamiento no disponible.");
                ps.close();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento "+ex.getMessage()); 
        }
        return alojamiento;
    }
    
    public void modificarAlojamiento(Alojamiento alojamiento) {
        String sql = "UPDATE alojamiento SET tipoAlojamiento = ?, estado = ?, servicio = ?, importeDiario = ? WHERE idAlojamiento = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, alojamiento.getTipoAlojamiento());
            ps.setBoolean(2, alojamiento.isEstado());
            ps.setString(3, alojamiento.getServicio());
            ps.setDouble(4, alojamiento.getImporteDiario());
            ps.setInt(5, alojamiento.getIdAlojamiento());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Se actulizó el alojamiento");
            } else{
               JOptionPane.showMessageDialog(null, "Alojamiento no disponible"); 
            }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento" + ex.getMessage());
        }
    }
    
    public List<Alojamiento> listarAlojamientos() {
        List<Alojamiento> alojamientos = new ArrayList<>();
        //AlojamientoData cdw = new AlojamientoData();
        CiudadData cd = new CiudadData();
        try {
            String sql = "SELECT * FROM alojamiento WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setTipoAlojamiento(rs.getString("tipoAlojamiento"));
                alojamiento.setEstado(true);
                alojamiento.setServicio(rs.getString("servicio"));
                alojamiento.setImporteDiario(rs.getDouble("importeDiario"));
                alojamiento.setCiudadDestino(cd.buscarCiudadPorId(rs.getInt("idCiudadDestino")));
                alojamientos.add(alojamiento);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento");
        }
        return alojamientos;
    }
    
    public void eliminarAlojamiento(int id) {
        try{
            String sql = "UPDATE alojamiento SET estado = 0 WHERE idAlojamiento = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila=ps.executeUpdate(); 
            if(fila == 1){
                JOptionPane.showMessageDialog(null, " Se eliminó el alojamiento.");
            } 
            ps.close(); 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alojamiento");
        }
    }
}
