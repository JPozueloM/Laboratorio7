package Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.mongoapi.domain.Professional;
import com.cenfotec.mongoapi.repository.ProfessionalRepository;
import com.cenfotec.mongoapi.service.ProfessionalService;

@RestController 
public class ProfessionalController {
@Autowired 
private ProfessionalService professionalService; 

private ProfessionalRepository repository;

@PostMapping("/professional")
public ResponseEntity<String> addColleague(@RequestBody Professional professional) {
	professionalService.saveProfessional(professional);
	return new ResponseEntity<>(HttpStatus.CREATED);
}
} 