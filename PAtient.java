public class PAtient {
    private int patient_id;
    private String patient_name;
    private int patient_cnic;
    private int patient_mobile;



    //Parameterless Constructor
    public PAtient(){

    }

    //Parameterized
    public PAtient(int patient_id, String patient_name, int patient_cnic, int patient_mobile) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_cnic = patient_cnic;
        this.patient_mobile = patient_mobile;
    }


    // Implementation of Encapsulation
    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public int getPatient_cnic() {
        return patient_cnic;
    }

    public void setPatient_cnic(int patient_cnic) {
        this.patient_cnic = patient_cnic;
    }

    public int getPatient_mobile() {
        return patient_mobile;
    }

    public void setPatient_mobile(int patient_mobile) {
        this.patient_mobile = patient_mobile;
    }



    public void display(){
        System.out.println("Patient Id: "+getPatient_id());
        System.out.println("Patient Name: "+getPatient_name());
        System.out.println("Patient Cnic: "+getPatient_cnic());
        System.out.println("Patient Mobile: "+getPatient_mobile());
    }
}
