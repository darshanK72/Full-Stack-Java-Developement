package com.second.HibrenateMappings;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.second.HibrenateMappings.entity.Address;
import com.second.HibrenateMappings.entity.Answer;
import com.second.HibrenateMappings.entity.Certificate;
import com.second.HibrenateMappings.entity.Question;
import com.second.HibrenateMappings.entity.Student;
import com.second.HibrenateMappings.entity.Subject;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        
        System.out.println("Connection Successfull !!");
       
        Address ad = new Address("Nashik","Maharashtra",423203);
        
        Certificate certificate = new Certificate(1,"Diploma in Computer Technology");
        
        Subject sub1 = new Subject();
        Subject sub2 = new Subject();
        sub1.setSubject_name("C Programming");
        sub2.setSubject_name("C++");
        
        
        Set<Subject> subjects = new HashSet<Subject>();
        subjects.add(sub1);
        subjects.add(sub2);
        
        
        Student st1 = new Student(1,"Ravi",ad,certificate,subjects);
        Student st2 = new Student(2,"Ram",ad,certificate,subjects);
        
        Set<Student> students = new HashSet<Student>();
        students.add(st1);
        students.add(st2);
        
        sub1.setStudents(students);
        sub2.setStudents(students);
        
        session.save(sub1);
        session.save(sub2);
        session.save(st2);
        session.save(st1);
        session.save(certificate);
        
//        Question qn = new Question();
//        qn.setQuestion("What is Java");
//        
//        Answer ans1 = new Answer(1,"Java is Most Popular Programming Language.",qn);
//        Answer ans2 = new Answer(2,"Java is also used for backend developement.",qn);
//        Answer ans3 = new Answer(3,"Java is an Object Oriented Programming Language",qn);
//        
//        Set<Answer> answers = new HashSet<Answer>(); 
//        answers.add(ans1);
//        answers.add(ans2);
//        answers.add(ans3);
//        
//        qn.setAnswers(answers);
//        
//        session.save(ans1);
//        session.save(ans2);
//        session.save(ans3);
//        session.save(qn);
        
        tx.commit();
        
        session.close();
        factory.close();
    }
}
