package com.sql.HibernateQueryLanguage;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.sql.HibernateQueryLanguage.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Session session = factory.openSession();
        
//        String hql = "From Student";
//        String hql = "From Student where name=:n";
//        
//        Query query = session.createQuery(hql);
//        query.setParameter("n","Ravi");
//        
//        List<Student> students =query.list();
//        
//        for(Student st: students)
//        {
//        	System.out.println(st.getName() + " " + st.getRoll_no());
//        }
        
        
//        String sql = "select * from students;";
//        
//        Query query = session.createSQLQuery(sql);
//        
//        List<Object[]> resultset = query.list();
//        
//        for(Object[] student: resultset)
//        {
//        	System.out.println(Arrays.deepToString(student));
//        }
        
        Criteria c = session.createCriteria(Student.class);
        
        List<Student> students = c.list();
        
        for(Student st:students)
        {
        	System.out.println(st.getName());
        }
        
        session.close();
        factory.close();
    }
}
