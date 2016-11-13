package services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ejb.entitites.ecommerce.Auteur;
import ejb.entitites.ecommerce.Dvd;
import ejb.entitites.ecommerce.Realisateur;
import ejb.sessions.AdministrationEcommerceLocal;

@Stateless
@Path("/")
public class AdministrationEcommerceRest {

	@EJB
	private AdministrationEcommerceLocal interfaceEcommerceRest;

	@GET
	@Path("/author/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Auteur get_auteur(@PathParam(value="code")Long id) {
		return interfaceEcommerceRest.get_auteur(id);
	}


	@GET
	@Path("/dvd/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Dvd get_dvd(@PathParam(value="code") Long id) {
		return interfaceEcommerceRest.get_dvd(id);
	}
	@GET
	@Path("/realisator/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Realisateur get_realisateur(@PathParam(value="code") Long id) {
		
		return interfaceEcommerceRest.get_realisateur(id);
	}

	@POST
	@Path("/author")
	@Produces(MediaType.APPLICATION_JSON)
	public Auteur add_auteur(Auteur auteur) {
		return interfaceEcommerceRest.add_auteur(auteur);
	}


	@POST
	@Path("/dvd")
	@Produces(MediaType.APPLICATION_JSON)
	public Dvd add_dvd(Dvd dvd) {
		return interfaceEcommerceRest.add_dvd(dvd);
	}

	@POST
	@Path("/realisator")
	@Produces(MediaType.APPLICATION_JSON)
	public Realisateur add_realisateur(Realisateur realisateur) {
		return interfaceEcommerceRest.add_realisateur(realisateur);
	}

	@GET
	@Path("/author_list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Auteur> list_auteur() {
		return interfaceEcommerceRest.list_auteur();
	}

	
	@GET
	@Path("/dvd_list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Dvd> list_dvd() {
		return interfaceEcommerceRest.list_dvd();
	}

	@GET
	@Path("/realisator")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Realisateur> list_realisateur() {
		return interfaceEcommerceRest.list_realisateur();
	}
	
	
	
}
