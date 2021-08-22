public class Treatment {
    private int treatment_id;
    private String treatment_name;
    private int treatment_price;


    //Parameterless Constructor
    public Treatment(){

    }

    //Parameterized
    public Treatment(int treatment_id, String treatment_name, int treatment_price) {
        this.treatment_id = treatment_id;
        this.treatment_name = treatment_name;
        this.treatment_price = treatment_price;
    }


    // Implementation of Encapsulation
    public int getTreatment_id() {
        return treatment_id;
    }

    public void setTreatment_id(int treatment_id) {
        this.treatment_id = treatment_id;
    }

    public String getTreatment_name() {
        return treatment_name;
    }

    public void setTreatment_name(String treatment_name) {
        this.treatment_name = treatment_name;
    }

    public int getTreatment_price() {
        return treatment_price;
    }

    public void setTreatment_price(int treatment_price) {
        this.treatment_price = treatment_price;
    }


    public void display(){
        System.out.println("Treatment Id: "+getTreatment_id());
        System.out.println("Treatment Name: "+getTreatment_name());
        System.out.println("Treatment Price: "+getTreatment_price());

    }


    public static void main(String[] args) {
        Treatment treat = new Treatment(20,"Ali",2000);
        Doctor doctor = new Doctor(21,"Muhammad","Rameez",10299,456443239);
        PAtient patient = new PAtient(22,"Ahmed",103000,283648687);
        Appointment app = new Appointment(23,"13-08-2021","11:41am");



        treat.display();
        System.out.println("");
        doctor.display();
        System.out.println("");
        patient.display();
        System.out.println("");
        app.display();

    }
}

