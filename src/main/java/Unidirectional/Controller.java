package Unidirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Pancard P = new Pancard();
		P.setPan_id(2342346);
		P.setName("Preetham");
		P.setAddress("Rajajinagar");
		P.setPh_no(987653425);
		P.setDOB("05/11/1998");

		Banka b = new Banka();
		b.setAccount_no(2014465);
		b.setAddress("Tumkur");
		b.setBranch_code("123");
		b.setIfsc_code("56821");

		Banka c = new Banka();
		c.setAccount_no(876543);
		c.setAddress("Bangalore");
		c.setBranch_code("75687");
		c.setIfsc_code("45678");

		List<Banka> bank = new ArrayList<Banka>();
		bank.add(b);
		bank.add(c);
		P.setBank(bank);
		entityTransaction.begin();
		entityManager.persist(P);
		entityManager.persist(b);
		entityManager.persist(c);
		entityTransaction.commit();
		System.out.println("OneToo many added datatabase");
	}
}
