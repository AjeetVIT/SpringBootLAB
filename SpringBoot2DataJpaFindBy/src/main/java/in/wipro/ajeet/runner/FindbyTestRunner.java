package in.wipro.ajeet.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.wipro.ajeet.model.Product;
import in.wipro.ajeet.repo.ProductRepository;
import in.wipro.ajeet.repo.ProductRepository.MyView;
@Component
public class FindbyTestRunner implements CommandLineRunner {
	@Autowired
private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
		//List<Product> list = repo.findByProdVendor("NIM");
		//repo.findByProdGrade("A").forEach(System.out::println);
    //repo.findByProdCostGreaterThanEqual(3500.0).forEach(System.out::println);
	//repo.findByProdCostLessThan(4500.0).forEach(System.out::println);
	//repo.findByProdGradeIsNotNull().forEach(System.out::println);
	//repo.findByProdNameLike("S%").forEach(System.out::println);
	//repo.findByProdNameLike("%TV").forEach(System.out::println);
	//repo.findByProdNameLike("_____%").forEach(System.out::println);
	//repo.findByProdNameNotLike("S%").forEach(System.out::println);
	//repo.findByProdNameContaining("A").forEach(System.out::println);
	repo.findByProdNameAndProdCostGreaterThanEqual("%TV", 2000.0).forEach(System.out::println);;
	List<MyView>list=repo.findByProdGrade("A");
	for(MyView m:list) {
		System.out.println(m.getProdName()+""+m.getProdCost());
	}
	}

}
