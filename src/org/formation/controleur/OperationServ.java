package org.formation.controleur;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * Servlet implementation class OperationServ
 */
@WebServlet("/OperationServ")
public class OperationServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperationServ() {
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
		int idCompteDepart = Integer.parseInt(request.getParameter("idCD"));
		int idCompteCible = Integer.parseInt(request.getParameter("idCC"));
		
		String dateOp = request.getParameter("dateOperation");
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		System.out.println("Date est ------------------------"+dateOp);
		
		Date date=null;
		try {
			date = (Date) format.parse(dateOp);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double montant=Double.parseDouble(request.getParameter("montant"));
		AccountOperation_ServiceLocator locate=new AccountOperation_ServiceLocator();
		locate.setAccountOperationSOAPEndpointAddress("http://localhost:8080/proxibanqueSIv3/services/AccountOperationSOAP");
		AccountOperationSOAPStub opStub = null;
		try {
			opStub = (AccountOperationSOAPStub) locate.getAccountOperationSOAP();
			OperationType opType =new OperationType();
			opType.setIdClient(idClient);
			opType.setIdCompteDepart(idCompteDepart);
			opType.setIdCompteCible(idCompteCible);
			opType.setDate(date);
			opType.setMontant(montant);
			opType.setType("VI");
			
			String resultat= opStub.createOperation(opType);
			HttpSession session = request.getSession();
			session.setAttribute("Retour", resultat);
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
	        
	}

}
