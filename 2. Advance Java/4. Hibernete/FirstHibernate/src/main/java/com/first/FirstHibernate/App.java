package com.first.FirstHibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.first.FirstHibernate.entity.Address;
import com.first.FirstHibernate.entity.College;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Application Started............" );

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Session session = factory.openSession();
        
        Transaction tk = session.beginTransaction();
        
//        College clg = new College(1,"D. Y. Patil College of Engineering, Akurdi",1000,"Akurdi, Pune","Savtribai Phule Pune University");
//        session.save(clg);
        
//        Address ad = new Address();
//        ad.setCity("Malegaon");
//        ad.setState("Maharashtra");
//        ad.setAddDate(new Date());
//        
//        FileInputStream fis = new FileInputStream("src/main/java/mickey.jpg");
//        
//        byte [] b = new byte[fis.available()];
//        
//        fis.read(b);
//        
//        ad.setImage(b);
//        
//        session.save(ad);
//        
//        tk.commit();
        
        Address ad = (Address)session.load(Address.class, 1);
        
        System.out.println(ad.getCity() + " " + ad.getState());
        
        
        session.close();
        
        
    }
}
