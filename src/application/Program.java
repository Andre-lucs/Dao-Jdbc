package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao selDao = DaoFactory.createSellerDao();
		
		Seller seller = selDao.findById(2);
		
		System.out.println("=== Seller by Id ===");
		System.out.println(seller);
		
		List<Seller> list1 = selDao.findByDepartment(new Department(2,""));
		
		System.out.println("\n=== Sellers by Department ===");
		for(Seller s : list1) {
			System.out.println(s);
		}
		
		List<Seller> list2 = selDao.findAll();
		
		System.out.println("\n=== All Sellers ===");
		for(Seller s : list2) {
			System.out.println(s);
		}
		
		seller = new Seller();
		seller.setName("Lucas");
		seller.setEmail("lusca@gmai.com");
		seller.setBirthDate(new java.util.Date());
		seller.setBaseSalary(2500.0);
		seller.setDepartment(new Department(3,""));
		
		selDao.insert(seller);
		
		System.out.println("=== Inserted new seller ===");
		System.out.println(seller);
		
	}

}
