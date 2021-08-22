import java.util.Scanner;

public class About_me {
//    public static void main(String[] args) {
       public void about(){
        Scanner rmz = new Scanner(System.in);
        String myemail01 = "muhammadrmz871@gmail.com";
        System.out.println("\n********************** About me ********************** \n");


        System.out.println(" \t\t\tCREDITS\n\n"+" I am Muhammad Rameez, " +
                "doing Bachelor in Computer Science ( BsCS ) from Government College University Lahore. \n" +
                " I have done my intermediate degree with Pre-Enggenering, Prior I was a Computer Science \n" +
                " Student. Now, I have adopt my career as Computer Science Student. I am a Tech Enthusiast. \n" +
                " I admire to Learn more and more Skills. I have done Diffrent Certifications from Diffrent Plateforms\n " +
                "Being a Self-Motivated Person with High Goal, I wanted to be a powerful man. Power is not mean \n" +
                " Physical Strength However it's a Power of Fame due to my work. ");

        System.out.println("\n My Quotes \n\n Learn from EveryWhere, AnyWhere\n I am a Beauty lover, Intellect is a " +
                "Beauty\n Motivation plus passion leads toward Idealism\n\n");

        System.out.println(" Personal Email : "+myemail01);
        System.out.println(" GitHUB profile : " + " https://github.com/beingaravian ");
        System.out.println(" GitHUB Repository : " + " beingaravian/beingaravian ");
        System.out.println(" LinkedIn profile : " +" https://www.linkedin.com/in/muhammadrmz ");
        System.out.println(" Twitter profile : " +" https://twitter.com/Zapeeo_s?s=09 ");
        System.out.println(" Facebook profile : " +" https://www.facebook.com/rameez.kashif.54 ");

        store az = new store();

        System.out.println(" Press 0 for Main menu and any number for exit ");
        int usermain = rmz.nextInt();

        if (usermain == 0) {
         az.store();
         System.out.println(new String(new char[50]).replace("\0", "\r\n"));  // clear page
        }
        else
         System.exit(0);          // Exit screen   // Terminate program
       }

    }

