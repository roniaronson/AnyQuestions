package anyQuestions.boundaries;

import java.util.Date;

public class LectureBoundary {
	
	private String id;
    private boolean isLive;
    private QuestionAnswerBoundary []summary;
    private Date timestamp;

    public LectureBoundary() {
    	
    }
    
    public LectureBoundary(String id, boolean isLive, QuestionAnswerBoundary []summary, Date timestamp) {
        this.id = id;
        this.isLive = isLive;
        this.summary = summary;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public QuestionAnswerBoundary[] getSummary() {
        return summary;
    }

    public void setSummary(QuestionAnswerBoundary[] summary) {
        this.summary = summary;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "LectureBoundary{" +
                "id='" + id + '\'' +
                ", isLive=" + isLive +
                ", summary=" + summary +
                ", timestamp=" + timestamp +
                '}';
    }
}
