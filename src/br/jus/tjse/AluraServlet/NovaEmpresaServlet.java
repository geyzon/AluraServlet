package br.jus.tjse.AluraServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NovaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeEmpresa = request.getParameter("nome");
		System.out.println("Cadastrando nova empresa: " + nomeEmpresa);
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html dir=\"ltr\" lang=\"pt-BR\">\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"UTF-8\" />\r\n" + 
				"<title>Nova Empresa</title>\r\n" + 
				"</head> <body>Empresa " + nomeEmpresa + " cadastrada com Sucesso!</body></html>");
	}

}
