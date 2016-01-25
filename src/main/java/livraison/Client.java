package livraison;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Client {
	
	String adresse;
	long clef;
	Livreur livreur;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String adresse) {
		super();
		this.adresse = adresse;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getClef() {
		return clef;
	}

	public void setClef(long clef) {
		this.clef = clef;
	}

	@ManyToOne
	public Livreur getLivreur() {
		return livreur;
	}

	public void setLivreur(Livreur livreur) {
		this.livreur = livreur;
	}
	
	

}
