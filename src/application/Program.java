package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department d1 = new Department(1, "loja");
		
		Seller seller = new Seller(2, "Nome", "Email", new Date(), 2000.0, d1);
		
		System.out.println(seller);
	}

}
