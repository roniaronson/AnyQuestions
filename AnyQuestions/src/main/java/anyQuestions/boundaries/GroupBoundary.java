package anyQuestions.boundaries;

import java.util.Arrays;

public class GroupBoundary {

	private String id;
	private String CourseName;
	private String lecturerId;
	private LectureBoundary[] lectures;
	
	public GroupBoundary() {
		
	}

	public GroupBoundary(String id, String courseName, String lecturerId, LectureBoundary[] lectures) {
		this.id = id;
		CourseName = courseName;
		this.lecturerId = lecturerId;
		this.lectures = lectures;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String getLecturerId() {
		return lecturerId;
	}

	public void setLecturerId(String lecturerId) {
		this.lecturerId = lecturerId;
	}

	public LectureBoundary[] getLectures() {
		return lectures;
	}

	public void setLectures(LectureBoundary[] lectures) {
		this.lectures = lectures;
	}

	@Override
	public String toString() {
		return "GroupBoundary{" +
				"id='" + id + '\'' +
				", CourseName='" + CourseName + '\'' +
				", lecturerId='" + lecturerId + '\'' +
				", lectures=" + Arrays.toString(lectures) +
				'}';
	}
}
