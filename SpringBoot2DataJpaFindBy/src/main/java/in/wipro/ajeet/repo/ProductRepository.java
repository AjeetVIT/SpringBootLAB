package in.wipro.ajeet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.wipro.ajeet.model.Product;
import java.util.List;


public interface ProductRepository 
extends JpaRepository<Product, Integer> {
	interface MyView{
		//Dt get<VariableName>();
		String getProdName();
		Double getProdCost();
	}
	//--------3. AND/Or
	 //select prodName,prodCost from product where prodGrade=?
	List<MyView>findByProdGrade(String prodGrade);
	//findby<VariableWithConditions>And<variableWithConditions>(<params>
	//select*from product where prod_name=? and prod_cost>=?
	List<Product>findByProdNameAndProdCostGreaterThanEqual(String prodName,Double prodCost);
	//---------2 Like Operator-------
	//sql: select*from product where prod_name like '?'
	List<Product>findByProdNameLike(String prodNameExpression);
	//sql: select * from Product where prod_name not like '?'(any expression)
	List<Product> findByProdNameNotLike(String prodNameExpression);

	//RT findby<variablename>(<datatype>,<paramName>);
	//select*from Product where prod_vendor=?;
	List<Product> findByProdVendor(String prodVendor);
	//select*from product where prod_grade=?
	//List<Product> findByProdGrade(String prodGrade);
	List<Product>findByProdCostGreaterThanEqual(Double prodCost);
	List<Product>findByProdCostLessThan(Double prodCost);
	List<Product>findByProdNameContaining(String prodName);
	List<Product>findByProdGradeIsNotNull();
	//List//<Product>findByProdNameStartingWith("S%").forEach(System.out::println);
}