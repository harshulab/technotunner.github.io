package hackathon.octahacks.complaintregistration.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hackathon.octahacks.complaintregistration.entity.info;
import hackathon.octahacks.complaintregistration.entity.Department;
import hackathon.octahacks.complaintregistration.repositories.DeparRepository;
@CrossOrigin 
@RestController
public class DeparController {
	
	@Autowired
	private DeparRepository repository;
	
	
	@PostMapping("/addDepar")
	public String saveDepar(@RequestBody  Department data ) {
		repository.save(data);
		return "Saved";
	}
	
	@PostMapping("/addComplaint")
	public String saveComplaint(@RequestBody info m) {
		if(m.getDeparId()!=null) {
			Optional<Department> temp=repository.findById(m.getDeparId());
			Department r = temp.get();
			List<info> c = r.getComplaints();
			
			if(c==null) {
				c=new ArrayList<info>();
			}
			c.add(m);
			r.setComplaints(c);
			repository.save(r);
			return "Saved";
		}
		return "not saved";
	}
	
	@GetMapping("/getComplaint/{id}")
	public List<info>  findComplaint(@PathVariable String id) {   //@RequestBody int t
//		String i= "1";
		Optional<Department> temp= repository.findById(id);
		Department r = temp.get();
		return r.getComplaints();
	}
	
	
	@GetMapping("/getDepars")
	public List<Department>  findDepars() {
		return repository.findAll();
	}
	
	@DeleteMapping("/deleteDepars")
	public String deleteDepars(@RequestBody String id) {
		repository.deleteAll();
		return "Deleted";
	}
	
}
