public class Doctor {
    private int doctor_id;
    private String doctor_fname;
    private String doctor_Iname;
    private int doctor_cnic;
    private int doctor_mobile;



    //Parameterless Constructor
    public Doctor(){

    }

    //Parameterized
    public Doctor(int doctor_id, String doctor_fname, String doctor_Iname, int doctor_cnic, int doctor_mobile) {
        this.doctor_id = doctor_id;
        this.doctor_fname = doctor_fname;
        this.doctor_Iname = doctor_Iname;
        this.doctor_cnic = doctor_cnic;
        this.doctor_mobile = doctor_mobile;
    }



    // Implementation of Encapsulation
    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_fname() {
        return doctor_fname;
    }

    public void setDoctor_fname(String doctor_fname) {
        this.doctor_fname = doctor_fname;
    }

    public String getDoctor_Iname() {
        return doctor_Iname;
    }

    public void setDoctor_Iname(String doctor_Iname) {
        this.doctor_Iname = doctor_Iname;
    }

    public int getDoctor_cnic() {
        return doctor_cnic;
    }

    public void setDoctor_cnic(int doctor_cnic) {
        this.doctor_cnic = doctor_cnic;
    }

    public int getDoctor_mobile() {
        return doctor_mobile;
    }

    public void setDoctor_mobile(int doctor_mobile) {
        this.doctor_mobile = doctor_mobile;
    }


    public void display(){
        System.out.println("Doctor Id: "+getDoctor_id());
        System.out.println("Doctor First Name: "+getDoctor_fname());
        System.out.println("Doctor Last Name: "+getDoctor_Iname());
        System.out.println("Doctor Cnic: "+getDoctor_cnic());
        System.out.println("Doctor Mobile: "+getDoctor_mobile());
    }
}
