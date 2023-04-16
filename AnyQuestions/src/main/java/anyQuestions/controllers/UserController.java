package anyQuestions.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import anyQuestions.boundaries.UserBoundary;

@RestController
public class UserController {

	@RequestMapping(
			path="/anyQuestions/users/addUser",
			method=RequestMethod.POST,
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserBoundary createUser(@RequestBody UserBoundary  newUser) {
		UserBoundary demo = new UserBoundary();
		demo.setUsername(newUser.getUsername());
		demo.setPassword(newUser.getPassword());
		demo.setActive(newUser.getActive());
		demo.setType(newUser.getType());
		demo.setCreatedTimestamp(newUser.getCreatedTimestamp());
		System.err.println(demo.toString());
		return demo;
	}
	
	@RequestMapping(
			path="/anyQuestions/users/login/{username}/{password}",
			method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public String login(@PathVariable("username") String username, @PathVariable("password") String password) {	
		String str = "STUDENT";
		System.err.println(username + " " + password);
		return str;
	}
	
}
