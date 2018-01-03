package org.formation.controleur;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import org.proxibanqueSI.www.AccountOperation.AccountOperationSOAPStub;
import org.proxibanqueSI.www.AccountOperation.AccountOperation_ServiceLocator;
import org.proxibanqueSI.www.AccountOperation.OperationType;

/**
 * Servlet implementation class OperRechercheServ
 */
@WebServlet("/OperRechercheServ")
public class OperRechercheServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperRechercheServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idClient = Integer.parseInt(request.getParameter("idClient"));
		
		AccountOperation_ServiceLocator locate=new AccountOperation_ServiceLocator();
		locate.setAccountOperationSOAPEndpointAddress("http://localhost:8080/proxibanqueSIv3/services/AccountOperationSOAP");
		AccountOperationSOAPStub opStub = null;
		try {
			opStub = (AccountOperationSOAPStub) locate.getAccountOperationSOAP();
			OperationType opType =new OperationType();
			opType.setIdClient(idClient);
			
			
			OperationType []resultat= opStub.getOperationByIdClient(idClient);
			
			HttpSession session = request.getSession();
			session.setAttribute("retour", resultat);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("operationResult.jsp");
			requestDispatcher.forward(request, response);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
