package com.restaurant.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.restaurant.model.Menu;

/**
 * Servlet implementation class menucontroller
 */
@WebServlet("/MenuController")
public class MenuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String lunch = request.getParameter("Lunch");
		String dinner = request.getParameter("Dinner");
		Menu mn = new Menu();
		mn.setLunch(lunch);
		mn.setDinner(dinner);
		request.setAttribute("mn", mn);
		RequestDispatcher dispatcher = request.getRequestDispatcher("showmenu.jsp");
		dispatcher.forward(request, response);
		//request.getRequestDispatcher("showmenu.jsp").forward(request, response);
		
		
	}

}
