package bo.common;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionUtil {

	private static EntityManagerFactory emf;

	public static EntityManagerFactory getEMF() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("Model");
		}
		return emf;
	}

}
