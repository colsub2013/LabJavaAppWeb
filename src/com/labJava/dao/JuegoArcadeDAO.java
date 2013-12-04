package com.labJava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.labJava.beans.JuegoArcadeBean;
import com.labJava.helpers.ConexionBD;


public class JuegoArcadeDAO {
	
	public void agregar(JuegoArcadeBean juegoArcadeBean) throws SQLException {
		Connection oConexion = ConexionBD.NuevaConexion();

		PreparedStatement sentenciaSQL = oConexion.prepareStatement(
				"insert into t_juegoArcade (nombreArcade, companiaArcade, anioEdicion, id_comboEstado) values (?,?,?,?)");
		
		// Agregar código para Ejercicio 3.b  		
		
    	// Se realiza la consulta.
		sentenciaSQL.executeUpdate();
    	
        // Se cierra la conexion con la base de datos.
        oConexion.close();
	}
	
	public ArrayList<JuegoArcadeBean> recuperarTodos() throws SQLException {
    	Connection oConexion = ConexionBD.NuevaConexion();
    	
    	// Se realiza la consulta. Los resultados se guardan en el ResultSet.
    	ResultSet oResultSet = oConexion.createStatement().executeQuery(
    			"select * from t_juegoArcade order by nombreArcade");
    	
    	// Instanciamos una coleccion de la clase.
    	ArrayList<JuegoArcadeBean> listaJuegoArcadeBean = new ArrayList<JuegoArcadeBean>();

        // Se recorre el ResultSet, capturando los resultados.
        while (oResultSet.next()) {
        	JuegoArcadeBean oJuegoArcadeBean = new JuegoArcadeBean();
        	
        	oJuegoArcadeBean.setId_juegoArcade(oResultSet.getInt("id_JuegoArcade"));
        	oJuegoArcadeBean.setNombreArcade(oResultSet.getString("nombreArcade"));
        	oJuegoArcadeBean.setCompaniaArcade(oResultSet.getString("companiaArcade"));
        	oJuegoArcadeBean.setAnioEdicion(oResultSet.getInt("anioEdicion"));
        	oJuegoArcadeBean.setId_comboEstado(oResultSet.getInt("id_comboEstado"));        	
        	ComboEstadoDAO comboEstadoDAOObjetoComboSeleccionado = new ComboEstadoDAO();
			oJuegoArcadeBean.setComboEstadoBean(comboEstadoDAOObjetoComboSeleccionado.recuperarObjetoCombo(oJuegoArcadeBean.getId_comboEstado()));        	
			listaJuegoArcadeBean.add(oJuegoArcadeBean);
        }
        
        // Se cierra la conexion con la base de datos.
        oConexion.close();
        
    	return listaJuegoArcadeBean;
    }
	
	public void eliminar(int id) throws SQLException {
		Connection oConexion = ConexionBD.NuevaConexion();
    	
    	// Se realiza la consulta.
    	oConexion.createStatement().executeUpdate(
    			"delete from t_juegoArcade where id_JuegoArcade=" + id);
        
        // Se cierra la conexion con la base de datos.
        oConexion.close();
	}

}
