import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

import model.Customer;

public class Operation {

	public static void main(String[] args) {
		

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String cname=sc.nextLine();
		System.out.println("Enter Customer Address");
		String cadd=sc.nextLine();
		
		Customer c=new Customer(cname,cadd);
		
		Transaction tx = session.beginTransaction();
		
		session.save(c);
		tx.commit();
		System.out.println("Data inserted");
		System.out.println("Press 1 for delete.");
	
		int choice=Integer.parseInt(sc.nextLine());
		if(choice==1){
			System.out.println("Enter the name you want to delete");
			String cname1=sc.nextLine();
			new Customer(cname);
			Transaction tx1 = session.beginTransaction();
			session.delete(c);
			System.out.println("Data Deleted Successfully");
			tx.commit();
			
			
		}
		
		session.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
