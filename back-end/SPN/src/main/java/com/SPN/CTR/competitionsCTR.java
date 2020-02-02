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

import com.SPN.model.entiteis.competitions;
import com.SPN.services.i_competitionsSRV;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class competitionsCTR {
	@Autowired 
    i_competitionsSRV ctr;
	
	@PostMapping("/competitions")
	public competitions add(@RequestBody competitions ff) {
		ctr.addone(ff);
		return ff;
	}
	@GetMapping("/competitions")
    public List<competitions> getAll(){
        List<competitions> LP=ctr.getAll();
        return LP;
    }
    @GetMapping("/competitions/{id}")
 	public competitions getById(@PathVariable("id")int id) {
    	competitions result= ctr.getone(id);
         return result;
     }
    @PutMapping("/competitions")
	public competitions update(@RequestBody competitions competition) {
	    ctr.addone(competition);;
	return competition;
	}
    @DeleteMapping( value = "/competitions/{id}")
	public void delete(@PathVariable("id") int id ){
		 ctr.deleteone(id);;
		}
}
