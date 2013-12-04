package com.labJava.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.labJava.beans.ComboEstadoBean;
import com.labJava.helpers.ConexionBD;

public class ComboEstadoDAO {
		
	public ArrayList<ComboEstadoBean> recobrarCombo() throws SQLException {
    	Connection oConexion = ConexionBD.NuevaConexion();
    	
    	// Se realiza la consulta. Los resultados se guardan en el ResultSet.
    	ResultSet oResultSet = oConexion.createStatement().executeQuery(
    			"select * from t_comboEstado order by descComboEstado");
    	
    	// Instanciamos una coleccion de la clase.
    	ArrayList<ComboEstadoBean> listaComboEstado = new ArrayList<ComboEstadoBean>();

        // Se recorre el ResultSet, capturando los resultados.
        while (oResultSet.next()) {
        	ComboEstadoBean oComboEstadoBean = new ComboEstadoBean();
        	
        	oComboEstadoBean.setId_comboEstado(oResultSet.getInt("id_comboEstado"));
        	oComboEstadoBean.setDescComboEstado(oResultSet.getString("descComboEstado"));
        	
        	listaComboEstado.add(oComboEstadoBean);
        }
        
        // Se cierra la conexion con la base de datos.
        oConexion.close();
        
    	return listaComboEstado;
    }
	
	public ComboEstadoBean recuperarObjetoCombo(int id) throws SQLException {
    	Connection oConexion = ConexionBD.NuevaConexion();
    	
    	// Se realiza la consulta. Los resultados se guardan en el ResultSet.
    	ResultSet oResultSet = oConexion.createStatement().executeQuery(
    			"Agregar código" + id);	// Agregar código para Ejercicio 3.a

    	// Instanciamos un nuevo objeto de la clase.
    	ComboEstadoBean oComboEstadoBean = new ComboEstadoBean();
    	
        // Se recorre el ResultSet, capturando los resultados.
        while (oResultSet.next()) {
        	oComboEstadoBean.setId_comboEstado(oResultSet.getInt("id_comboEstado"));
        	oComboEstadoBean.setDescComboEstado(oResultSet.getString("descComboEstado"));
        }
        
        // Se cierra la conexion con la base de datos.
        oConexion.close();
        
        return oComboEstadoBean;
    }

}
