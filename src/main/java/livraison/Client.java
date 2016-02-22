package livraison;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Client {
	
	long clef;
	Livreur livreur;
	Adresse adresse;

	public Client() {
		super();
	}

	@OneToOne
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
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
