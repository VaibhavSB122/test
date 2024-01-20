package test.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import test.dto.Stdo;
import test.services.AES;

public class Userdao {
	EntityManagerFactory p =Persistence.createEntityManagerFactory("jdbc");
	EntityManager m = p.createEntityManager();
	EntityTransaction t = m.getTransaction();
	
	public void addStdo(Stdo s)
	{
		t.begin();
		m.persist(s);
		t.commit();
		System.out.println("***object created***");
	}
	public void fetchStdo(int id)
	{
		Stdo s=m.find(Stdo.class, id);
		if(s!=null)
		{
			System.out.println("id--->"+s.getId());
			System.out.println("Name---->"+s.getName());
			System.out.println("Adress---->"+s.getAddres());
			System.out.println("Age---->"+AES.decrypt(s.getAddres() , s.getName()));
			System.out.println("Number---->"+s.getNumber()); 


		}else {
			System.out.println("Data Not Found");
		}
		}
	
	public void UpdateStdo(int id,long newNember)
	{
		Stdo s=m.find(Stdo.class, id);
		if(s!=null)
		{
			s.setNumber(newNember);
			t.begin();
			m.merge(s);
			t.commit();
			System.out.println("Object Update");
		}
		else {
			System.out.println("data not founds");
		}
	}
	public void deletStdo(int id)
	{
		Stdo s=m.find(Stdo.class, id);
		if(s!=null)
		{
			t.begin();
			m.remove(s);
			t.commit();
			System.out.println("****object removed****");
		}else {
			System.out.println("***Data not found***");
		}
		
	}
	public void fetchAll()
	{
		Query q=m.createQuery("select a from student a");
		List <Stdo>l=q.getResultList();
		if(!l.isEmpty())
		{
			for(Stdo s: l)
			{
				System.out.println("id--->"+s.getId());
				System.out.println("Name---->"+s.getName());
				System.out.println("Adress---->"+AES.decrypt(s.getAddres() , s.getName()));
				System.out.println("Age---->"+s.getAge());
				System.out.println("Number---->"+s.getNumber()); 
			}
		}
		else {
			System.out.println("no data to fetch");
		}
	}
}
