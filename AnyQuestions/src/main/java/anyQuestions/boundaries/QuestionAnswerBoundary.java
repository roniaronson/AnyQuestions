package anyQuestions.boundaries;

import java.util.Date;

public class QuestionAnswerBoundary {
	
	 private String id;
	    private String courseId;
	    private String groupId;
	    private String lectureId;

	    private String question;
	    private String Answer;
	    private int likes;
	    private Date timestamp;
	    
	    public QuestionAnswerBoundary() {
	    	
	    }

	    public QuestionAnswerBoundary(String courseId, String groupId, String lectureId, String question, String answer, int likes, Date timestamp) {
	        this.courseId = courseId;
	        this.groupId = groupId;
	        this.lectureId = lectureId;
	        this.question = question;
	        Answer = answer;
	        this.likes = likes;
	        this.timestamp = timestamp;
	        generateID();
	    }

	    private void generateID(){
	        this.id = courseId+groupId+lectureId;
	        //TODO add number to id
	    }

	    public String getCourseId() {
	        return courseId;
	    }

	    public void setCourseId(String courseId) {
	        this.courseId = courseId;
	    }

	    public String getGroupId() {
	        return groupId;
	    }

	    public void setGroupId(String groupId) {
	        this.groupId = groupId;
	    }

	    public String getLectureId() {
	        return lectureId;
	    }

	    public void setLectureId(String lectureId) {
	        this.lectureId = lectureId;
	    }

	    public String getQuestion() {
	        return question;
	    }

	    public void setQuestion(String question) {
	        this.question = question;
	    }

	    public String getAnswer() {
	        return Answer;
	    }

	    public void setAnswer(String answer) {
	        Answer = answer;
	    }

	    public int getLikes() {
	        return likes;
	    }

	    public void setLikes(int likes) {
	        this.likes = likes;
	    }

	    public Date getTimestamp() {
	        return timestamp;
	    }

	    public void setTimestamp(Date timestamp) {
	        this.timestamp = timestamp;
	    }

	    @Override
	    public String toString() {
	        return "QuestionAnswer{" +
	                "id='" + id + '\'' +
	                ", courseId='" + courseId + '\'' +
	                ", groupId='" + groupId + '\'' +
	                ", lectureId='" + lectureId + '\'' +
	                ", question='" + question + '\'' +
	                ", Answer='" + Answer + '\'' +
	                ", likes=" + likes +
	                ", timestamp=" + timestamp +
	                '}';
	    }
}
