package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
	
	@GetMapping("/{id}")
	public Combile show(@PathVariable int id)
	{
		RestTemplate template=CobineServiceApplication.getRestTemplate();
		Product p=template.getForObject("https://ciran12481.pythonanywhere.com/product/"+id, Product.class);
		Customer cr=template.getForObject("https://spbootrest-1.onrender.com/"+id, Customer.class);
		Combile c=new Combile();
		c.setProduct(p);
		c.setCustomer(cr);
		return c;
	}
}
