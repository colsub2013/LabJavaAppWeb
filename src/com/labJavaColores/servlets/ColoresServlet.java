package com.labJavaColores.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ColoresServlet
 */
@WebServlet("/ColoresServlet")
public class ColoresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String RUTA_ABS_HTTP = "/colores/colores.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ColoresServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setHeader("Cache-Control","no-cache"); 
		response.setHeader("Pragma","no-cache");
		response.setDateHeader ("Expires", 0);

		String colorSeleccionado = (String)request.getParameter("colores");
		
		request.setAttribute("colorSeleccionado", colorSeleccionado);
		
		getServletContext().getRequestDispatcher(RUTA_ABS_HTTP).forward(
				request, response);
		
	}

}