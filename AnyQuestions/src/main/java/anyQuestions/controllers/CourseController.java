package anyQuestions.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import anyQuestions.boundaries.CourseBoundary;

@RestController
public class CourseController {
	
	@RequestMapping(
			path="/anyQuestions/courses",
			method=RequestMethod.POST,
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public CourseBoundary createCourse(@RequestBody CourseBoundary  newCourse) {
		CourseBoundary demo = new CourseBoundary();
		demo.setId(newCourse.getId());
		demo.setName(newCourse.getName());
		demo.setGroups(newCourse.getGroups());
		System.err.println(demo.toString());
		return demo;
	}
	
	
}
