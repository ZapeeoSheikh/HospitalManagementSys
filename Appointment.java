public class Appointment {
    private int app_id;
    private String app_date;
    private String app_time;

    //Parameterless Constructor
    public Appointment(){

    }

    //Parameterized
    public Appointment(int app_id, String app_date, String app_time) {
        this.app_id = app_id;
        this.app_date = app_date;
        this.app_time = app_time;
    }

    // Implementation of Encapsulation
    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    public String getApp_date() {
        return app_date;
    }

    public void setApp_date(String app_date) {
        this.app_date = app_date;
    }

    public String getApp_time() {
        return app_time;
    }

    public void setApp_time(String app_time) {
        this.app_time = app_time;
    }


    public void display(){
        System.out.println("App Id: "+getApp_id());
        System.out.println("App date: "+getApp_date());
        System.out.println("App time: "+getApp_time());
    }
}
