package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	private ContactRepository cr;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		cr.save(new Contact("Hasani", "Mohammad", sdf.parse("02/04/1993"), "ryugahidiky@gmail.com", "images/1.jpg", 618473497));
		cr.save(new Contact("khalid", "Ibrahimi", sdf.parse("09/01/1993"), "something@gmail.com", "images/2.jpg", 677339287));
		cr.save(new Contact("Kaoutar", "Salami", sdf.parse("14/10/1996"), "else@gmail.com", "images/3.jpg", 637920098));
		
		cr.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
		
	}

}
