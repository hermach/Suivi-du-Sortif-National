package com.SPN.CTR;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SPN.model.entiteis.federations;
import com.SPN.model.entiteis.sports;
import com.SPN.services.i_federationsSRV;
import com.SPN.services.i_sportsSRV;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class sportsCTR {
	@Autowired 
	i_sportsSRV ctr;
	@Autowired 
	i_federationsSRV ctr1;
	
	@PostMapping("/sports/{id}")
	public sports add(@RequestBody sports sport,@PathVariable("id")int id) {
		federations fed = new federations();
		fed=ctr1.getOne(id);
		sports sport1 = new sports(sport.getNom(), fed);
		ctr.addone(sport1);
		return sport1;
	}
	@GetMapping("/sports")
    public List<sports> getAll(){
        List<sports> LP=ctr.getAll();
        return LP;
    }
	@GetMapping("/sports/{id}")
	public sports getById(@PathVariable("id")int id) {
		sports result= ctr.getone(id);
        return result;
    }
	@PutMapping("/sports")
	public sports update(@RequestBody sports sports) {
	    ctr.addone(sports);
	return sports;
	}
	@DeleteMapping( value = "/sports/{id}")
	public void delete(@PathVariable("id") int id ){
		 ctr.deleteone(id);
		}
}
