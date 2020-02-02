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

import com.SPN.model.entiteis.entities_sportifs;
import com.SPN.services.i_entities_sportifsSRV;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class entities_sportifsCTR {
	@Autowired 
	i_entities_sportifsSRV ctr;
	
	@PostMapping("/entities_sportifs")
	public entities_sportifs add(@RequestBody entities_sportifs ff) {
		ctr.addone(ff);
		return ff;
	}
	@GetMapping("/getAllentity_sportife_de_clube/{id}")
    public List<entities_sportifs> getAll(@PathVariable("id")int id){
        List<entities_sportifs> LP=ctr.getAll(id);
        return LP;
    }
    @GetMapping("/entities_sportifs/{id}")
 	public entities_sportifs getById(@PathVariable("id")int id) {
    	entities_sportifs result= ctr.getone(id);
         return result;
     }
	@PutMapping("/entities_sportifs")
	public entities_sportifs update(@RequestBody entities_sportifs entities_sportif) {
	    ctr.addone(entities_sportif);;
	return entities_sportif;
	}
	@DeleteMapping( value = "/entities_sportifs/{id}")
	public void delete(@PathVariable("id") int id ){
		 ctr.deleteone(id);;
		}
}
