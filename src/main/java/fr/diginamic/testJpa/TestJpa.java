package fr.diginamic.testJpa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.*;

public class TestJpa {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test-jpa");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		
	}
}
