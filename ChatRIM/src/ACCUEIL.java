import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ACCUEIL extends HttpServlet {


	@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<HTML>");
	out.println("<form>");
	out.println("<label> ");
	out.println("Login");
	out.println("</label>");
	out.println("<input/>");
	out.println("<label>");
	out.println("password");
	out.println("</label>");
	out.println("<input/>");
	out.println("/form");
	out.println("</HTML>");
	//super.serice(request, response);
	out.close();
}
}