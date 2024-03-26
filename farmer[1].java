import java.util.Scanner;

class Farmer extends phonepe
{
   static Scanner sc = new Scanner(System.in);
   static Farmer obj = new Farmer();
   
    static void Selectcrop(){
        int selectcrop=sc.nextInt();

   }
        static String RESET = "\u001B[0m";
        static String RED = "\u001B[31m";
        static String GREEN = "\u001B[32m";
        static String YELLOW = "\u001B[33m";
        static String blink = "\u001B[5m";
    
   static  void displaycroplist()
   {
        System.out.println("  ----------------------------");
  	    System.out.println(RED+"   S.NO |   TYPES OF CROPS "+RESET);
		System.out.println("  ----------------------------");
        System.out.println("     1. |     paddy");
        System.out.println("     2. |     Maize");
        System.out.println("     3. |     Groundnut" );
        System.out.println("     4. |     Cotton");
        System.out.println("     5. |     Chillies");
        System.out.println("     6. |     Wheat");
        System.out.println("     7. |     Barley");
        System.out.println("     8. |     Gram");
        System.out.println("     9. |     sunflower");
        System.out.println("    10. |     leafy vegetables");
        System.out.println("  ----------------------------");
       System.out.println("please select the crop");
       int cropselection = sc.nextInt();
       System.out.println("Enter the name of the crop");
       String cropname = sc.next();
       if(cropselection ==1)
       {
           System.out.println("you have choosen the paddy\nSelect the type of paddy from the list:");
           System.out.println(" your selected crop is "+ cropname);
         displaypaddytype();
         displaystage();
         System.out.println("enter the number:");
         int stage = sc.nextInt();
          System.out.println("enter the stage of the crop:");
          if(stage==1){
            preparationofsoil();
          }
          else if(stage ==2){
            sowing();
          }
          else if(stage==3){
            addmanure();
          }
          else if(stage==4){
            irrigation();
          }
          else{
            harvest();
          }
           
       }
       else if(cropselection==2)
       {
           System.out.println("you have choosen the maize\nSelect the type of paddy from the list:");
           System.out.println(" your selected crop is "+ cropname);
         displaystage();
         System.out.println("enter the number:");
         int stage = sc.nextInt();
          System.out.println("enter the stage of the crop:");
          if(stage==1){
            preparationofsoil();
          }
          else if(stage ==2){
            sowing();
          }
          else if(stage==3){
            addmanure();
          }
          else if(stage==4){
            irrigation();
          }
          else{
            harvest();
          }
       }
       else if(cropselection==3)
       {
        System.out.println("you have choosen the groundnut\nSelect the type of paddy from the list:");
           System.out.println(" your selected crop is "+ cropname);
         displaygroundnuttype();
         displaystage();
         System.out.println("enter the number:");
         int stage = sc.nextInt();
          System.out.println("enter the stage of the crop:");
          if(stage==1){
            preparationofsoil();
          }
          else if(stage ==2){
            sowing();
          }
          else if(stage==3){
            addmanure();
          }
          else if(stage==4){
            irrigation();
          }
          else{
            harvest();
          }
       }
       else if(cropselection==4)
       {
        System.out.println("you have choosen the cotton\nSelect the type of paddy from the list:");
           System.out.println(" your selected crop is "+ cropname);
           displaycottontype();
         displaystage();
         System.out.println("enter the number:");
         int stage = sc.nextInt();
          System.out.println("enter the stage of the crop:");
          if(stage==1){
            preparationofsoil();
          }
          else if(stage ==2){
            sowing();
          }
          else if(stage==3){
            addmanure();
          }
          else if(stage==4){
            irrigation();
          }
          else{
            harvest();
          }
        }
        else if(cropselection==5)
       {
        System.out.println("you have choosen the chillies\nSelect the type of paddy from the list:");
           System.out.println(" your selected crop is "+ cropname);
           displaychilliestype();
         displaystage();
         System.out.println("Enter the number:");
         int stage = sc.nextInt();
          System.out.println("Enter the stage of the crop:");
          if(stage==1){
            preparationofsoil();
          }
          else if(stage ==2){
            sowing();
          }
          else if(stage==3){
            addmanure();
          }
          else if(stage==4){
            irrigation();
          }
          else{
            harvest();
          }
        }
        
    }
    
    static void displaystage(){
    System.out.println("please select the stage of the crop");
        System.out.println("  -----------------------------");
   	    System.out.println(RED+"   S.NO |   stages of the crop"+RESET);
		System.out.println("  -----------------------------");
        System.out.println("     1. |  preparation of soil");
        System.out.println("     2. |  sowing");
        System.out.println("     3. |  Adding manure");
        System.out.println("     4. |  Irrigation");
        System.out.println("     5. |  Harvesting");
        System.out.println("  -----------------------------");
                  
    }
    static void preparationofsoil(){
                  String cropstage1 =sc.next();
                  System.out.println(" your selected stage of the crop is "+cropstage1);
                  String s,a="",b="";
                  do{
                    System.out.println("these are the some chemicals and pesticides used in the preparation of soil:");
                    System.out.println("1.------->fertilizers");
                    System.out.println("2.------->pesticides");
                    System.out.println("please select anyone of them");
                    int n=sc.nextInt();
                    if(n==1){
                        a=fertilizer();
                    }
                    else if(n==2){
                        b=pesticides();
                   }
                   System.out.println("do you want to continue y or n");
                   s=sc.next();
                  }while(!s.equalsIgnoreCase("n"));
                  System.out.println("Your selected products are:"+a+","+b);
                  double am=750.00;
                  double bm=450.00;
                  System.out.println(billing(am,bm));
    } 
    static String fertilizer()
    {
        System.out.println(" ----------------------------------------------");
		System.out.println(GREEN+"    |S.NO |  TYPES OF FERTILIZERS.    |   WEIGHT"+RESET);
		System.out.println("  ----------------------------------------------");
        System.out.println("    | 1.  |  Super phosphate   -      |    50KGS");
        System.out.println("    | 2.  |  Urea.             -      |    45KGS");
        System.out.println("    | 3.  |  Ammonium sulphate -      |    50KGS");
        System.out.println("    | 4.  |  Vermicompos.      -      |    50KGS");
        System.out.println("  --------------------------------------------- ");
        System.out.println("please select the product");
        String n=sc.next();
        return n;
    }
    static String pesticides(){
        System.out.println("  ----------------------------------");
   	    System.out.println(YELLOW+"   S.NO |  TYPES OF PESTICIDES      "+RESET);
		System.out.println("  ----------------------------------");
        System.out.println("     1. |  paraquat dichloride 24 sl");
        System.out.println("     2. |  Glyphosate 41%sl.        ");
        System.out.println("  ----------------------------------");
        System.out.println("please select the product");
        String n=sc.next();
        return n;
    }
    static void sowing(){
                   String cropstage1 =sc.nextLine();
                   String s,a="",b="";
                   do{
                   System.out.println(" your selected stage of the crop is "+cropstage1);
                   System.out.println("these are the some chemicals and pesticides used in the sowing:");
                   System.out.println("");
                   System.out.println("1.------->fertilizers");
                   System.out.println("2.------->pesticides");
                   System.out.println("please select anyone of them");
                   int n=sc.nextInt();
                   if(n==1){
                    a=sfertilizer();
                   }
                   else if(n==2){
                    b=spesticides();
                   }
                   System.out.println("do you want to continue y or n");
                   s=sc.next();
               }while(!s.equalsIgnoreCase("n"));
               System.out.println("Your selected products are:"+a+","+b);
              double am=750.00;
                  double bm=450.00;
               System.out.println(billing(am,bm));
    }
    static String sfertilizer(){
        System.out.println(" ----------------------------------------------");
		System.out.println(RED+"    |S.NO |  TYPES OF FERTILIZERS.    |   WEIGHT"+RESET);
		System.out.println("  ----------------------------------------------");
        System.out.println("    | 1.  |  N.P.K             -      |    50KGS");
        System.out.println("    | 2.  |  Urea.             -      |    45KGS");
        System.out.println("    | 3.  |  Ammonium sulphate -      |    50KGS");
        System.out.println("    | 4.  |  factmfos(20-20).  -      |    50KGS");
        System.out.println("  ----------------------------------------------");
        System.out.println("please select the product");
        String n=sc.next();
        return n;
    }
    static String spesticides(){
        System.out.println("  ----------------------------------");
  	    System.out.println(YELLOW+"   S.NO |  TYPES OF PESTICIDES      "+RESET);
		System.out.println("  ----------------------------------");
        System.out.println("     1. |  Council Active.-45g      ");
        System.out.println("     2. |  Pretilachlor             ");
        System.out.println("     3. |  Herbicides.              ");
        System.out.println("  ----------------------------------");
        System.out.println("please select the product");
        String n=sc.next();
        return n;
    }
    static void addmanure(){
                  String cropstage1 =sc.nextLine();
                  String s,a="",b="";
                  do{
                   System.out.println(" your selected stage of the crop is "+cropstage1);
                   System.out.println("these are the some chemicals and pesticides used in the preparation of soil:");
                   System.out.println("");
                   System.out.println("1.------->fertilizers");
                   System.out.println("2.------->pesticides");
                   System.out.println("please select anyone of them");
                   int n=sc.nextInt();
                   if(n==1){
                    a=fertilizer();
                   }
                   else if(n==2){
                    b=apesticides();
                   }
                   System.out.println("do you want to continue y or n");
                   s=sc.next();
               }while(!s.equalsIgnoreCase("n"));
               System.out.println("your selected products are:"+a+","+b);
               double am=750.00;
                  double bm=450.00;
               System.out.println(billing(am,bm));
    }
    static String apesticides(){
        System.out.println("indoxacarb:Used to prevent pests especially beet armyworm");
        System.out.println("chlorpyrifos:used to control termites,mosquitoes,roundworms");
        System.out.println("permerthrin");
        System.out.println("Lambda cylothrin 9.5%+Thiomethoxam 12.6%");
          System.out.println("please select the product");
        String n=sc.next();
        return n;
    }
    static void irrigation(){
                  String cropstage1 =sc.nextLine();
                  String s,a="",b="";
                  do{
                   System.out.println(" your selected stage of the crop is "+cropstage1);
                   System.out.println("these are the some chemicals and pesticides used in the preparation of soil:");
                   System.out.println("");
                   System.out.println("1.------->fertilizers");
                   System.out.println("2.------->pesticides");
                   System.out.println("please select anyone of them");
                   int n=sc.nextInt();
                   if(n==1){
                    a=fertilizer();
                   }
                   else if(n==2){
                    b=ipesticides();
                   }
                   System.out.println("do you want to continue y or n");
                   s=sc.next();
               }while(!s.equalsIgnoreCase("n"));
               System.out.println("Your selected products are:"+a+","+b);
               double am=750.00;
                  double bm=450.00;
                  System.out.println(billing(am,bm));
    }
    static String ipesticides(){
        System.out.println("  ----------------------------------");
  	    System.out.println(RED+"   S.NO |  TYPES OF PESTICIDES      "+RESET);
		System.out.println("  ----------------------------------");
        System.out.println("     1. |  Spiromesifen 22.9%sc     ");
        System.out.println("     2. |  Chlorantraniliprole      ");
        System.out.println("     3. |  carbofuran               ");
        System.out.println("     4. |  cartap hydrochloride     ");
        System.out.println("  ----------------------------------");
        System.out.println("please select the product");
        String n=sc.next();
        return n;
    }
    static void harvest(){
                  String cropstage1 =sc.nextLine();
                  String s,a="",b="";
                  do{
                   System.out.println(" your selected stage of the crop is "+cropstage1);
                   System.out.println("these are the some chemicals and pesticides used in the preparation of soil:");
                   System.out.println("");
                   System.out.println("1.------->fertilizers");
                   System.out.println("2.------->pesticides");
                    System.out.println("please select anyone of them");
                   int n=sc.nextInt();
                   if(n==1){
                    a=fertilizer();
                   }
                   else if(n==2){
                    b=hpesticides();
                   }
                   System.out.println("do you want to continue y or n");
                   s=sc.next();
               }while(!s.equalsIgnoreCase("n"));
               System.out.println("Your selected products are:"+a+","+b);
               double am=750.00;
                  double bm=450.00;
                  System.out.println(billing(am,bm));
    }
    static String hpesticides(){
            System.out.println("  ----------------------------------------");
  	    System.out.println(YELLOW+"   S.NO |  TYPES OF PESTICIDES            "+RESET);
		System.out.println("  ----------------------------------------");
        System.out.println("     1. |  Trifumezoprim 10%sc            ");
        System.out.println("     2. | zoxystrobin 18,2%+difenoconazole");
        System.out.println("     3. |  carbofuran                     ");
        System.out.println("     4. |  cartap hydrochloride           ");
        System.out.println("  ----------------------------------------");
        System.out.println("please select the product");
        String n=sc.next();
        return n;
    }
    static void displaypaddytype(){
         System.out.println("  --------------------------");
  	    System.out.println(GREEN+"   S.NO |  TYPES OF SEEDS                 "+RESET);
		System.out.println("  --------------------------");
        System.out.println("     1. |  BPT           ");
        System.out.println("     2. |  Sonamasuri ");
        System.out.println("     3. |  Basmathi                     ");
        System.out.println("     4. |  KNM 733         ");
        System.out.println("     5. |  Sugarless       ");
        System.out.println("  --------------------------");
        System.out.println("Enter the name of the type");
        String paddy = sc.next();
        System.out.println("your selected paddy type is "+paddy);
        
          }
    static void displaygroundnuttype(){
        System.out.println("  --------------------------");
  	    System.out.println(YELLOW+"   S.NO |  TYPES OF SEEDS                 "+RESET);
		System.out.println("  --------------------------");
        System.out.println("     1. |  BG-1          ");
        System.out.println("     2. |  BG-2 ");
        System.out.println("     3. |  GAUG-1                    ");
        System.out.println("     4. |  GAUG-10        ");
        System.out.println("     5. |  parkash     ");
        System.out.println("  --------------------------");
        System.out.println("Enter the name of the type");
        String groundnut = sc.next();
        System.out.println("your selected groundnut type is "+groundnut);
        
          }
     static void displaycottontype(){
        System.out.println("  --------------------------");
  	    System.out.println(RED+"   S.NO |  TYPES OF SEEDS                "+RESET);
		System.out.println("  --------------------------");
        System.out.println("     1. |  SVPR-1         ");
        System.out.println("     2. |  Paiyur-1");
        System.out.println("     3. |  Savitha                    ");
        System.out.println("     4. |  HB-224       ");
        System.out.println("  --------------------------");
        System.out.println("Enter the name of the type");
        String cotton = sc.next();
        System.out.println("your selected cotton type is "+cotton);
        
          }
    static void displaychilliestype(){
        System.out.println("  ----------------------------------");
  	    System.out.println(GREEN+"   S.NO |  TYPES OF PADDY                 "+RESET);
		System.out.println("  ----------------------------------");
        System.out.println("     1. |  double cross chile seeds       ");
        System.out.println("     2. |  Poblano");
        System.out.println("     3. |  Hatch red medium                   ");
        System.out.println("     4. |  Guajillo chile seeds");
         System.out.println("    5. | chimayo chile seeds     ");
        System.out.println("  -----------------------------------");    
        System.out.println("Enter the name of the type");
        String chillies = sc.next();
        System.out.println("your selected chillies type is "+chillies);
        
          }
    static String billing(double am,double bm)
    {
        double tm=am+bm;
        System.out.println("Total amount is "+tm);
        System.out.println("please enter your address:");
        address();
        System.out.println("do you want to pay through 1.phone pay or 2.cash on delivery");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("1.UPI 2.Phone no 3.Account no");
            System.out.println("Select any on of them:");
            int n1=sc.nextInt();
            System.out.println("Enter transaction Number:");
            String a = sc.next();
            System.out.println("Enter amount :");
            String b= sc.next();
            if(n1==1){
                obj.pay(a,Double.parseDouble(b),tm);
            }
            else if(n1==2){
                obj.pay(Long.parseLong(a),Double.parseDouble(b),tm);
            }
            else{
                obj.pay(Long.parseLong(a),Float.parseFloat(b),tm);
            }
        }
        else if(n==2)
        {
            System.out.println("you`ve succcessfully purchased the product");
        }
        return "your product will be delivered soon";
    }
    static void address()
    {
        System.out.println("Door no:");
        String s = sc.next();
        System.out.println("Area:");
        String s1 = sc.next();
        System.out.println("city:");
        String s2 = sc.next();
        System.out.println("phone no:");
        long s3 = sc.nextLong();
    }
}


class phonepe {  

 void pay(String upi,double amt,double tm){

    System.out.println(upi);
    if(amt==tm){
        System.out.println("Tras done by upi");
        System.out.println("you`ve succcessfully purchased the product");
    }
    else{
        System.out.println("tansaction failed\n please check the amount you`ve entered");
    }
 }

  void pay(long pnumber,double amt,double tm){

    System.out.println(pnumber);

    if(amt==tm){
        System.out.println("Tras done by ph.no");
        System.out.println("you`ve succcessfully purchased the product");
    }
    else{
        System.out.println("tansaction failed\n please check the amount you`ve entered");

    } }

  void pay(long acc,float amt,double tm){

     System.out.println(acc);

    if(amt==tm){
        System.out.println("Tras done by Account");
        System.out.println("you`ve succcessfully purchased the product");
    }
    else{
        System.out.println("tansaction failed\n please check the amount you`ve entered");

    }
 }
}

interface I1
{
  void logout();
}

class Main extends Farmer  {
    static Scanner sc = new Scanner(System.in);
    private String  Firstname;
    private String  Gmail;
    private String pass;
    private String verpass;
        static String RESET = "\u001B[0m";
        static String RED = "\u001B[31m";
        static String GREEN = "\u001B[32m";
        static String YELLOW = "\u001B[33m";
        static String blink = "\u001B[5m";

    //  {
    //     System.out.println(GREEN+blink+"!------------> Hello welcome to the farmer Requirements <-----------!"+RESET);
    //     System.out.println("Login or Register");
    // }

    String login(String first) {

//        System.out.println("please select one option given below");
       if (first.equalsIgnoreCase("Register")) {
           System.out.println("PLEASE ENTER YOUR FIRST NAME");
           Firstname = sc.next();
           System.out.println("ENTER YOUR GMAIL ID");
           Gmail = sc.next();
           System.out.println("please create a login password for login:");
           pass = sc.next();
           System.out.println("please confirm your password");
           verpass = sc.next();
                      while (!verpass.equals(pass)) {
               System.out.println("you entered incorrect password");
               verpass = sc.next();
           }
           
           System.out.println("enter your phone number");
           long ph=sc.nextLong();
           int e=((int)(Math.random()*100000));
           System.out.println("OTP is:"+e);
           System.out.println("enter OTP");
           int otp=sc.nextInt();  
        
            while(otp!=e){
               System.out.println("you entered incorrect otp");
               otp=sc.nextInt();
           }
           System.out.println("Correct OTP"); 
           System.out.println("correct password");
           System.out.println("please login");
           String first1 = sc.next();
           while (!(first1.equalsIgnoreCase("login"))) {
                System.out.println("you have to login compulsory to move ahead");
                first1 = sc.next();
            }
           if (first1.equalsIgnoreCase("Login")) {
               System.out.println("please enter your Username:");
               String Firstname = sc.next();
               System.out.println("please enter your password to login");
               String pass = sc.next();
               while(!((this.Firstname.equals(Firstname)) && (this.pass.equals(pass)))) {
                   System.out.println("Login failed please check the details you have entered");
                   System.out.println("please enter your Username:");
                   Firstname=sc.next();
                   System.out.println("please enter your password to login");
                   pass = sc.next();
               }
               System.out.println("........Login successfully.........");
           }
         }
          else {
           System.out.println("Enter your user name:");
           String us = sc.next();
           System.out.println("Enter the password");
           String pa = sc.next();
           System.out.println("Invalid credentials");
           System.out.println("please login again or register you don't have an account");
           System.out.println("Please Register");
           return login(sc.next());

       }
       return "proceed for further";
   }
    static void selected() {
        System.out.println("  ------------------------------------");
  	    System.out.println(RED+"   S.NO |  BASED ON FARMER CONDITION              "+RESET);
		System.out.println("  ------------------------------------");
        System.out.println("     1. |  Based on the Climate     ");
        System.out.println("     2. |  Based on the Time duration");
        System.out.println("     3. |  Based on the Investment                  ");
        System.out.println("     4. |  Based on the Soil");
        System.out.println("  ------------------------------------");
    }
    static void Summer(){
        System.out.println("\t\t\tCROPS BASED ON SUMMER");
        System.out.println("1.Paddy (Rice):Although rice is a kharif (monsoon) crop. This is known as \"summer rice\" " +
                "and requires continuous water supply.");
        System.out.println("2.Maize: Maize is a warm-season crop that thrives in the summer heat of Andhra Pradesh.");
        System.out.println("3.Groundnut (Peanut): Groundnut is a summer crop in Andhra Pradesh.");
        System.out.println("4.Cotton: Cotton is grown during the summer season in parts of Andhra Pradesh. " +
                "The state is known for cotton cultivation, especially in the drier regions where the climate " +
                "is conducive to this crop.");
       System.out.println("5.Chillies: Chilli cultivation is prevalent in Andhra Pradesh throughout the year, " +
               "including the summer season. Andhra Pradesh is known for its spicy chilli varieties.");
    }
    static void Winter(){
        System.out.println("Crops based on the Winter");
        System.out.println("RABI CROPS (Winter Season Crops): Rabi crops are sown in the winter season and harvested in the spring. \nThese include:\n" +
                " WHEAT: Wheat is one of the major Rabi crops grown in Andhra Pradesh, primarily in district    s like Anantapur, Kadapa, and Kurnool.\n " +
                "BARLEY: Barley is another Rabi cereal crop grown in some parts of Andhra Pradesh.\n" +
                " GRAM (CHICKPEA): Chickpea is an important pulse crop cultivated during the winte          r season in various districts.");
    }
    static void Rainy(){
        System.out.println("Crops based on the Rainy");
        System.out.println("RICE: Rice is the staple food of Andhra Pradesh, and it is the primary crop grown during the rainy season. " +
                "The state is known for its high-quality rice varieties, including Sona Masuri, BPT 5204, and Swarna.");
        System.out.println("MAIZE: Maize is another important cereal crop that is cultivated during the rainy season." +
                " It is used for both human consumption and as animal feed.");
        System.out.println("GROUNDNUT (Peanut): Groundnut is a major oilseed crop grown during the monsoon season. " +
                "It is used for extracting oil and also as a snack when roasted.");
        System.out.println("Sunflower: Sunflower is a commercial oilseed crop that is planted during " +
                "the rainy season in some parts of Andhra Pradesh.");
    }
    static void Climate(){
        System.out.println("      CLIMATES OF INDIA       ");
        System.out.println("  ----------------------------");
  	    System.out.println(GREEN+"   S.NO |  BASED ON CLIMATE              "+RESET);
		System.out.println("  ----------------------------");
        System.out.println("     1. |  Summer    ");
        System.out.println("     2. |  Winter");
        System.out.println("     3. |  Rainy                ");
        System.out.println("  ----------------------------");
        System.out.println("Please select the climatic conditions according to your locality");
        int climateoption = sc.nextInt();
        if(climateoption==1){
            System.out.println("Please choose crop based on your Summer");
            Summer();
        }
        if(climateoption==2){
            System.out.println("Please choose crop based on your Winter");
            Winter();
        }
        if(climateoption==3){
            System.out.println("Please choose crop based on your Rainy");
           Rainy();
        }
        System.out.println();
    }
    static void threefour(){
      
        System.out.println("  -------------------------------");
  	    System.out.println(YELLOW+"   S.NO |  BASED ON 3 TO 4 MONTHS"+RESET);
		System.out.println("  -------------------------------");
        System.out.println("     1. |  Beetroot   ");
        System.out.println("     2. |  Rice");
        System.out.println("     3. |  Peanut               ");
        System.out.println("     4. |  Irish Potato               ");
        System.out.println("     5. |  Wheat              ");
        System.out.println("  -------------------------------");
    }
    static void foursix(){
        System.out.println("  -------------------------------");
  	    System.out.println(GREEN+"   S.NO |  BASED ON 4 TO 6 MONTHS"+RESET);
		System.out.println("  -------------------------------");
        System.out.println("     1. |  Spring Onion   ");
        System.out.println("     2. |  Rice");
        System.out.println("     3. |  Groundnut"              );
        System.out.println("     4. |  Carrot            ");
        System.out.println("     5. |  Cotton            ");
        System.out.println("  -------------------------------");
    }
    static void sixeight(){
        System.out.println("  -------------------------------");
  	    System.out.println(RED+"   S.NO |  BASED ON 6 TO 8 MONTHS"+RESET);
		System.out.println("  -------------------------------");
        System.out.println("     1. |  Cotton   ");
        System.out.println("     2. |  Mirchi");
        System.out.println("   \\\\\\\\\\\\ 3. |  Onion"              );
        System.out.println("     4. |  Turmeric            ");
        System.out.println("     5. |  Tobacco          ");
        System.out.println("  -------------------------------");
        
    }
    static void onetwo(){
        System.out.println("  -------------------------------");
  	    System.out.println(YELLOW+"   S.NO |  BASED ON 1 TO 2 YEARS"+RESET);
		System.out.println("  -------------------------------");
        System.out.println("     1. |  Lemon  ");
        System.out.println("     2. |  Sugarcane");
        System.out.println("     3. |  Pineapple"              );
        System.out.println("     4. |  Pappaya          ");
        System.out.println("     5. |  Rose         ");
        System.out.println("  -------------------------------");
        
    }
    static void leafy(){
      
        System.out.println("  -------------------------------");
  	    System.out.println(RED+"   S.NO |  LEAAFY VEGETABLES"+RESET);
		System.out.println("  -------------------------------");
        System.out.println("     1. |  Cabbage  ");
        System.out.println("     2. |  Red Sorrel(Gongura)");
        System.out.println("     3. |  Corainder"              );
        System.out.println("     4. |  Mint(Podhina)         ");
        System.out.println("     5. |  Lettuce(Palakura)  ");
        System.out.println("     6. |  Curry Leaf  ");
        System.out.println("     7. |  Asparagus(thotakura)  ");
        System.out.println("     8. |  Fenugreek(Methi) "   );
        System.out.println("  -------------------------------");
    }
    static void TimeDuration(){
        System.out.println("  -------------------------------");
  	    System.out.println(GREEN+"   S.NO | TIME DURATION"+RESET);
		System.out.println("  -------------------------------");
        System.out.println("     1. |  3 to 4 months ");
        System.out.println("     2. |  4 to 6 months");
        System.out.println("     3. |  6 to 8 months"              );
        System.out.println("     4. |  1 or 2 years        ");
        System.out.println("     5. |  Leafy Vegetables ");
        System.out.println("  -------------------------------");
        System.out.println("Please select the time duration based on your requirements");
        int timeduration = sc.nextInt();
        if(timeduration==1)
        {
            System.out.println("Please choose crop  3 to 4 months");
            threefour();
        }
        else if(timeduration==2)
        {
            System.out.println("Please choose crop  4 to 6 months");
            foursix();
        }
        else if(timeduration==3)
        {
            System.out.println("Please choose crop  6 to 8 months");
            sixeight();
        }
        else if(timeduration==4)
        {
            System.out.println("Please choose crop  1 or 2 years");
            onetwo();
        }
        else if(timeduration==5)
        {
            System.out.println("Please choose crop of leafy vegetables");
            leafy();
        }

    }
    static void Investment(){
        System.out.println("Investments on crop");
        System.out.println("  -------------------------------");
  	    System.out.println(YELLOW+"   S.NO | BASED ON INVESTMENT"+RESET);
		System.out.println("  -------------------------------");
        System.out.println("     1. |       Low ");
        System.out.println("     2. |       Medium");
        System.out.println("     3. |       High"              );
        System.out.println("  -------------------------------");
        int n=sc.nextInt();
        if(n==1)
        {
            low();
        }
        else if(n==2)
        {
            medium();
        }
        else if(n==3)
        {
            high();
        }

    }
    static void low()
    {
        System.out.println("  -------------------------------");
  	    System.out.println(GREEN+"   S.NO | BASED ON LOW INVESTMENT"+RESET);
		System.out.println("  -------------------------------");
        System.out.println("     1. |       Mango");
        System.out.println("     2. |       Cotton");
        System.out.println("     3. |       Leafy Vegetables"              );
        System.out.println("     4. |       Maize");
        System.out.println("  -------------------------------");
    }
    static void medium()
    {
        System.out.println("  --------------------------------------");
  	    System.out.println(YELLOW+"   S.NO |.   BASED ON MEDIUM INVESTMENT"+RESET);
		System.out.println("  --------------------------------------");
        System.out.println("     1. |       Paddy");
        System.out.println("     2. |       GroundNut");
        System.out.println("     3. |       Wheat"              );
        System.out.println("     4. |       Onions");
        System.out.println("     5. |       Tobacco");
        System.out.println("     6. |       Potato");
        System.out.println("  -------------------------------------");

    }
    static void high()
    {
         System.out.println("  --------------------------------------");
  	    System.out.println(RED+"   S.NO |   BASED ON HIGHINVESTMENT"+RESET);
		System.out.println("  --------------------------------------");
        System.out.println("     1. |      Turmeric");
        System.out.println("     2. |      SugarCane");
        System.out.println("     3. |      Sunflower"              );
        System.out.println("     4. |      Mirchi");
        System.out.println("     5. |      Lemon");
        System.out.println("  -------------------------------------");
    }
    static void Soiltype()
    {
        System.out.println("  -------------------------------");
  	    System.out.println("   S.NO |   BASED ON SOIL TYPE");
		System.out.println("  -------------------------------");
        System.out.println("     1. |      Red Soil");
        System.out.println("     2. |      Black soil");
        System.out.println("     3. |      Sandy soil"              );
        System.out.println("     4. |      Clay soil");
        System.out.println("  -------------------------------");
        int n=sc.nextInt();
        if(n==1)
        {
            red();
        }
        else if(n==2)
        {
            black();
        }
        else if(n==3)
        {
            sandy();
        }
        else {
            clay();
        }

    }
    static void red()
    {
        System.out.println("  -------------------------------");
  	    System.out.println("   S.NO |   BASED ON RED SOIL ");
		System.out.println("  -------------------------------");
        System.out.println("     1. |     GroundNut");
        System.out.println("     2. |     Sweet potato");
        System.out.println("     3. |     Paddy"              );
        System.out.println("     4. |     Tobacco");
        System.out.println("     5. |     Fruits");
        System.out.println("     6. |     Leafy Vegetables");
        System.out.println("  -------------------------------");
    }
    static void black()
    {
        System.out.println("  -------------------------------");
  	    System.out.println("   S.NO |   BASED ON BLACK SOIL   ");
		System.out.println("  -------------------------------");
        System.out.println("     1. |     Paddy");
        System.out.println("     2. |     Mirchi");
        System.out.println("     3. |     Pulses"              );
        System.out.println("     4. |     Millets");
        System.out.println("     5. |     Turmeric");
        System.out.println("  -------------------------------");
    }
    static void sandy()
    {
        System.out.println("  -------------------------------");
  	    System.out.println("   S.NO |   BASED ON SANDY SOIL ");
		System.out.println("  -------------------------------");
        System.out.println("     1. |     Carrot");
        System.out.println("     2. |     Radish");
        System.out.println("     3. |     Lettuce"              );
        System.out.println("     4. |     Tomatoes");
        System.out.println("     5. |     Corn");
        System.out.println("  -------------------------------");
    }
    static void clay()
    {
        System.out.println("  -------------------------------");
  	    System.out.println("   S.NO |   BASED ON CLAY SOIL ");
		System.out.println("  -------------------------------");
        System.out.println("     1. |     Potato");
        System.out.println("     2. |     Cabbage");
        System.out.println("     3. |     Wheat"              );
        System.out.println("     4. |     Broccoli");
        System.out.println("     5. |     Pumpkin");
        System.out.println("  -------------------------------");
    }

   static void selection(String select){  // method is used for the selection for farmer
        if(select.equalsIgnoreCase("Suggestions")) {
            selected();
            String s;
            do
            {
            System.out.println("Please select the condition based on your requirement ");
            int option = sc.nextInt();
                if (option == 1) {
                    System.out.println("Your selection option is Based on the climate");
                    Climate();
                } else if (option == 2) {
                    System.out.println("Your selection option is Based on the time duration");
                    TimeDuration();
                } else if (option == 3) {
                    System.out.println("Your selection option is Based on the Investment");
                    Investment();
                } else if (option == 4) {
                    System.out.println("Your selection option is Based on the Type of Soil");
                    Soiltype();
                }
                System.out.println("Do you want to select another condition: y or n");
                s=sc.next();
            } while (!s.equalsIgnoreCase("n"));
        }
        else if(select.equals("Buy")){
             System.out.println(blink+RED+"\t\t\t.........!!!!WELCOME TO  A.K FERTILIZERS.........!!!!"+RESET);
            System.out.println(GREEN+"\t\t\t******ALL TYPES OF FERTILIZERS AND PESTISIDES******");
            System.out.println(YELLOW+"\t\t\tPLEASE SELECT THE CROP WHAT YOU ARE CULTIVATING"); 
            displaycroplist();
        }
     
        }
   public void logout()
   {
       Main a1=new Main();  
       System.out.println("PLEASE ENTER YOUR USER NAME:");
       String username = sc.next();
       System.out.println("PLEASE ENTER YOUR PASS TO LOGUT");
       String userpass = sc.next();
  }
   public static void main(String[] args) {
      Main a1=new Main();
      String s1;
 System.out.println(blink+GREEN+"\t\t\t\t!------------> HELLO WELCOME TO THE FARMER REQUIREMENTS<-----------!"+RESET);
     System.out.println("\t\t\t\tPLEASE CHOOSE OF THE BELOW");
       System.out.println(RED+"\t\t\t\tPLEASE CLICK LOGIN FOR LOGIN YOUR ACCOUNT"+RESET);
       System.out.println(GREEN+"\t\t\t\tPLEASE CLICK REGISTER IF YOU ARE NEW TO THIS PAGE"+RESET);
       System.out.println(a1.login(sc.next()));
       do
       {
       System.out.println(YELLOW+"\t\t**PLEASE CHOOSE WHEATHER YOU NEED SUGGESTION OR BUY A PRODUCTS*"+RESET);
            System.out.println(YELLOW+"\t\t\t\tPLEASE CLICK SUGGESTIONS FOR CROPS SUGGEST"+RESET);
            System.out.println(RED+"\t\t\t\tPLEASE CLICK BUY FOR CROPS"+RESET);
       System.out.println("ENTER THE NAME");
       selection(sc.next());
       System.out.println("Do you want to Buy then enter y or n");
       s1=sc.next();
       }while(!s1.equalsIgnoreCase("n"));
      System.out.println("          please Logout       ");
       String first1 = sc.next();
           if (first1.equalsIgnoreCase("Logout")) {
                 a1.logout();
               }
               System.out.println(GREEN+"\t\t\t............Logout successfully........");
       System.out.println(blink+RED+"...........THANK YOU! VISIT AGAIN............");
    }
}