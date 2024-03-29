package br.jus.tjse.AluraServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ListaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListaEmpresasServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas(); 
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.print("<ul>");
		
		for (Empresa empresa : lista) {
			out.println("<li>" + empresa.getNome() + "</li>");
		}

		out.println("</body></html>");
		
	}


}
