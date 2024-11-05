package in.csapi.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class StaffCntrl {
   @Autowired
	private StaffRepo repo;
   
   @GetMapping("/getstaff")
   public List<Staff> getstaff() {
    List<Staff> list=repo.findAll();
    return list;
   }  
    @PostMapping("/savestaff")
     public Staff savestaff(@RequestBody Staff s) {
    	return repo.save(s);
    }
    
}
