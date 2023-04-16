package anyQuestions.controllers;

import java.util.Date;
import java.util.Iterator;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import anyQuestions.boundaries.QuestionAnswerBoundary;
import anyQuestions.boundaries.UserBoundary;

@RestController
public class LectureController {

	@RequestMapping(
			path="/anyQuestions/Lecture/getSummery",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public QuestionAnswerBoundary[] getSummery() {
		QuestionAnswerBoundary[] demo = new QuestionAnswerBoundary[3];
		for(int i=0; i<demo.length; i++) {
			Date now = new Date();
			demo[i]= new QuestionAnswerBoundary("123456", "abcd", "314adc", "Who is the best dog?", "Luis the beagle", 101, now);
		}
		return demo;
	}
	
	@RequestMapping(
			path="/anyQuestions/Lecture/isLive/{lectureId}",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean isLive(@PathVariable("lectureId") String lectureId) {
		
		return true;
	}
}
