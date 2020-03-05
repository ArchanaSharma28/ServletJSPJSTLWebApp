package com.cogni;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
    	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=null;
		String password=null;
        Statement st=null;
		Connection con=null;
		int flag=0;
		
		
		username = request.getParameter("username");
        password = request.getParameter("password");
        
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
	        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","adm@123"); 
	 
		st= con.createStatement();
		ResultSet rs = st.executeQuery("select * from login");
		
		while(rs.next()){
			if((rs.getString(1).equals(username) && (rs.getString(2).equals(password))))
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1){
				RequestDispatcher rd=request.getRequestDispatcher("UserSuccess.jsp");
			 rd.forward(request, response);
		}
			else 
			{
				RequestDispatcher rd=request.getRequestDispatcher("UserFailure.jsp");
			    rd.forward(request, response);
			  
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
}
}


