package com.cogni;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegistrationServlet
 */
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=null;
		String password=null;
		String Address=null;
		String confirmpwd=null;
		PreparedStatement pstm=null;
		
		username=request.getParameter("username");
		password=request.getParameter("password");
		confirmpwd=request.getParameter("confirmpwd");
		Address=request.getParameter("Address");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","adm@123");
			pstm = con.prepareStatement("insert into login values(?, ?, ?)");
			pstm.setString(1, username);
			pstm.setString(2, password);
			pstm.setString(3, Address);
			int i=pstm.executeUpdate();
			
			pstm.close();
			con.close();
			
			 if (i > 0) {
			        
			        response.sendRedirect("welcome.jsp");
			    
			       
			    } else {
			        response.sendRedirect("UserLoginForm.html");
			    }
            
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
