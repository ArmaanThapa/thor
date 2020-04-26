package com.xworkz.river.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.xworkz.river.dto.RiverDTO;

@Repository
public class RiverDAO {
	
	
	@Autowired
	private SessionFactory factory;	
	public RiverDAO() {
		
		
		System.out.println(this.getClass().getSimpleName() +"  thapa");
	}

	public void save(RiverDTO dto) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(dto);
		transaction.commit();
	
		
	}

}
