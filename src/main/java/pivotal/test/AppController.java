package pivotal.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/AppApi")
public class AppController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET,produces =MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<?> index() {
		
		MultiValueMap<String, String> dummyData=new LinkedMultiValueMap<String, String>();
		dummyData.add("Company", "Shree Partners Pvt Ltd");
		dummyData.add("Location", "Gurgaon");
		
		System.out.println("Deepak Application");
		
		return ResponseEntity.status(HttpStatus.OK).body(dummyData);
	
	}

}
