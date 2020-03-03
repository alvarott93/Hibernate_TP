package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.FormationDao;
import model.Formation;

/**
 * Servlet implementation class addforma
 */
@WebServlet("/addforma")
public class addforma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addforma() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
		this.getServletContext().getRequestDispatcher("/WEB-INF/sitesweb/addformation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Formation forma=new Formation();
		forma.setId(Integer.parseInt(request.getParameter("id")));	
		forma.setTheme(request.getParameter("descrip"));
		FormationDao daoform = new FormationDao();
		
		daoform.ajoutForm(forma);
		System.out.println("formation ajoutee: "+forma.getTheme());
		request.setAttribute("message", "Formation has been created succesfully");
		this.getServletContext().getRequestDispatcher("/WEB-INF/sitesweb/index.jsp").forward(request, response);
		
	}

}
