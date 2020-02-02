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

import com.SPN.model.entiteis.journal_sante;
import com.SPN.services.i_journal_santeSRV;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class journal_santeCTR {
	@Autowired 
	i_journal_santeSRV ctr;
	
	@PostMapping("/journal_sante")
	public journal_sante add(@RequestBody journal_sante ff) {
		ctr.addone(ff);
		return ff;
	}
	@GetMapping("/getAllJournalSante/{id}")
    public List<journal_sante> getAllJournalSante(@PathVariable("id")int id){
        List<journal_sante> LP=ctr.getAllJournalSante(id);
        return LP;
    }
	@GetMapping("/journal_sante")
    public List<journal_sante> getAll(){
        List<journal_sante> LP=ctr.getAll();
        return LP;
    }
	@GetMapping("/journal_sante/{id}")
	public journal_sante getById(@PathVariable("id")int id) {
		journal_sante result= ctr.getone(id);
        return result;
    }
	@PutMapping("/journal_sante")
	public journal_sante update(@RequestBody journal_sante ff) {
	    ctr.addone(ff);
	return ff;
	}
	@DeleteMapping( value = "/journal_sante/{id}")
	public void delete(@PathVariable("id") int id ){
		 ctr.deleteone(id);
		}
}
