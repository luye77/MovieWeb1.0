package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import util.Test;

public class CountServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public CountServlet() {
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

		String f=null;
		Test t=new Test();
		String f5=request.getParameter("f5");
		//刷新之后才可以出现avg
		if(f5!=null){
			String mid=(String) request.getSession().getAttribute("mid");
			String uid=(String) request.getSession().getAttribute("uid");
			String avg=t.countAvg(f5,mid,uid);
			//在doPost()方法中为啥不行
			request.getSession().setAttribute("avg", avg);
			System.out.println(avg);
			request.getRequestDispatcher("../single.jsp").forward(request, response);
		}
		String f4=request.getParameter("f4");
		if(f4!=null){
			String mid=(String) request.getSession().getAttribute("mid");
			String uid=(String) request.getSession().getAttribute("uid");
			String avg=t.countAvg(f4,mid,uid);
			request.getSession().setAttribute("avg", avg);
			System.out.println(avg);
			request.getRequestDispatcher("../single.jsp").forward(request, response);
		}
		String f3=request.getParameter("f3");
		if(f3!=null){
			String mid=(String) request.getSession().getAttribute("mid");
			String uid=(String) request.getSession().getAttribute("uid");
			String avg=t.countAvg(f3,mid,uid);
			request.getSession().setAttribute("avg", avg);
			System.out.println(avg);
			request.getRequestDispatcher("../single.jsp").forward(request, response);
		}
		String f2=request.getParameter("f2");
		if(f2!=null){
			String mid=(String) request.getSession().getAttribute("mid");
			String uid=(String) request.getSession().getAttribute("uid");
			String avg=t.countAvg(f2,mid,uid);
			request.getSession().setAttribute("avg", avg);
			System.out.println(avg);
			request.getRequestDispatcher("../single.jsp").forward(request, response);
		}
		String f1=request.getParameter("f1");
		if(f1!=null){
			String mid=(String) request.getSession().getAttribute("mid");
			String uid=(String) request.getSession().getAttribute("uid");
			String avg=t.countAvg(f1,mid,uid);
			request.getSession().setAttribute("avg", avg);
			System.out.println(avg);
			request.getRequestDispatcher("../single.jsp").forward(request, response);
		}
		//doPost(request,response);
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

//		String f=null;
//		Test t=new Test();
//		String f5=request.getParameter("f5");
//		if(f5!=null){
//			String avg=t.countAvg(f5);
//			request.getSession().setAttribute("avg", avg);
//			System.out.println(avg);
//			request.getRequestDispatcher("../single.jsp").forward(request, response);
//		}
//		String f4=request.getParameter("f4");
//		if(f4!=null){
//			String avg=t.countAvg(f5);
//			request.setAttribute("avg", avg);
//		}
//		String f3=request.getParameter("f3");
//		if(f3!=null){
//			String avg=t.countAvg(f5);
//			request.setAttribute("avg", avg);
//		}
//		String f2=request.getParameter("f2");
//		if(f2!=null){
//			String avg=t.countAvg(f5);
//			request.setAttribute("avg", avg);
//		}
//		String f1=request.getParameter("f1");
//		if(f1!=null){
//			String avg=t.countAvg(f5);
//			request.setAttribute("avg", avg);
//		}
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
