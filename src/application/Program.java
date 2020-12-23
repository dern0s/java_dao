package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("--- Test 01: seller FindById ---");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n--- Test 02: seller FindByDepartment ---");
		
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		list.forEach(x -> System.out.println(x));

		System.out.println("\n--- Test 03: seller FindAll ---");
		
		list = sellerDao.findAll();
		
		list.forEach(x -> System.out.println(x));
		
		System.out.println("\n--- Test 04: seller Insert ---");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		
		sellerDao.insert(newSeller);
		
		System.out.println("Inserted, new Id = " + newSeller.getId());
		
		System.out.println("\n--- Test 05: seller Update ---");
		
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		
		System.out.println("Update completed: Seller with ID 01 is now " + seller);
		
		System.out.println("\n--- Test 06: seller delete ---");
		
		System.out.println("Enter id for deletion: ");
		int id = sc.nextInt();
		
		sellerDao.deleteById(id);
		
		System.out.println("Deleted seller with id " + id);
		
		sc.close();
		
	}

}
