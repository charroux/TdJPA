package livraison;

import javax.persistence.Entity;

@Entity
public class ClientPremium extends Client{
	
	int reduction;

	public ClientPremium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientPremium(String adresse) {
		super(adresse);
		// TODO Auto-generated constructor stub
	}

	public ClientPremium(int reduction, String adresse) {
		super(adresse);
		this.reduction = reduction;
	}

	public int getReduction() {
		return reduction;
	}

	public void setReduction(int reduction) {
		this.reduction = reduction;
	}
	
	

}
