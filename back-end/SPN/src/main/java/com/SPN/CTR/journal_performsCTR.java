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
import com.SPN.model.entiteis.journal_performs;
import com.SPN.model.entiteis.performence_valeurC;
import com.SPN.services.i_criterr_valeursSRV;
import com.SPN.services.i_journal_performsSRV;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class journal_performsCTR {
	@Autowired 
	i_journal_performsSRV ctr;

	
	@PostMapping("/journal_performs")
	public journal_performs add(@RequestBody journal_performs ff) {

		System.out.println(ff);


		ctr.addone(ff);
		
		return ff;
	}
	@GetMapping("/journal_performs")
    public List<journal_performs> getAll(){
        List<journal_performs> LP=ctr.getAll();
        return LP;
    }
	@GetMapping("/journal_performs/{id}")
    public List<journal_performs> getAllPerAth(@PathVariable("id")int id){
        List<journal_performs> LP=ctr.getAllPerAth(id);
        return LP;
    }
//    @GetMapping("/journal_performs/{id}")
//   	public journal_performs getById(@PathVariable("id")int id) {
//    	journal_performs result= ctr.getone(id);
//           return result;
//       }
	@PutMapping("/journal_performs")
	public journal_performs update(@RequestBody journal_performs ff) {
	    ctr.addone(ff);
	return ff;
	}
	@DeleteMapping( value = "/journal_performs/{id}")
	public String delete(@PathVariable("id") int id ){
		 ctr.deleteone(id);
		 return "is deleted";
		}
	
	
}
