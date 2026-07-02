package Session;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Model.Blog;

public class BlogManage {

	public void saveBlog(Blog b) {
      SessionFactory factory = new Configuration().configure().buildSessionFactory();
      Session session = factory.openSession();
      Transaction tx = session.beginTransaction();
      session.persist(b);
      tx.commit();
      session.close();
    }

    public List<Blog> getAllBlogs() {
         SessionFactory factory = new Configuration().configure().buildSessionFactory();
         Session session = factory.openSession();
        List<Blog> list = session.createQuery("from Blog", Blog.class).list();
        session.close();
        return list;
    }
    
    public void deleteBlog(int id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Blog blog = session.get(Blog.class, id);
		if (blog != null) {
			session.delete(blog);
		}
		tx.commit();
		session.close();
	}

    public Blog getBlogById(int id) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Blog blog = session.get(Blog.class, id);
        session.close();
        return blog;
    }

    public void updateBlog(Blog b) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(b);
        tx.commit();
        session.close();
    }

    public List<Blog> searchBlogs(String keyword) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "FROM Blog WHERE title LIKE :keyword OR tags LIKE :keyword";
        List<Blog> list = session.createQuery(hql, Blog.class)
                                 .setParameter("keyword", "%" + keyword + "%")
                                 .list();
        session.close();
        return list;
    }

    public List<Blog> getBlogsByUserId(int userId) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "FROM Blog WHERE user_id = :userId";
        List<Blog> list = session.createQuery(hql, Blog.class)
                                 .setParameter("userId", userId)
                                 .list();
        session.close();
        return list;
    }

    public List<Blog> getRecentBlogs() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "FROM Blog ORDER BY createdAt DESC";
        List<Blog> list = session.createQuery(hql, Blog.class).list();
        session.close();
        return list;
    }
}
