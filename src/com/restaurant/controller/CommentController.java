package com.restaurant.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.restaurant.dao.CommentDAO;
import com.restaurant.dao.CommentDAOImpl;
import com.restaurant.model.Comment;

/**
 * Servlet implementation class CommentController
 */
@WebServlet("/CommentController")
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher = null;
	CommentDAOImpl commentDAOImpl = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		listComments(request,response);
	}
	
	private void listComments(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		commentDAOImpl = new CommentDAOImpl();
		List<Comment> theList = commentDAOImpl.getComments();
		request.setAttribute("list", theList);
		dispatcher = request.getRequestDispatcher("showcomments.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		Comment com=new Comment();
		com.setTitle(title);
		com.setDescription(description);
		commentDAOImpl=new CommentDAOImpl();
		commentDAOImpl.addComment(com);
		listComments(request,response);
		//response.sendRedirect("showcomments.jsp");
	}

}
