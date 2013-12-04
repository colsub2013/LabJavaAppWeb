package com.labJava.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.labJava.beans.JuegoArcadeBean;
import com.labJava.constantes.Constantes;
import com.labJava.dao.ComboEstadoDAO;
import com.labJava.dao.JuegoArcadeDAO;

/**
 * Servlet implementation class AppWebServlet
 */
@WebServlet("/AppWebServlet")
public class AppWebServlet extends HttpServlet implements Constantes {
	private static final long serialVersionUID = 1L;
	public static final String RUTA_ABS_HTTP = "/appWebJSP.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AppWebServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
		
		Integer idEstadoSeleccionado = null;
		
		try {

			ComboEstadoDAO ComboEstadoDAORecupCombo = new ComboEstadoDAO();
			request.setAttribute("listaComboEstado", ComboEstadoDAORecupCombo.recobrarCombo());

			String comando = (String) request.getParameter("comando");
			String id = (String) request.getParameter("id");
			if (comando != null) {

				if (id != null && comando.equals(Constantes.COMANDO_BORRAR)) {
					JuegoArcadeDAO juegoArcadeDAOBorrar = new JuegoArcadeDAO();
					juegoArcadeDAOBorrar.eliminar((Integer.valueOf(id)));
				} else if (comando.equals(Constantes.COMANDO_INSERTAR)) {

					if (request.getParameter("nombreArcade") != null && !request.getParameter("nombreArcade").equals("")) {
						JuegoArcadeBean juegoArcadeBean = new JuegoArcadeBean();
						juegoArcadeBean.setNombreArcade((String) request.getParameter("nombreArcade"));
						juegoArcadeBean.setCompaniaArcade((String) request.getParameter("companiaArcade"));
						juegoArcadeBean.setAnioEdicion(Integer.valueOf((String) request.getParameter("edicionArcade")));
						idEstadoSeleccionado = Integer.valueOf((String) request.getParameter("estadoArcade"));
						juegoArcadeBean.setId_comboEstado(idEstadoSeleccionado);
						JuegoArcadeDAO JuegoArcadeDAOAgregar = new JuegoArcadeDAO();
						JuegoArcadeDAOAgregar.agregar(juegoArcadeBean);
					}

					request.removeAttribute("nombreArcade");
					request.removeAttribute("companiaArcade");
					request.removeAttribute("edicionArcade");

				}
			}

			JuegoArcadeDAO juegoArcadeDAORecupTodos = new JuegoArcadeDAO();
			request.setAttribute("listaObjetosArcade", juegoArcadeDAORecupTodos.recuperarTodos());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		getServletContext().getRequestDispatcher(RUTA_ABS_HTTP).forward(request, response);
	}

}
