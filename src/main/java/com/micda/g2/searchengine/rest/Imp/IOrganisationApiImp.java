package com.micda.g2.searchengine.rest.Imp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@RequestMapping("org")
@EnableAutoConfiguration

public class IOrganisationApiImp {

	/*@RequestMapping("/greeting")
	public Organisation greeting(@RequestParam(value = "name", defaultValue = "Anonyme") String name) {
		Organisation organisation=new Organisation();
		organisation.setName(name);
		return organisation;
	}*/
	
	@GetMapping(value="/hello")
	public String sayhello() {
		System.out.println("I STillll LOVE");
		return "I Still love you...";
	}

}
