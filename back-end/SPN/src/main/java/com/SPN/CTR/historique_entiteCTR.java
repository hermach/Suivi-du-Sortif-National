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

import com.SPN.model.entiteis.historique_entite;
import com.SPN.services.i_historique_entiteSRV;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class historique_entiteCTR {
	@Autowired 
	i_historique_entiteSRV ctr;
	
	@PostMapping("/historique_entite")
	public historique_entite add(@RequestBody historique_entite ff) {
		ctr.addone(ff);
		return ff;
	}
	@GetMapping("/getAllAthlete/{id}")
    public List<historique_entite> getAllAthlete(@PathVariable("id")int id){
        List<historique_entite> LP=ctr.getAllAthlete(id);
        return LP;
    }
	@GetMapping("/historique_entite")
    public List<historique_entite> getAll(){
        List<historique_entite> LP=ctr.getAll();
        return LP;
    }
	@GetMapping("/historique_entite/{id}")
	public historique_entite getById(@PathVariable("id")int id) {
		historique_entite result= ctr.getone(id);
        return result;
    }
	@GetMapping("/getSportbyAth/{id}")
	public historique_entite getSportbyAth(@PathVariable("id")int id) {
		historique_entite result= ctr.getone(id);
        return result;
    }
	@PutMapping("/historique_entite")
	public historique_entite update(@RequestBody historique_entite ff) {
	    ctr.addone(ff);;
	return ff;
	}
	@DeleteMapping( value = "/historique_entite/{id}")
	public void delete(@PathVariable("id") int id ){
		 ctr.deleteone(id);
		}
}
