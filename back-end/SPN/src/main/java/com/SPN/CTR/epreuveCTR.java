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

import com.SPN.model.entiteis.Epreuve_competition;
import com.SPN.model.entiteis.epreuve;
import com.SPN.model.entiteis.relation_eprcompet_epreuve;
import com.SPN.services.i_epreuveSRV;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class epreuveCTR {
	@Autowired 
	i_epreuveSRV ctr;
	
	@PostMapping("/epreuve")
	public relation_eprcompet_epreuve add(@RequestBody relation_eprcompet_epreuve relation_eprcompet_epreuve) {
		System.out.println(relation_eprcompet_epreuve);
		epreuve ep = relation_eprcompet_epreuve.getEpreuve();
		Epreuve_competition ec= relation_eprcompet_epreuve.getEpreuve_competition();
		ctr.addathlet(ep,ec);
		return relation_eprcompet_epreuve;
	}
	@GetMapping("/epreuve")
    public List<epreuve> getAll(){
        List<epreuve> LP=ctr.getAll();
        return LP;
    }
    @GetMapping("/epreuve/{id}")
   	public epreuve getById(@PathVariable("id")int id) {
    	epreuve result= ctr.getone(id);
           return result;
       }
//	@PutMapping("/epreuve")
//	public epreuve update(@RequestBody epreuve athlete) {
//	    ctr.addathlet(athlete);
//	return athlete;
//	}
	@DeleteMapping( value = "/epreuve/{id}")
	public void delete(@PathVariable("id") int id ){
		 ctr.deleteone(id);;
		}
}
