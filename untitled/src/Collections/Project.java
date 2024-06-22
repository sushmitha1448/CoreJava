package Collections;

public class Project {
    private int projectId;
    private String projectName;
    private String projectType;

    public int getProjectId() {
        return projectId;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectType='" + projectType + '\'' +
                '}';
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public Project(int projectId, String projectName, String projectType) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectType = projectType;
    }
}
