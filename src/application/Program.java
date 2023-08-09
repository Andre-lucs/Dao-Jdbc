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
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
	}

}
