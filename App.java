package com.hibernate.manytomanyrelation.Many_To_Many_You1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		
		Emp em=new Emp();
		em.seteId(1);
		em.seteName("Saloma");
		
		Emp em1=new Emp();
		em1.seteId(2);
		em1.seteName("Manu");
		
		Projects pro=new Projects();
		pro.setpNo(101);
		pro.setpName("Hibernate");
		
		Projects pro1=new Projects();
		pro1.setpNo(102);
		pro1.setpName("HIBERNATE");
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();

		List<Object> lists=new ArrayList<Object>();
		lists.add(em);
		lists.add(em1);
		lists.add(pro);
		lists.add(pro1);
		
		for(Object list:lists)
		{
			session.save(list);
		}
		
		trans.commit();
		session.close();

	}
}
