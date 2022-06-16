package hibernate_inheritance.demo.joined;

import javax.transaction.Transaction;

import org.hibernate.Session;

public class Main {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
//		emp1.setId(1);
		emp1.setName("AAA");
		
		RegularEmployee emp2 = new RegularEmployee();
//		emp2.setId(20);
		emp2.setName("RRR");
		emp2.setSalary(9999);
		emp2.setBonus(2000);
		
		ContractorEmployee emp3 = new ContractorEmployee();
//		emp3.setId(30);
		emp3.setName("CCC");
		emp3.setPay_per_hour(300);
		emp3.setContractDuration("one year");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		org.hibernate.Transaction tx = session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		tx.commit();
		session.close();
		HibernateUtil.close();
	}

}
