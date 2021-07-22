package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// url = http://localhost:8080/gerenciador/novaEmpresa?nome=Caelum
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");
		
		// Chamando o JSP
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		request.setAttribute("empresaApelido", empresa.getNome());
		rd.forward(request, response);
		
	}
}