package com.SPN.CTR;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SPN.model.entiteis.athletes;
import com.SPN.model.entiteis.athplushisto;
import com.SPN.model.entiteis.historique_entite;
import com.SPN.services.i_athleteSRV;
import com.SPN.services.i_historique_entiteSRV;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class athletesCTR {
	@Autowired 
	i_athleteSRV ctr;
	i_historique_entiteSRV ctr2;
	
	@PostMapping("/athletes")
	public athplushisto add(@RequestBody athplushisto athh) {
		System.out.println(athh);
		athletes a = athh.getAthlete();	
		historique_entite h = athh.getHistorique_entite();
		  ctr.addathlet(a,h);

		return athh;
	}

	@GetMapping("/athletes")
    public List<athletes> getAll(){
        List<athletes> LP=ctr.getAll();
        return LP;
    }
    @GetMapping("/athletes/{id}")
   	public athletes getById(@PathVariable("id")int id) {
    	athletes result= ctr.getone(id);
           return result;
       }
//	@PutMapping("/athletes")
//	public athletes update(@RequestBody athletes athlete) {
//	    ctr.addathlet(athlete);
//	return athlete;
//	}
	@DeleteMapping( value = "/athletes/{id}")
	public void delete(@PathVariable("id") int id ){
		 ctr.deleteone(id);;
		}
	
}
