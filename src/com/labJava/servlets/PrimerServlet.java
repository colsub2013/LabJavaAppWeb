package com.labJava.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.labJava.beans.PrimerObjetoBean;

/**
 * Servlet implementation class PrimerServlet
 */

//	Agregar código para Ejercicio 1.a 
public class PrimerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	public static final String RUTA_ABS_HTTP = "/primerJSP.jsp?param2=LabJava&param3=2013";
	public static final String RUTA_REL_HTTP = "primerJSP.jsp?param2=LabJava&param3=2013";

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setHeader("Cache-Control","no-cache"); 
		response.setHeader("Pragma","no-cache");
		response.setDateHeader ("Expires", 0);

		List<PrimerObjetoBean> listaObjetos = new ArrayList<PrimerObjetoBean>();
		listaObjetos.add(new PrimerObjetoBean(1, "valor1"));
		listaObjetos.add(new PrimerObjetoBean(2, "valor2"));
		
		request.setAttribute("listaObjetos", listaObjetos);
		
		request.setAttribute("primerObjetoBean", new PrimerObjetoBean(1, "valor1"));

		// Agregar código para Ejercicio 1.b
				
		getServletContext().getRequestDispatcher(RUTA_ABS_HTTP).forward(
				request, response);

	}

}
