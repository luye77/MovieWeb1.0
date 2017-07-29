package servlet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import util.HibernateSessionFactory;
import util.Test;

import entity.User;

public class DoLogin extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public DoLogin() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        Test t=new Test();
		//User u=new User();
		String username="";
		String password="";
		String uid="";
		String str="";
		boolean flag=true;
		
		
		try {
			String k = (String) request.getSession()
					.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
			str = request.getParameter("r");

			username=request.getParameter("username");
			password=request.getParameter("password");
			uid=t.quaryUserId(username, password);
			request.getSession().setAttribute("uid",uid);
			flag=t.quaryUser(username, password);
			if(k.equals(str)&&flag){
				request.getRequestDispatcher("../loginf.jsp").forward(request,response);	
				
			}else{
				response.sendRedirect("../loginf1.jsp");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

//	public boolean checkCode(HttpServletRequest request, HttpServletResponse response){
//		System.out.println("oh");
//		boolean b=false;
//		String k = (String) request.getSession()
//				.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
//		String str = request.getParameter("r");
//		if (k.equals(str)){
//			b=true;
//	}else{
//		b=false;
//		}
//		return b;
//	}
	/**
	 * Initialization of the servlet. <br>
	 * @throws IOException 
	 *
	 * @throws ServletException if an error occurs
	 */
	

	public void init() throws ServletException {
		// Put your code here
	}

}
