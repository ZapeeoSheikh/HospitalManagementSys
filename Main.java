import java.util.*;
class store{
public void store() {
    int menu ;
    Scanner zap = new Scanner(System. in);
    Login_Panel lp = new Login_Panel();
    AccountCreation_Panel acp = new AccountCreation_Panel();
    Contact_Panel cp = new Contact_Panel();
    About_me am = new About_me();
    fee_structure fs = new fee_structure();



        System.out.println("\n ********************** Program Menu Panel ********************** ");
        System.out.println("\n 1- Login ");
        System.out.println(" 2- Account Creation ");
        System.out.println(" 3- Fee Structure ");
        System.out.println(" 4- Contact ");
        System.out.println(" 5- About ");
        System.out.println(" 6- Exit ");
        System.out.print(" Please Select an Option : ");


        try {
        menu = zap.nextInt();  //main menu input selection 1 2 3 4 5 6
        while( menu > 6 || menu <= 0 )
        {
            System.out.print("\n You are out of the Range \n Please Select an Option : ");
            menu = zap.nextInt();   }

        if (menu == 1) {
            //Login
            System.out.println(" Login ");
            lp.login();
            acp.report();

        }
        else if (menu == 2) {
            //Account Creation
            System.out.println(" Account Creation ");
            acp.signup();
//                Main();
        }
        else if (menu == 3) {
            //Fee Structure
            System.out.println(" Fee Structure ");
            fs.fee();
        }
        else if (menu == 4) {
            //Contact
            System.out.println(" Contact ");
            cp.contact();
        }
        else if (menu == 5) {
            //About me
            System.out.println(" About me ");
            am.about();
        }
        else if (menu == 6) {
            //Exit
//                System.out.println(" Exit ");
            System.out.println("\n********** Program Terminated Successfully **********");
            System.exit(0);          // Exit screen   // Terminate program

        }

    }  catch (Exception e)  {
        System.out.println("\n\n\t\t Something went Wrong \n ********** Program Terminated **********");

    }
}}
public class Main {
    public static void main(String[] args) {
       store s = new store();
       startup start = new startup();

        start.welcome();
        s.store();

    }

}
