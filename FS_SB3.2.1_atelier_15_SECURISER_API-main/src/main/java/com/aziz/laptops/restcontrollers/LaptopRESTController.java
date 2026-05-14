package com.aziz.laptops.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.aziz.laptops.entities.Laptop;
import com.aziz.laptops.service.LaptopService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class LaptopRESTController {
	@Autowired
	LaptopService laptopService;
	
	@RequestMapping(path="all",method =RequestMethod.GET)
	public List<Laptop> getAllLaptops() {
		return laptopService.getAllLaptops();
	 } 		
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	//@GetMapping("/getbyid/{id}")
	public Laptop getLaptopById(@PathVariable("id") Long id) {	
		return laptopService.getLaptop(id);
    }
	
	@RequestMapping(value="/addprod",method = RequestMethod.POST)
	//@PostMapping("/addprod")
	public Laptop createLaptop(@RequestBody Laptop laptop) {
		return laptopService.saveLaptop(laptop);
	}

	@RequestMapping(value="/updateprod",method = RequestMethod.PUT)
	//@PutMapping("/updateprod")
	public Laptop updateLaptop(@RequestBody Laptop laptop) {
		return laptopService.updateLaptop(laptop);
	}

	@RequestMapping(value="/delprod/{id}",method = RequestMethod.DELETE)
	//@DeleteMapping("/delprod/{id}")
	public void deleteLaptop(@PathVariable("id") Long id)
	{
		laptopService.deleteLaptopById(id);
	}
	
	@RequestMapping(value="/prodscat/{idModel}",method = RequestMethod.GET)
	public List<Laptop> getLaptopsByCatId(@PathVariable("idModel") Long idModel) {
		return laptopService.findByModelIdModel(idModel);
	 }
	@GetMapping("/auth") 
	Authentication getAuth(Authentication auth) 
	{ 
	return auth; 
	}


}

