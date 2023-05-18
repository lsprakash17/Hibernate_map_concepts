package Bidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver 
{
public static void main(String[] args) 
{
EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

Pancard1 p =new Pancard1();
p.setAddress("Banglore");
p.setName("Prakash");
p.setDOB("01/1/2020");
p.setPan_id(856495);
p.setPh_no(789456122);


Bank b=new Bank();
b.setAcc_no(789456);
b.setBrachAddresas("Rajajinagar");
b.setBranchId("56498");
b.setIFSC("1456");
b.setPancard1s(p);


Bank c=new Bank();
c.setAcc_no(7894578);
c.setBrachAddresas("ESIC");
c.setBranchId("56487");
c.setIFSC("564923");
c.setPancard1s(p);

List<Bank> banks=new ArrayList<Bank>();
banks.add(b);
banks.add(c);
p.setBanks(banks);

 entityTransaction.begin();
 entityManager.persist(p);
 entityManager.persist(b);
 entityManager.persist(c);
 entityTransaction.commit();


}
}
