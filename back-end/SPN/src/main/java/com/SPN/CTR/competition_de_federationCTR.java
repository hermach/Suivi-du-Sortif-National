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

import com.SPN.model.entiteis.Fedcomp;
import com.SPN.model.entiteis.competition_de_federation;
import com.SPN.model.entiteis.competitions;
import com.SPN.services.i_competition_de_federationSRV;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class competition_de_federationCTR {
	@Autowired 
	i_competition_de_federationSRV ctr;
	
	@PostMapping("/competition_de_federation")
	public Fedcomp add(@RequestBody Fedcomp post) {
		System.out.println(post);
		competitions ss = post.getCompetition();
		competition_de_federation xx = post.getCompetition_de_federation();
		ctr.add(xx, ss);;
		return post;
	}
	@GetMapping("/competition_de_federation")
    public List<competition_de_federation> getAll(){
        List<competition_de_federation> LP=ctr.getAll();
        return LP;
    }
    
	@GetMapping("/competition_de_federation/{id}")
    public List<competitions> get(@PathVariable("id")int id){
        List<competitions> LP=ctr.get(id);
        return LP;
    }
//    @GetMapping("/competition_de_federation/{id}")
//   	public competition_de_federation getById(@PathVariable("id")int id) {
//    	competition_de_federation result= ctr.getone(id);
//           return result;
//       }
//	@PutMapping("/competition_de_federation")
//	public competition_de_federation update(@RequestBody competition_de_federation competition_de_federation) {
//	    ctr.addathlet(competition_de_federation);
//	return competition_de_federation;
//	}
	@DeleteMapping( value = "/competition_de_federation/{id}")
	public void delete(@PathVariable("id") int id ){
		 ctr.deleteone(id);;
		}
}
