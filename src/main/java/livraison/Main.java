package livraison;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		// accès à la configuration manager1 de la base dee données
		//  manager1 fait référence au fichier persistence.xml 
		// du dossier resources/META-INF/persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();

		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		
		Livreur livreur = new Livreur("le livreur");
		List<Client> clients = livreur.getClients();
		
		Client client = new Client();
		Adresse paris = new Adresse(10, "rue de Paris", "Paris");
		client.setAdresse(paris);
		paris.setClient(client);
		
		clients.add(client);
		client.setLivreur(livreur);
		
		ClientPremium clientPremium = new ClientPremium();
		Adresse marseille = new Adresse(10, "rue de Marseille", "Marseille");
		clientPremium.setAdresse(marseille);
		marseille.setClient(clientPremium);
		
		clients.add(clientPremium);
		clientPremium.setLivreur(livreur);
		
		livreur.setClients(clients);
		
		entityManager.persist(paris);
		entityManager.persist(client);
		entityManager.persist(marseille);
		entityManager.persist(clientPremium);
		entityManager.persist(livreur);
		
		tx.commit();
	}

}
