package hibernate_inheritance.demo.table_per_class;

import javax.transaction.Transaction;

import org.hibernate.Session;

import hibernate_inheritance.demo.HibernateUtil;

public class TestTablePerClass {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		
		Emp e1 = new Emp();
//		e1.setId(1);
		e1.setName("AAA");
		
		P_Emp e2 = new P_Emp();
		e2.setName("BBB");
		e2.setBonus(1000);
		e2.setSalary(20000);
		
		C_Emp e3 = new C_Emp();
		e3.setName("CCC");
		e3.setContractDuration("two months");
		e3.setPay_per_hour(500);
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		tx.commit();
		session.close();
		HibernateUtil.close();
	}

}
