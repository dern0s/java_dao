package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("--- Test 01: seller FindById ---");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n--- Test 02: seller FindByDepartment ---");
		
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		list.forEach(x -> System.out.println(x));

	}

}
