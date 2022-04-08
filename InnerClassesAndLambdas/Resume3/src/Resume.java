import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {
    // Same two inner classes and member variables as in task 3.
// Copy the two inner classes of Resume exactly as they were in Task 2. Copy->paste.
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


    // Create a member variable of type Person (exactly as in task 2)
    private Person person;

    // Create a List to hold values of type Education (exactly as in task 2)
    private List<Education> educationList;

    // Create a Priority Queue that holds values of type Experience.
    private PriorityQueue<Experience> experiencePriorityQueue;



    public Resume(Person p){
        // Same initialization of Person and the List of Education objects
        this.person = p;
        this.educationList = new ArrayList<>();
        // Initialize the priority queue in one line, without importing the Comparator interface.
        // Initialize the priority queue with a comparator defined in an anonymous inner class. Check the specs for the comparator.
        this.experiencePriorityQueue = new PriorityQueue<>((experience1, experience2) -> experience2.toYear - experience1.toYear);
    }


    // The getter for experience and the methods to add education and experience objects stay the same, as well as the toString()
    // Add a standard getter for the experiences. getExperience. it should return a priority queue.
    public PriorityQueue<Experience> getExperience() {
        return this.experiencePriorityQueue;
    }

    // Implement the addEducation, addExperience and override the toString() methods exactly as you did in task 2 (Copy->Paste)
    // Create the addEducation, addExperience and override the toString methods as specified.
    public void addExperience(Experience experience) {
        this.experiencePriorityQueue.add(experience);
    }

    public void addEducation(Education education) {
        this.educationList.add(education);
    }

    @Override
    public String toString() {
        return this.person.toString() +
                "\nExperience\n" + this.experiencePriorityQueue +
                "\nEducation\n" + this.educationList;
    }


}
