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

import com.SPN.model.entiteis.criteres;
import com.SPN.services.i_criteresSRV;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class criteresCTR {
	@Autowired 
	i_criteresSRV ctr;
	
	@PostMapping("/criteres")
	public criteres add(@RequestBody criteres ff) {
		ctr.addone(ff);
		return ff;
	}
	@GetMapping("/criteres")
    public List<criteres> getAll(){
        List<criteres> LP=ctr.getAll();
        return LP;
    }
	@GetMapping("/criteres/{id}")
    public List<criteres> getAllcriterdesport(@PathVariable("id")int id){
        List<criteres> LP=ctr.getAllcriter_de_sport(id);
        return LP;
    }
    
//    @GetMapping("/criteres/{id}")
//	public criteres getById(@PathVariable("id")int id) {
//    	criteres result= ctr.getone(id);
//        return result;
//    }
	@PutMapping("/criteres")
	public criteres update(@RequestBody criteres critere) {
	    ctr.addone(critere);;
	return critere;
	}
	@DeleteMapping( value = "/criteres/{id}")
	public void delete(@PathVariable("id") int id ){
		 ctr.deleteone(id);;
		}
}
