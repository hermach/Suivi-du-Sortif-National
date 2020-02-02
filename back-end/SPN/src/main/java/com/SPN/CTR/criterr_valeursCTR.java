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

import com.SPN.model.entiteis.criterr_valeurs;
import com.SPN.services.i_criterr_valeursSRV;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class criterr_valeursCTR {
	@Autowired 
	i_criterr_valeursSRV ctr;
	
	
	@PostMapping("/criterr_valeurs")
	public criterr_valeurs add(@RequestBody criterr_valeurs ff) {
		ctr.addone(ff);
		return ff;
	}
	@GetMapping("/criterr_valeurs")
    public List<criterr_valeurs> getAll(){
        List<criterr_valeurs> LP=ctr.getAll();
        return LP;
    }
    @GetMapping("/criterr_valeurs/{id}")
   	public criterr_valeurs getById(@PathVariable("id")int id) {
    	criterr_valeurs result= ctr.getone(id);
           return result;
       }
	@PutMapping("/criterr_valeurs")
	public criterr_valeurs update(@RequestBody criterr_valeurs ff) {
	    ctr.addone(ff);
	return ff;
	}
	@DeleteMapping( value = "/criterr_valeurs/{id}")
	public void delete(@PathVariable("id") int id ){
		 ctr.deleteone(id);;
		}
}
