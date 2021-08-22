import java.util.Scanner;

class form_Credentials{
public static int  Double = 500 , king = 2000 , queen = 1000  ;//..........
int   immigration = 2500 ;
//public static String[] region= {"Asia ", "Africa ", "Europe"} ;////////////////
//public static String[] country1= {"Pakistan ", "China ", "Iran "} ;//////////////
//public static int[] appert ={2500 , 1000, 500};//////////////////
//public static String[] appname = {"king", "queen","Double"};/////////////////

    public void form(){
        Scanner zap = new Scanner(System.in);
        System.out.println("Please Select your Region");
        System.out.println(" 1. Asia \n 2. Africa \n 3. Europe ");
        int region = zap.nextInt();
//*********************************************************************************************************************************
        //..........Region 01 Starts Here

        if(region == 1){
            System.out.println("Please Select Your Country \n 1. Pakistan \n 2. China \n 3. Iran ");
            int c1= zap.nextInt();
            System.out.println(" Immigration fees is : " + immigration+" Rs");
            //......................country 01 of Asia...............
            //........................ Pakistan .....................

            if(c1 == 1) {
                System.out.println("Please Select your city\n 1. Lahore \n 2. Karachi \n 3. Islamabad");
                int d1 = zap.nextInt();
                System.out.println("Please Select Appartment size \n 1. Double Bed \n 2. Queen Bed \n 3. King Bed");
                int a1 = zap.nextInt();
                if (a1 == 1){
                    System.out.println("You have Selected Double Bed Room : "+ Double +"/per day");
                }
                if (a1 == 2){
                    System.out.println("You have Selected Queen Bed Room : "+ queen+"/per day");
                }
                if (a1 == 3){
                    System.out.println("You have Selected King Bed Room : "+ king+"/per day");
                }
                //............. city 01 of Pakistan
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. Lahore University of Management and Sciences \n 2. Government College University Lahore \n 3. University of Engineering and Techonology Lahore");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of LUMS University \n");
                                fee();
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of GCU Lahore \n ");
                        fee();
                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of UET Lahore \n " );
                        fee();
                    }


                }
                //...................city 02 of Pakistan
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. Institute of Business Administration Karachi \n 2. Agha khan University \n 3. NED University of Engineerning and Techonology");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Institute of Business Administration Karachi \n");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Agha khan University \n");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of NED University of Engineerning and Techonology \n ");
                        fee();                    }

                }
                //...................city 03 of Pakistan ....isb....
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. National University of Science and Techonology  \n 2. Quaid-i-Azam University Islamabad \n 3. Comsets University Islamabad");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of National University of Science and Techonology \n");
                        fee();
                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Quaid-i-Azam University Islamabad \n " );
                        fee();                    }

                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Comsets University Islamabad \n ");
                        fee();                    }

                }
            }
            //......................country 02 of Asia...............
            //........................ China .. .....................
            else if(c1 == 2) {
                System.out.println("Please Select your city\n 1. Beijing \n 2. Shanghai \n 3. Wuhan");
                int d1 = zap.nextInt();
                System.out.println("Please Select Appartment size \n 1. Double Bed \n 2. Queen Bed \n 3. King Bed");
                int a1 = zap.nextInt();
                if (a1 == 1){
                    System.out.println("You have Selected Double Bed Room : "+ Double +"/per day");
                }
                if (a1 == 2){
                    System.out.println("You have Selected Queen Bed Room : "+ queen+"/per day");
                }
                if (a1 == 3){
                    System.out.println("You have Selected King Bed Room : "+ king+"/per day");
                }
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. Tsinghua University \n 2. Shanghai University \n 3. Beijing Institute of Techonology");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Tsinghua University \n ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Shanghai University \n" );                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Beijing Institute of Techonology \n");
                        fee();                    }

                }
                //...................city 02 of China
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. Xi'an Jiaotong University \n 2. Shanghai Jiao Tong University \n 3. Tongji University");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Xi'an Jiaotong University \n ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Shanghai Jiao Tong University \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Tongji University \n  ");
                        fee();                    }

                }
                //...................city 03 of China ........
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. Huazhong University of Science and Techonology  \n 2. China University of Geo-Sciences University \n 3. Wuhan University ");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Huazhong University of Science and Techonology \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of China University of Geo-Sciences University \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Wuhan University \n  ");
                        fee();                    }

                }
            }
            //...................... Country 03 of Asia...............
            //......................... IRAN .........................
            else if(c1 == 3) {
                System.out.println("Please Select your city\n 1. Tehran \n 2. Isfahan \n 3. Mashhad");
                int d1 = zap.nextInt();
                System.out.println("Please Select Appartment size \n 1. Double Bed \n 2. Queen Bed \n 3. King Bed");
                int a1 = zap.nextInt();
                if (a1 == 1){
                    System.out.println("You have Selected Double Bed Room : "+ Double +"/per day");
                }
                if (a1 == 2){
                    System.out.println("You have Selected Queen Bed Room : "+ queen+"/per day");
                }
                if (a1 == 3){
                    System.out.println("You have Selected King Bed Room : "+ king+"/per day");
                }
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. University of Tehran \n 2. Islamic Azad University of South Tehran  \n 3. Iran Universities of Medical Sciences");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of University of Tehran \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Islamic Azad University of South Tehran \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Iran Universities of Medical Sciences \n ");
                        fee();                    }

                }
                //...................city 02 of iran
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. University of Isfahan \n 2. Isfahan University of Techonology \n 3. Golpayegan of kashan");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of University of Isfahan \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Isfahan University of Techonology \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Golpayegan of kashan \n  ");
                        fee();                    }

                }
                //...................city 03 of Iran ....isb....
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. Islamic Azad University of Mashhad  \n 2. Imam Reza International University \n 3. University of Applied Sciences");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Islamic Azad University of Mashhad \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Imam Reza International University \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of University of Applied Sciences \n  ");
                        fee();                    }

                }
            }
        }
//*********************************************************************************************************************************
//        ..........Region 02 Else if part of region 01

        else if (region == 2){
            System.out.println("Please Select Your Country \n 1. South Africa \n 2. Nigeria \n 3. Zambia ");
            int c1= zap.nextInt();
            System.out.println(" Immigration fees is : " + immigration+ " Rs");

            if(c1 == 1) {
                System.out.println("Please Select your city\n 1. Lahore \n 2. Karachi \n 3. Islamabad");
                int d1 = zap.nextInt();
                System.out.println("Please Select Appartment size \n 1. Double Bed \n 2. Queen Bed \n 3. King Bed");
                int a1 = zap.nextInt();
                if (a1 == 1){
                    System.out.println("You have Selected Double Bed Room : "+ Double +"/per day");
                }
                if (a1 == 2){
                    System.out.println("You have Selected Queen Bed Room : "+ queen+"/per day");
                }
                if (a1 == 3){
                    System.out.println("You have Selected King Bed Room : "+ king+"/per day");
                }
                //............. city 01 of Pakistan
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. Lahore University of Management and Sciences \n 2. Government College University Lahore \n 3. University of Engineering and Techonology Lahore");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of LUMS University \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of GCU Lahore \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of UET Lahore \n  ");
                        fee();                    }


                }
                //...................city 02 of Pakistan
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. Institute of Business Administration Karachi \n 2. Agha khan University \n 3. NED University of Engineerning and Techonology");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Institute of Business Administration Karachi \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Agha khan University \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of NED University of Engineerning and Techonology \n  ");
                        fee();                    }

                }
                //...................city 03 of Pakistan ....isb....
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. National University of Science and Techonology  \n 2. Quaid-i-Azam University Islamabad \n 3. Comsets University Islamabad");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of National University of Science and Techonology \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Quaid-i-Azam University Islamabad \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Comsets University Islamabad \n  ");
                        fee();                    }

                }
            }
            //......................country 02 of Asia...............
            //........................ China .. .....................
            else if(c1 == 2) {
                System.out.println("Please Select your city\n 1. Beijing \n 2. Shanghai \n 3. Wuhan");
                int d1 = zap.nextInt();
                System.out.println("Please Select Appartment size \n 1. Double Bed \n 2. Queen Bed \n 3. King Bed");
                int a1 = zap.nextInt();
                if (a1 == 1){
                    System.out.println("You have Selected Double Bed Room : "+ Double +"/per day");
                }
                if (a1 == 2){
                    System.out.println("You have Selected Queen Bed Room : "+ queen+"/per day");
                }
                if (a1 == 3){
                    System.out.println("You have Selected King Bed Room : "+ king+"/per day");
                }
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. Tsinghua University \n 2. Shanghai University \n 3. Beijing Institute of Techonology");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Tsinghua University \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Shanghai University \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Beijing Institute of Techonology \n  ");
                        fee();                    }

                }
                //...................city 02 of China
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. Xi'an Jiaotong University \n 2. Shanghai Jiao Tong University \n 3. Tongji University");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Xi'an Jiaotong University \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Shanghai Jiao Tong University \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Tongji University \n  ");
                        fee();                    }

                }
                //...................city 03 of China ........
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. Huazhong University of Science and Techonology  \n 2. China University of Geo-Sciences University \n 3. Wuhan University ");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Huazhong University of Science and Techonology \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of China University of Geo-Sciences University \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Wuhan University \n  ");
                        fee();                    }

                }
            }
            //...................... Country 03 of Asia...............
            //......................... IRAN .........................
            else if(c1 == 3) {
                System.out.println("Please Select your city\n 1. Tehran \n 2. Isfahan \n 3. Mashhad");
                int d1 = zap.nextInt();
                System.out.println("Please Select Appartment size \n 1. Double Bed \n 2. Queen Bed \n 3. King Bed");
                int a1 = zap.nextInt();
                if (a1 == 1){
                    System.out.println("You have Selected Double Bed Room : "+ Double +"/per day");
                }
                if (a1 == 2){
                    System.out.println("You have Selected Queen Bed Room : "+ queen+"/per day");
                }
                if (a1 == 3){
                    System.out.println("You have Selected King Bed Room : "+ king+"/per day");
                }
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. University of Tehran \n 2. Islamic Azad University of South Tehran  \n 3. Iran Universities of Medical Sciences");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of University of Tehran \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Islamic Azad University of South Tehran \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Iran Universities of Medical Sciences \n ");
                        fee();                    }

                }
                //...................city 02 of iran
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. University of Isfahan \n 2. Isfahan University of Techonology \n 3. Golpayegan of kashan");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of University of Isfahan \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Isfahan University of Techonology \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Golpayegan of kashan \n  ");
                        fee();                    }

                }
                //...................city 03 of Iran ....isb....
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. Islamic Azad University of Mashhad  \n 2. Imam Reza International University \n 3. University of Applied Sciences");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Islamic Azad University of Mashhad \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Imam Reza International University \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of University of Applied Sciences \n  ");
                        fee();                    }

                }
            }}
 //******************************************************************************************************************************************************
        //.......................Region 02 End --> Reigon 03 Start.............
        else if (region == 3){
            System.out.println("Please Select Your Country \n 1. Germany \n 2. Hungary \n 3. United Kingdom ");
            int c1= zap.nextInt();
            System.out.println(" Immigration fees is : " + immigration+" Rs");

            if(c1 == 1) {
                System.out.println("Please Select your city\n 1. Berlin \n 2. Munich \n 3. Frankfurt");
                int d1 = zap.nextInt();
                System.out.println("Please Select Appartment size \n 1. Double Bed \n 2. Queen Bed \n 3. King Bed");
                int a1 = zap.nextInt();
                if (a1 == 1){
                    System.out.println("You have Selected Double Bed Room : "+ Double +"/per day");
                }
                if (a1 == 2){
                    System.out.println("You have Selected Queen Bed Room : "+ queen+"/per day");
                }
                if (a1 == 3){
                    System.out.println("You have Selected King Bed Room : "+ king+"/per day");
                }
                //............. city 01 of Pakistan
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. Lahore University of Management and Sciences \n 2. Government College University Lahore \n 3. University of Engineering and Techonology Lahore");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of LUMS University \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of GCU Lahore \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of UET Lahore \n  ");
                        fee();                    }


                }
                //...................city 02 of Pakistan
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. Institute of Business Administration Karachi \n 2. Agha khan University \n 3. NED University of Engineerning and Techonology");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Institute of Business Administration Karachi \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Agha khan University \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of NED University of Engineerning and Techonology \n  ");
                        fee();                    }

                }
                //...................city 03 of Pakistan ....isb....
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. National University of Science and Techonology  \n 2. Quaid-i-Azam University Islamabad \n 3. Comsets University Islamabad");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of National University of Science and Techonology \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Quaid-i-Azam University Islamabad \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Comsets University Islamabad \n  ");
                        fee();                    }

                }
            }
            //......................country 02 of Asia...............
            //........................ China .. .....................
            else if(c1 == 2) {
                System.out.println("Please Select your city\n 1. Beijing \n 2. Shanghai \n 3. Wuhan");
                int d1 = zap.nextInt();
                System.out.println("Please Select Appartment size \n 1. Double Bed \n 2. Queen Bed \n 3. King Bed");
                int a1 = zap.nextInt();
                if (a1 == 1){
                    System.out.println("You have Selected Double Bed Room : "+ Double +"/per day");
                }
                if (a1 == 2){
                    System.out.println("You have Selected Queen Bed Room : "+ queen+"/per day");
                }
                if (a1 == 3){
                    System.out.println("You have Selected King Bed Room : "+ king+"/per day");
                }
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. Tsinghua University \n 2. Shanghai University \n 3. Beijing Institute of Techonology");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Tsinghua University \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Shanghai University \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Beijing Institute of Techonology \n  ");
                        fee();                    }

                }
                //...................city 02 of China
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. Xi'an Jiaotong University \n 2. Shanghai Jiao Tong University \n 3. Tongji University");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Xi'an Jiaotong University \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Shanghai Jiao Tong University \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Tongji University \n  ");
                        fee();                    }

                }
                //...................city 03 of China ........
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. Huazhong University of Science and Techonology  \n 2. China University of Geo-Sciences University \n 3. Wuhan University ");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Huazhong University of Science and Techonology \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of China University of Geo-Sciences University \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Wuhan University \n  ");
                        fee();                    }

                }
            }
            //...................... Country 03 of Asia...............
            //......................... IRAN .........................
            else if(c1 == 3) {
                System.out.println("Please Select your city\n 1. Tehran \n 2. Isfahan \n 3. Mashhad");
                int d1 = zap.nextInt();
                System.out.println("Please Select Appartment size \n 1. Double Bed \n 2. Queen Bed \n 3. King Bed");
                int a1 = zap.nextInt();
                if (a1 == 1){
                    System.out.println("You have Selected Double Bed Room : "+ Double +"/per day");
                }
                if (a1 == 2){
                    System.out.println("You have Selected Queen Bed Room : "+ queen+"/per day");
                }
                if (a1 == 3){
                    System.out.println("You have Selected King Bed Room : "+ king+"/per day");
                }
                if (d1 == 1) {
                    System.out.println("Universities include : \n 1. University of Tehran \n 2. Islamic Azad University of South Tehran  \n 3. Iran Universities of Medical Sciences");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of University of Tehran \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Islamic Azad University of South Tehran \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Iran Universities of Medical Sciences \n  ");
                        fee();                    }

                }
                //...................city 02 of iran
                else if (d1 == 2) {
                    System.out.println("Universities include : \n 1. University of Isfahan \n 2. Isfahan University of Techonology \n 3. Golpayegan of kashan");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of University of Isfahan \n  ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Isfahan University of Techonology \n  ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of Golpayegan of kashan \n  ");
                        fee();                    }

                }
                //...................city 03 of Iran ....isb....
                else if (d1 == 3) {
                    System.out.println("Universities include : \n 1. Islamic Azad University of Mashhad  \n 2. Imam Reza International University \n 3. University of Applied Sciences");
                    int uni1 = zap.nextInt();
                    if (uni1 == 1) {
                        System.out.println("\n Fee Structure of Islamic Azad University of Mashhad \n ");
                        fee();                    }
                    else if (uni1 == 2) {
                        System.out.println("\n Fee Structure of Imam Reza International University \n ");
                        fee();                    }
                    else if (uni1 == 3) {
                        System.out.println("\n Fee Structure of University of Applied Sciences \n");
                        fee();                    }

                }
            }
        }


    }
    public void fee(){
        System.out.println(
                " _______________________________________________________\n|\t\t" +
                        "\t\t\tFee Structure\t\t\t\t\t    |\n " +
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


    }
}

