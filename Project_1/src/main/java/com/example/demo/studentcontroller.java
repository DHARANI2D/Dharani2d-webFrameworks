package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class studentcontroller {
	
	@Value("${Value.name}")
	private String newnameString;
	@GetMapping("/")
	public String homepage() {
		return newnameString+" to Student List";
	}
	
	@GetMapping("/list")
	public List<Name>getList(){
		List<Name> detailsList = new ArrayList<>();
		detailsList.add(new Name("XXXX",1,23));
		detailsList.add(new Name("yyyy",2,3));
		detailsList.add(new Name("zzzz",3,35));
		return detailsList;
	}	
}