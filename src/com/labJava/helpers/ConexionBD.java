package com.labJava.helpers;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class ConexionBD {
	
	private static String host = null;
	private static String db = null;
	private static String username = null;
	private static String password = null;
	
	private static void RecuperarDatosConexion() {

		try {
			Document d = new SAXBuilder().build(new File(System.getProperty("user.home")+ "/config.xml"));
			Element dbElement = d.getRootElement();
			
			host = dbElement.getChildText("host");
			db = dbElement.getChildText("db");
			username = dbElement.getChildText("username");
			password = dbElement.getChildText("password");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static Connection NuevaConexion() throws SQLException {
		RecuperarDatosConexion();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();			
		}
		
		StringBuilder ubicacionServicio = new StringBuilder();
		ubicacionServicio.append("jdbc:mysql://");
		ubicacionServicio.append(host);
		ubicacionServicio.append("/");
		ubicacionServicio.append(db);
		
		return DriverManager.getConnection (
				ubicacionServicio.toString(), username, password);
	}
}