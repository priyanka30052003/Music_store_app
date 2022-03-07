package org.registeruser.register_user.service;

import java.util.List;

import org.registeruser.register_user.model.Product;
import org.registeruser.register_user.repo.ProdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProdRepo repo1;

	public List<Product> fetchAllprod() {
		// TODO Auto-generated method stub
		return repo1.findAll();
	}

	public Product save(Product product) {
		// TODO Auto-generated method stub
		return repo1.save(product);
	}

	public List<Product> fetchProductByCategory(String category) {
		System.out.println(category);
		return repo1.findProductByCategory(category);
	}

	public Product fetchProductById(int id) {
		// TODO Auto-generated method stub
		return repo1.findProductById(id);
	}

	public List<Product> fetchAnurag() {
		return repo1.findByCategory("Anurag Kulkarni");
	}

	public List<Product> fetchBts() {
		return repo1.findByCategory("Bts");
	}

	public List<Product> fetchPop() {
		return repo1.findByCategory("Pop");
	}

	public List<Product> fetchMelody() {
		return repo1.findByCategory("Melody");
	}

	public List<Product> fetchHipHop() {
		return repo1.findByCategory("Hip Hop");
	}

	public List<Product> fetchWorkout() {
		return repo1.findByCategory("Workout");
	}


	public List<Product> fetchRomance() {
		return repo1.findByCategory("Romance");
	}

	public List<Product> fetchDevotional() {
		return repo1.findByCategory("Devotional");
	}

	public List<Product> fetchClassic() {
		return repo1.findByCategory("Classic");
	}

	public List<Product> fetchSidSriRam() {
		return repo1.findByCategory("Sid Sri Ram");
	}

	public List<Product> fetchShreyaGhoshal() {
		return repo1.findByCategory("Shreya Ghoshal");
	}

	public List<Product> fetchLataMangeshkar() {
		return repo1.findByCategory("Lata Mangeshkar");
	}

	public List<Product> fetchAshwath() {
		return repo1.findByCategory("Ashwath");
	}

	public List<Product> fetchSelenaGomez() {
		return repo1.findByCategory("Selena Gomez");
	}

	public List<Product> fetchSujatha() {
		return repo1.findByCategory("Sujatha");
	}

	public List<Product> fetchTamil() {
		return repo1.findByCategory("Tamil");
	}



	public List<Product> fetchEnglish() {
		return repo1.findByCategory("English");
	}

	public List<Product> fetchKanada() {
		return repo1.findByCategory("Kanada");
	}

	public List<Product> fetchMalayalam() {
		return repo1.findByCategory("Malayalam");
	}

	public List<Product> fetchKorean() {
		return repo1.findByCategory("Korean");
	}

	public List<Product> fetchGujarathi() {
		return repo1.findByCategory("Gujarathi");
	}

	public List<Product> fetchTelugu() {
		return repo1.findByCategory("Telugu");
	}
	public List<Product> fetchPiano() {
		return repo1.findByCategory("Piano");
	}
	public List<Product> fetchGuitar() {
		return repo1.findByCategory("Guitar");
	}
	public List<Product> fetchDrumset() {
		return repo1.findByCategory("Drum Set");
	}
	

}
