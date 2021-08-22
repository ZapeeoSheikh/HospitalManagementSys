import java.text.SimpleDateFormat;
import java.util.*;

public class AccountCreation_Panel {
//        String fixemail = "@gmail.com";
        public static String firstnm , lastnm , susername , semail , scpassword , spassword , scountry , scity ;
        public static final int PASSWORD_LENGTH = 8 , immigration = 2500 , fee =5000, extra = 70000;
      public void signup(){
  //password validation storing here

        Scanner zap = new Scanner(System.in);
        System.out.println("\n********************** Account Creation Panel ********************** \n\n");
        System.out.println(" Welcome to Signup Page ");
        System.out.print(" Enter your first name : ");
        firstnm = zap.next();
        System.out.print(" Enter your last name : ");
        lastnm = zap.next();

        System.out.println(" Your recorded name is ");
              System.out.println("  " + firstnm.concat(" " + lastnm).toUpperCase());
        System.out.print(" Enter your username : ");
            susername = zap.next();


//.......................................................


        System.out.print(" Enter your Email : ");
        semail = zap.next();
//        System.out.println("Your recorded email is ");
//        System.out.println(semail.concat(fixemail));'




        System.out.print(" Enter your Country : ");
        scountry = zap . next();
        System.out.print(" Enter your City : ");
        scity = zap.next();
        System.out.print(" Enter your Password : ");
        spassword = zap.next();



//Password Validation
          boolean Validation = false;
                 while (Validation == false) {
                     if (is_Valid_Password(spassword)) {
                         System.out.println(" Valid Password " );
                         Validation = true ;
                     } else {
                    System.out.println(" Password is Not valid: " + spassword);
                         System.out.println("Enter your password again: ");
                         spassword = zap.next();
                         Validation = false ;


                     }
                 }

        System.out.print(" Confirm your Password : ");
        scpassword = zap.next();

// confirm password
        while (!(spassword.matches(scpassword ) )) {

            System.out.println(" Password does not match \n Try to use same Password");
            System.out.print(" Enter your Password: ");
            spassword = zap.next();
            if (is_Valid_Password(spassword)) {
                System.out.println(" Valid Password " );
            } else {
                System.out.println(" Password is Not valid : " + spassword);
                System.out.println(" Enter your password again: ");
                spassword = zap.next();
            }
            System.out.print(" Confirm your Password : ");
            scpassword = zap.next();

        }


// password stored in new path
         if (spassword.matches(scpassword) ){
             String newpass ="";
             newpass = spassword ;
             System.out.println(" Your password is "+newpass);

         }
        System.out.println(" Your Details has been Recorded\n");
          store az = new store();

          System.out.println(" Press 0 for Main menu and any number for exit ");
         int usermain = zap.nextInt();

         if (usermain == 0) {
             az.store();
             System.out.println(new String(new char[50]).replace("\0", "\r\n"));  // clear page
         }
         else
             System.exit(0);          // Exit screen   // Terminate program


      }


// Here is my password validation method
    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

    public void report(){
          Scanner ram = new Scanner (System .in);
        System.out.println("\n\n\n************************* Report Genration *************************\n\n");
        System.out.println(" Dear " + firstnm.concat(" " + lastnm).toUpperCase()+",\n Resident of "+scountry
        +", "+scity+" you have successfully Entered your Details.\n Now, you are one step away to go. Please " +
                "wait your Details are gathering ");
        System.out.println(" Loading ...");
        try {
            Thread.sleep(9000);
        }
        catch (Exception e) {
            System.out.println("ERROR");
        }
        System.out.println("\n\nYour Details are Featched below : ");
        System.out.println(" \n Your selected Region is " +"region name");
//        System.out.println(" You have choosen "+scity+" from "+scountry);
        System.out.println(" The Expected Immigartion fee is about "+ immigration +" Rs");
//        System.out.println(" The Appartment is cost around  "+"appartment cost "+" Rs");
        System.out.println(" The Calculated fee of "+"institute name "+" is "+"institute fee"+" Rs");
        System.out.println("\n ____________________________________________________________________   ");
        System.out.println(" ||\t\tYour Total Payable Amount is "+(fee+immigration+extra)+" Rs\t\t\t\t\t\t||");
        System.out.println(" ____________________________________________________________________   ");
        System.out.println("\nNote : Appartment fee will be Variable and can Change According to the required of the customer");



        Date current = new Date();
        System.out.print("Dated : " + current+"\n");
        SimpleDateFormat t = new SimpleDateFormat("MM.dd.yyyy");
        System.out.println(t.format(current));


        System.out.println("\n( Thank you So much for Choosing Our Immigration Management System )\n\n");
        System.out.println(" Press 4 for Contact panel ( rating ) and any number for exit ");
        int end = ram.nextInt();
        if (end == 4 ){
            Contact_Panel zs = new Contact_Panel();
            zs.contact();
        }
        else{
            System.out.println("***************************** Program Terminate Successfully *****************************");
            System.exit(0);          // Exit screen   // Terminate program
        }



    }
    }


// Password Rules
//                         System.out.print(
//                                 "1. A password must have at least eight characters.\n" +
//                                         "2. A password consists of only letters and digits.\n" +
//                                         "3. A password must contain at least two digits \n" +
//                                         "Input a password (You are agreeing to the above Terms and Conditions.): ");
