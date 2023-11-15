package in.wipro.ajeet.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.wipro.ajeet.model.Product;
import in.wipro.ajeet.repo.ProductRepository;
@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired
private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.saveAll(
				
				Arrays.asList(new Product(101,"S-TV",2500.0,"DELL","A"),
				new Product(101,"S-TV",2500.0,"DELL","C"),
				new Product(102,"M-LAP",3500.0,"NIM","A"),
				new Product(103,"M-LAP",3500.0,"NIM","A"),
				new Product(104,"M-LAP",3500.0,"NIM","B"),
				new Product(105,"M-LAP",3500.0,"NIM","A"),
				new Product(106,"R-INV",4500.0,"RIT","C"),
				new Product(107,"M-KEBD",9500.0,"NIM","A"),
				new Product(108,"S-TV",5500.0,"RIT","B")
				));

	}

}
