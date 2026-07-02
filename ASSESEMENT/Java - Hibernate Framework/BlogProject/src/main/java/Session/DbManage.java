package Session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Model.Reg;

public class DbManage {

//For inser User
	public static void insert(Reg reg) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(reg);
		transaction.commit();
	}
	
	//check login
	public static Reg checkLogin(String email, String password) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "FROM Reg R WHERE R.email = :email AND R.password = :password";
		Reg reg = (Reg) session.createQuery(hql)
				.setParameter("email", email)
				.setParameter("password", password)
				.uniqueResult();
		
		transaction.commit();
		return reg;
	}
}
