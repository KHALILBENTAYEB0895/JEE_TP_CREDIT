package web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.CreditMetierImpl;
import metier.ICreditMetier;

@WebServlet(name = "cs",urlPatterns = {"/controleur","*.do"} )
public class ControleurServlet extends HttpServlet {
	
	private ICreditMetier metier;
	
	@Override
	public void init() throws ServletException {
		metier = new CreditMetierImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("creditModel", new CreditModel());
		request.getRequestDispatcher("VueCredit.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double montant = Double.parseDouble(request.getParameter("montant"));
		double taux = Double.parseDouble(request.getParameter("taux"));
		int duree = Integer.parseInt(request.getParameter("duree"));
		
		CreditModel model = new CreditModel();
		model.setMontant(montant);
		model.setDuree(duree);
		model.setTaux(taux);
		
		double resultat = metier.calculerMensualiteCredit(montant, taux, duree);
		model.setResultat(resultat);
		
		request.setAttribute("creditModel", model);
		
		request.getRequestDispatcher("VueCredit.jsp").forward(request, response);
	}
}
