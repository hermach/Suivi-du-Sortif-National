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

import com.SPN.model.entiteis.tranch_age;
import com.SPN.services.i_tranch_ageSRV;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class tranch_ageCTR {
	@Autowired 
	i_tranch_ageSRV ctr;
	
	@PostMapping("/tranch_age")
	public tranch_age add(@RequestBody tranch_age ff) {
		ctr.addone(ff);
		return ff;
	}
	@GetMapping("/tranch_age")
    public List<tranch_age> getAll(){
        List<tranch_age> LP=ctr.getAll();
        return LP;
    }
    @GetMapping("/tranch_age/{id}")
   	public tranch_age getById(@PathVariable("id")int id) {
    	tranch_age result= ctr.getone(id);
           return result;
       }
	@PutMapping("/tranch_age")
	public tranch_age update(@RequestBody tranch_age ff) {
	    ctr.addone(ff);
	return ff;
	}
	@DeleteMapping( value = "/tranch_age/{id}")
	public void delete(@PathVariable("id") int id ){
		 ctr.deleteone(id);;
		}
}