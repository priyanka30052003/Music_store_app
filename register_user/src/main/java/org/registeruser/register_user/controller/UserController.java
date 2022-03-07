package org.registeruser.register_user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.registeruser.register_user.model.Admin;
import org.registeruser.register_user.model.Payment;
import org.registeruser.register_user.model.Product;
import org.registeruser.register_user.model.User;
import org.registeruser.register_user.repo.ProdRepo;
import org.registeruser.register_user.service.AdminService;
import org.registeruser.register_user.service.PaymentService;
import org.registeruser.register_user.service.ProductService;
import org.registeruser.register_user.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private RegistrationService service;
	@Autowired
	private ProductService service1;
	@Autowired
	private ProdRepo repo1;
	@Autowired
	private AdminService service2;
	@Autowired
	private PaymentService service3;

	@RequestMapping(path = "/", method = RequestMethod.POST)
	public ResponseEntity<User> registerUser(@RequestBody User user) throws Exception {
		User userObj = null;
		userObj = service.saveUser(user);
		return ResponseEntity.ok(userObj);

	}

	/**
	 * @PostMapping("/login") public User loginUser(@RequestBody User user) throws
	 * Exception{ String tempuser_id=user.getUserId(); String
	 * temppass=user.getPassword(); User userObj=null; if(tempuser_id!=null &&
	 * temppass!=null) { userObj=service.fetchUserByUserIdAndPassword(tempuser_id,
	 * temppass); } return userObj;
	 * 
	 * }
	 **/
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody User userData) {

		User user = service.fetchUserByUserId(userData.getUserId());

		if (user.getPassword().equals(userData.getPassword()))
			return ResponseEntity.ok(user);

		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}

	@PostMapping("/login1")
	public ResponseEntity<?> loginAdmin(@RequestBody Admin userData) {

		Admin admin = service2.fetchAdminByUserId(userData.getUserId());

		if (admin.getPassword().equals(userData.getPassword()))
			return ResponseEntity.ok(admin);

		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}

	@PostMapping("addprod")
	public Product createProduct(@RequestBody Product product) {
		return service1.save(product);

	}

	@GetMapping("vuuser")
	public List<User> getAllUsers() {
		return service.fetchAll();
	}

	@GetMapping("vuprod")
	public List<Product> getAllProducts() {
		return service1.fetchAllprod();
	}

	@GetMapping("anurag")
	public List<Product> getAnurag() {
		return service1.fetchAnurag();
	}

	@GetMapping("/{category}")
	public List<Product> getProductByCategory(@PathVariable String category) {
		System.out.println("controller:" + category);
		return service1.fetchProductByCategory(category);
	}

	@GetMapping("bts")
	public List<Product> getBts() {
		return service1.fetchBts();
	}

	@GetMapping("pop")
	public List<Product> getPop() {
		return service1.fetchPop();
	}

	@GetMapping("melody")
	public List<Product> getMelody() {
		return service1.fetchMelody();
	}

	@GetMapping("hip hop")
	public List<Product> getHipHop() {
		return service1.fetchHipHop();
	}

	@GetMapping("workout")
	public List<Product> getWorkout() {
		return service1.fetchWorkout();
	}

	@GetMapping("romance")
	public List<Product> getRomance() {
		return service1.fetchRomance();
	}

	@GetMapping("devotional")
	public List<Product> getDevotional() {
		return service1.fetchDevotional();
	}

	@GetMapping("classic")
	public List<Product> getClassic() {
		return service1.fetchClassic();
	}

	@GetMapping("sid")
	public List<Product> getSidSriRam() {
		return service1.fetchSidSriRam();
	}

	@GetMapping("sujatha")
	public List<Product> getSujatha() {
		return service1.fetchSujatha();
	}

	@GetMapping("selena")
	public List<Product> getSelenaGomez() {
		return service1.fetchSelenaGomez();
	}

	@GetMapping("ashwath")
	public List<Product> getAshwath() {
		return service1.fetchAshwath();
	}

	@GetMapping("lata")
	public List<Product> getLataMangeshkar() {
		return service1.fetchLataMangeshkar();
	}

	@GetMapping("shreya")
	public List<Product> getShreyaGhoshal() {
		return service1.fetchShreyaGhoshal();
	}

	@GetMapping("tamil")
	public List<Product> getTamil() {
		return service1.fetchTamil();
	}

	@GetMapping("malayalam")
	public List<Product> getMalayalam() {
		return service1.fetchMalayalam();
	}

	@GetMapping("telugu")
	public List<Product> getTelugu() {
		return service1.fetchTelugu();
	}

	@GetMapping("kanada")
	public List<Product> getKanada() {
		return service1.fetchKanada();
	}

	@GetMapping("gujarathi")
	public List<Product> getGujarathi() {
		return service1.fetchGujarathi();
	}

	@GetMapping("korean")
	public List<Product> getKorean() {
		return service1.fetchKorean();
	}

	@GetMapping("english")
	public List<Product> getEnglish() {
		return service1.fetchEnglish();
	}

	@GetMapping("/addprod/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id) {
		Product product = service1.fetchProductById(id);
		return ResponseEntity.ok(product);
	}

	@PutMapping("/addprod/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product1) {
		Product product = service1.fetchProductById(id);
		// .orElseThrow(() -> new ResourceNotFoundException("Product does not exist
		// :"+id));
		product.setCategory(product1.getCategory());
		product.setPrice(product1.getPrice());
		product.setName(product1.getName());
		product.setDescription(product1.getDescription());
		Product updatedProduct = service1.save(product);
		return ResponseEntity.ok(updatedProduct);
	}

	@DeleteMapping("/addprod/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable int id) {
		Product product = service1.fetchProductById(id);

		repo1.delete(product);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

	@GetMapping("drumset")
	public List<Product> getDrumset() {
		return service1.fetchDrumset();
	}

	@GetMapping("guitar")
	public List<Product> getGuitar() {
		return service1.fetchGuitar();
	}

	@GetMapping("piano")
	public List<Product> getPiano() {
		return service1.fetchPiano();
	}

	@PostMapping("/payment")
	public List<Payment> PaymentUser(@RequestBody Payment payment) throws Exception {
		String tempname= payment.getName();
		String tempcardnum = payment.getCardnum();
		String tempcvv=payment.getCvv();
		String tempphnnum=payment.getPhnnum();
		List<Payment> paymentObj = null;
		if (tempname != null && tempcardnum != null && tempcvv != null && tempphnnum != null) {
			paymentObj = service3.fetchAll();
		}
		return paymentObj;

	}

}
