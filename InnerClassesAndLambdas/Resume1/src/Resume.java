import java.util.ArrayList;
import java.util.List;

public class Resume {
    // Create a public member inner class Education according to the specifications.
    public class Education {
        String school;
        String major;

        public Education(String schoolName, String major) {
            this.school = schoolName;
            this.major = major;
        }

        public String getSchool() {
            return school;
        }
        public void setSchool(String school) {
            this.school = school;
        }

        public String getMajor() {
            return major;
        }
        public void setMajor(String major) {
            this.major = major;
        }

        @Override
        public String toString() {
            return this.major + " at " + this.school;
        }
    }

    // Create a public static inner class called Experience, according to the specifications.
    public static class Experience {
        String jobTitle;
        int fromYear;
        int toYear;

        public Experience(String jobTitle, int startYear, int endYear) {
            this.jobTitle = jobTitle;
            this.fromYear = startYear;
            this.toYear = endYear;
        }

        @Override
        public String toString() {
            return this.fromYear + "-" + this.toYear + ": " + this.jobTitle;
        }
    }

    // Create the Person and List of Education and List of experience objects. They should be private.
    private Person person;
    private List<Education> educationList;
    private List<Experience> experienceList;


    public Resume(Person p){
        // This constructor should initialize the person and do all necessary initializations for the other methods to work.
        this.person = p;
        this.educationList = new ArrayList<>();
        this.experienceList = new ArrayList<>();
    }

    // Create the addEducation, addExperience and override the toString methods as specified.
    public void addExperience(Experience experience) {
        this.experienceList.add(experience);
    }

    public void addEducation(Education education) {
        this.educationList.add(education);
    }

    @Override
    public String toString() {
        return this.person.toString() +
                "\nExperience\n" + this.experienceList +
                "\nEducation\n" + this.educationList;
    }
}
