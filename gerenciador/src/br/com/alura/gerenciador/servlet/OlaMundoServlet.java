package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// oi
@WebServlet(urlPatterns="/oi")
public class OlaMundoServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
		
		PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("Olá Mundo ,parabens José , vc escreveu seu primeiro servlets .");	
			out.println("</body>");	
			out.println("</html>");	
			
		System.out.println("O servlet OlaMundoServilet foi chamado ");	
	} 
}
