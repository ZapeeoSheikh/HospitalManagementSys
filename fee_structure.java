import java.util.Scanner;

class fee_structure {
 public void fee(){


           System.out.println(
                              " _______________________________________________________\n|\t\t" +
                                           "\t\tIdeal Fee Structure\t\t\t\t\t    |\n " +
                              "_______________________________________________________" +
                            "\n| Program  |    \tAdmission fees\t | Total fee(4 Year)|" +
                            "\n|Bs (Comp) |    \t Rs 28300\t     |    Rs 2.8 M \t\t|" +
                            "\n|Bs (Engg) |    \t Rs 19500\t     |    Rs 2.0 M \t\t|" +
                            "\n|BBA & BAF |    \t Rs 15500\t     |    Rs 1.4 M \t\t|" +
                            "\n|MBA(acc)  |    \t Rs 10500\t     |    Rs 1.9 M \t\t|" +
                            "\n|Ms (Comp) |    \t Rs 2500\t     |    Rs 1.0 M \t\t|" +
                            "\n|ph.D      |    \t Rs 8500\t     |    Rs 1.9 M \t\t|" +
                            "\n ________________________________________________________");



           System.out.println("\n\n ____________________________________\n" +
                             "|Additional Transicpt fee | Rs 200   |\n" +
                             "|Campus Transfer Fee      | Rs 5000  |\n" +
                             "|Degree Correction Fee    | Rs 2000  |\n" +
                             "|Semester Freeze Fee      | Rs 10000 |\n " +
                             "____________________________________\n");


     store az = new store();
     Scanner zap = new Scanner(System.in);
     System.out.println(" Press 0 for Main menu and any number for exit ");
     int usermain = zap.nextInt();

     if (usermain == 0) {
         az.store();
         System.out.println(new String(new char[50]).replace("\0", "\r\n"));  // clear page
     }
     else
         System.exit(0);          // Exit screen   // Terminate program


 }
}