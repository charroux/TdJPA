package livraison;

import javax.persistence.Entity;

@Entity
public class ClientPremium extends Client{
	
	int reduction;

	public ClientPremium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getReduction() {
		return reduction;
	}

	public void setReduction(int reduction) {
		this.reduction = reduction;
	}
	
	

}
