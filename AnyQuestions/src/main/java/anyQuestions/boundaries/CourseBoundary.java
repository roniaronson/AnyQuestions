package anyQuestions.boundaries;

import java.util.Arrays;

public class CourseBoundary {
	private String id;
    private String name;
    private GroupBoundary[] groups;

    public CourseBoundary(String id, String name, GroupBoundary[] groups) {
        this.id = id;
        this.name = name;
        this.groups = groups;
    }
    
    public CourseBoundary() {
    	
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupBoundary[] getGroups() {
        return groups;
    }

    public void setGroups(GroupBoundary[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "CourseInstanceBoundary{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
