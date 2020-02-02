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
import com.SPN.services.i_federationsSRV;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class federationCTR {
	@Autowired 
	i_federationsSRV ctr;
	
	@PostMapping("/federation")
	public federations add(@RequestBody federations ff) {
		ctr.addAthlet(ff);
		return ff;
	}
	@GetMapping("/federation")
    public List<federations> getAll(){
        List<federations> LP=ctr.getAll();
        return LP;
    }
	@GetMapping("/federation/{id}")
	public federations getById(@PathVariable("id")int id) {
		federations result= ctr.getOne(id);
        return result;
    }
	@PutMapping("/federation")
	public federations update(@RequestBody federations federations) {
	    ctr.addAthlet(federations);
	return federations;
	}
	@DeleteMapping( value = "/federation/{id}")
	public void delete(@PathVariable("id") int id ){
		 ctr.deleteOne(id);
		}
}
