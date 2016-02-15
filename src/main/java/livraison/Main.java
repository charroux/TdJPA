package livraison;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		// acc�s � la configuration manager1 de la base dee donn�es
		//  manager1 fait r�f�rence au fichier persistence.xml 
		// du dossier resources/META-INF/persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();

		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		
		Client client = new Client("Paris");
		
		entityManager.persist(client);
		
		tx.commit();
	}

}
