import java.util.Scanner;

public class Login_Panel {
//    public static void main(String[] args) {
       public void login(){
        String fixusername = "@gmail.com";
        String lpassword;
        String lusername;
        String dob;
        String semail;
        Scanner zap = new Scanner(System.in);
//        AccountCreation_Panel acp = new AccountCreation_Panel();
//           acp.report();


        //Login Credentials
        System.out.println(new String (new char[50]).replace("\0","\r\n"));  // clear page
        System.out.println("\n********************** Login Panel ********************** \n\n");
//        System.out.println("Please Select one of the above options");
//        System.out.println("Press 1 for Login");
//        System.out.println("Press 2 for Signup");

//        int user = zap.nextInt();
//        if (user == 1) {
            System.out.println(" Welcome to Login Page ");
            System.out.print(" Enter your username : ");
            lusername = zap.next();

//            System.out.println("Your recorded email is ");
//            System.out.println(lemail.concat(fixemail));

            System.out.print(" Enter your Password : ");
            lpassword = zap.next();

            //System.out.println("\u000C");      //Symbol on a Screen
//            System.exit(0);          // Exit screen   // Terminate program


            while (!(lusername.equals("susername") && lpassword.equals("newpass"))) {

                System.out.println("\n Incorrect Email or Password");
                System.out.print(" Enter your username : ");
                lusername = zap.next();
//                System.out.println(lusername.concat(fixusername));

                System.out.print(" Enter your Password : ");
                lpassword = zap.next();
            }
            System.out.println("\n\t ************| \t Welcome to your profile \t |************ \n");

            form_Credentials fmc = new form_Credentials();
                        fmc.form();


//        }
    }
}

