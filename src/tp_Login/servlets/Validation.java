package tp_Login.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp_Login.modelo.Query;

@WebServlet("/Validation")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Validation() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		Query queryUser = new Query();
		try {
			//System.out.println(con.Authentication(user, password));
			if(queryUser.Authentication(user, password))
			//if(user.equals("juan") && password.equals("0000"))
				response.sendRedirect("main.jsp");
			else
				response.sendRedirect("error.jsp");
		} catch (SQLException e) {
			System.out.println("Error");
		}
	}

}
