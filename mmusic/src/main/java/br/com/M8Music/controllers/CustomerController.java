package br.com.M8Music.controllers;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.M8Music.models.CustomerModel;
import br.com.M8Music.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	 @Autowired
	    private CustomerService service;


	    List<CustomerModel> gasto = new ArrayList<CustomerModel>();

	    @GetMapping
	    public ResponseEntity<List<CustomerModel>> getAll() {
	        return ResponseEntity.ok(service.listAll());


	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<CustomerModel> getById(@PathVariable Long id) {


	        Optional<CustomerModel> existe = service.listById(id);
	        return existe.isPresent() ? ResponseEntity.ok(existe.get())
	                : ResponseEntity.notFound().build();
	    }

	    @PostMapping
	    public ResponseEntity<CustomerModel> insert(@RequestBody CustomerModel customer) {
	        service.insert(customer);
	        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<CustomerModel> update(@PathVariable Long id, @RequestBody CustomerModel customer) {

	        Optional<CustomerModel> existe = service.update(id, customer);
	        if(!existe.isPresent()) {
	            ResponseEntity.noContent().build();

	        }
	        return ResponseEntity.status(HttpStatus.CREATED).body(customer);

	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<CustomerModel> delete(@PathVariable Long id) {
	        service.delete(id);
	        return ResponseEntity.noContent().build();
	    }

}
