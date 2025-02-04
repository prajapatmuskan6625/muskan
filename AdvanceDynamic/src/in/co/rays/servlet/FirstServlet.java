package in.co.rays.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Address;
 
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fname = req.getParameter("FirstName");
		String lname = req.getParameter("LastName");
		
		System.out.println("FirstServlet doGet");
		System.out.println(fname);
		System.out.println(lname);
		resp.sendRedirect("SecondServlet");
		
		}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fname = req.getParameter("FirstName");
		String lname = req.getParameter("LastName");
		
		System.out.println("FirstServlet doGet");
		System.out.println(fname);
		System.out.println(lname);
		resp.sendRedirect("SecondServlet");
		
	}

}
