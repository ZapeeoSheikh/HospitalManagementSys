//////import java.util.Scanner;
//////
//////public class Demo_practice {
//////    public static void main(String[] args) {
//////        Scanner zap = new Scanner(System.in);
//////String password;
//////        System.out.print(" Enter your Password : ");
//////        password = zap.next();
//////
//////        // System pause .............
//////        try {
//////            Thread.sleep(1000);
//////        }
//////        catch (Exception e) {
//////            System.out.println("ERROR");
//////        }
//////        //...........................
//////        System.out.println(new String (new char[50]).replace("\0","\r\n"));
////////        clrscr();     //clear screen but not working
////////        System.out.println(Passcheck(password));
//////        System.out.println(" Whats up Guys !!!");
//////
////////        main(args);
//////    }
//////
//////    //....................Clear screen method ..............
////////        public static void clrscr(){
////////            //Clears Screen in java
////////            try {
////////                if (System.getProperty("os.name").contains("Windows"))
////////                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
////////                else
////////                    Runtime.getRuntime().exec("clear");
////////            } catch (Exception ex) {}
////////        }
////////        .................................................
//////
//////
//////
//////
////////    .................... Password Validations Method ....................
//////
////////    public static String Passcheck (String spassword) {
////////        String result = "Valid Password";
////////        int length = 0;
////////        int numCount = 0;
////////        int capCount = 0;
////////
////////        for (int i = 0; i <= spassword.length(); i++) {
////////            if ((spassword.charAt(i) >= 47 && spassword.charAt(i) <= 58) || (spassword.charAt(i) >= 64 && spassword.charAt(i) <= 91) || (spassword.charAt(i) >= 97 && spassword.charAt(i) <= 122)) {
////////                //keep the password
////////            } else {
////////                result = "Password contain invalid character";
////////            }
////////            if (spassword.charAt(i) >= 47 && spassword.charAt(i) <= 58) {
////////                numCount++;
////////            }
////////            if (spassword.charAt(i) >= 64 && spassword.charAt(i) <= 90) {
////////                capCount++;
////////            }
////////            length = (i + 1);
////////        } //end of loop
////////        if (numCount < 2) {
////////            result = " Not Enough number in password! ";
////////        }
////////        if (capCount < 2) {
////////            result = " Not Enough Capital letter in password! ";
////////        }
////////        if (length < 8) {
////////            result = " Password is too short! ";
////////        }
////////        return (result);
////////    }
//////
////////    .....................................................
//////}
//class Demo{
//    public static void main(String[] args) {
//        System.out.println("\n\nYour Details are Featched below : ");
//        System.out.println(" \n Your selected Region is " +"region name");
//        System.out.println(" You have choosen "+"scity"+" from "+"scountry"+"");
//        System.out.println(" The Expected Immigartion fee is about "+"immigration fee fix"+" Rs");
//        System.out.println(" The Appartment is cost around  "+"appartment cost "+" Rs");
//        System.out.println(" The Calculated fee of "+"institute name "+" is "+"institute fee"+" Rs");
//        System.out.println("\n\t ____________________________________________________________________   ");
//        System.out.println(" \t||\t\t\tYour Total Payable Amount is "+"total"+" Rs\t\t\t\t\t||");
//        System.out.println("\t ____________________________________________________________________   ");
//
//    }
//}