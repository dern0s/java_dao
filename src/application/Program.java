package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dep = new Department(1, "electronics");
		
		System.out.println(dep);
		
		Seller sel = new Seller(1, "john", "john@gmail.com", new Date(), 3000.0, dep);
		
		System.out.println(sel);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

	}

}
