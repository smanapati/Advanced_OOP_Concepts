import java.util.ArrayList;
public class AdultPatient extends Person implements Diagnosable,Employable{
    double temperature;
    int systolic;
    int diastolic;
    ArrayList<String> pjb;

    @Override
    public double getTemperature() {

        return temperature;
    }

    @Override
    public int getSystolic() {

        return systolic;
    }

    @Override
    public int getDiastolic() {

        return diastolic;
    }

    @Override
    public void setTemperature(double t) {
        temperature = t;
    }

    @Override
    public void setSystolic(int s) {

        systolic = s;
    }

    @Override
    public void setDiastolic(int d) {

        diastolic = d;
    }

    @Override
    public ArrayList<String> getPreviousJobs(){
        return this.pjb;
    }

    @Override
    public void addJob(String pjb) {
        if(this.pjb== null)
            this.pjb = new ArrayList<String>();
        this.pjb.add(pjb);
    }
}

//public class AdultPatient   /* TODO */
//Implement the class Adult Patient.
//An adult patient is a Person that is Diagnosable and that is Employable.


