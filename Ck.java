import java.util.*;
import javax.swing.*;
 class Ck{
   public static String[] StudentId=new String[0];
   public static String[] StudentName=new String[0];
   public static int[] StudentPrfMarks=new int[0];
   public static int[] StudentDbmsMarks=new int[0];
   static String sID;
   static String sNames;
   static int sPrf;
   static int sDbms;


   public static void setStudentMarks(){
       Scanner in=new Scanner( System.in );
       for(int i=0; i<StudentId.length; i++){
           if(StudentId[i].equals( sID )){
               System.out.println("Student Name : "+StudentName[i]);
               System.out.println("\n");
               System.out.println(Arrays.toString( StudentId ));
               System.out.println(Arrays.toString( StudentName ));

               while( StudentPrfMarks[i] == 0){
                   System.out.println("This student's marks yet to be added:√.\nDo you want add marks of another Student(y/n): ");
                   char option=in.next().charAt( 0 );
                   clearConsole();
                   if(option=='y'){
                       addMarks();
                   }else{
                       mainbanner();
                   }
               }
               System.out.println("Programming Fundamental Marks : "+StudentPrfMarks[i]);
               System.out.println("Database management System Marks : "+StudentDbmsMarks[i]);
               System.out.println();
               System.out.print("Enter new Student prf marks : ");
               int prf=in.nextInt();
               while(prf<0 | prf>100 ) {
                   System.out.println( "Invalid marks ,please enter correct marks ↺ :\n" );
                   System.out.print("Programming Fundamental marks : ");
                   prf = in.nextInt();
               }
               sPrf=prf;
               setStudentPrfMarkCheck();
               System.out.println(Arrays.toString(StudentPrfMarks));

               System.out.print("Enter new Student dbms marks : ");
               int data=in.nextInt();
               while(data<0 | data>100 ) {
                   System.out.println( "Invalid marks ,please enter correct marks ↺:  \n" );
                   System.out.print("Database Management System Marks : ");
                   data =in.nextInt();
               }
            this.   sDbms=data;
               setStudentDbmsMarkCheck();
               StudentDbmsMarks[i]=data;

               System.out.println(Arrays.toString(StudentDbmsMarks));

               System.out.println("Do you want to Update marks another Student(y/n)");
               char option=in.next().charAt( 0 );
               clearConsole();
               if(option=='y'){
                   updateMarks();
               }else{
                   mainbanner();
               }
           }
       }
   }
   public static void setStudentDbmsMarkCheck(){
       Scanner in=new Scanner(System.in);
       for (int i = 0; i <StudentId.length ; i++){
           if (StudentId[i].equals(sID)){
           this.    StudentDbmsMarks[i]=sDbms;
               break;
           }
       }
   }
   public static void setStudentPrfMarkCheck(){
       Scanner in=new Scanner(System.in);
       for (int i = 0; i <StudentId.length ; i++){
           if (StudentId[i].equals(sID)){
           this.    StudentPrfMarks[i]=sPrf;
               break;
           }
       }
   }
   public static void getStudentMarkCheck(){
       Scanner in=new Scanner(System.in);
       for (int i = 0; i <StudentId.length; i++){
           if (StudentId[i].equals(sID)){
               System.out.print("Enter the name "+StudentName[i]+"\n");
               if ((StudentPrfMarks[i]==0)){
                   System.out.println(Arrays.toString(StudentId));
                   System.out.println(Arrays.toString(StudentName));

                   System.out.print("\nProgramming Fundamental marks : ");
                   int Prf=in.nextInt();
                   while(Prf<0 | Prf>100 ) {
                       System.out.println( "Invalid marks ,please enter correct marks↺: " );
                       System.out.print("Programming Fundamental marks : ");
                       Prf = in.nextInt();
                   }
                 this.  sPrf=Prf;
                   setStudentPrfMarkCheck();
                   System.out.println(Arrays.toString( StudentPrfMarks));

                   System.out.print("Database Management System Marks : ");
                   int data=in.nextInt();
                   while(data<0 | data>100 ) {
                       System.out.println( "Invalid marks ,please enter correct marks↺:  " );
                       System.out.print("Database Management System Marks : ");
                       data= in.nextInt();
                   }
                this.   sDbms=data;
                   setStudentDbmsMarkCheck();
                   System.out.println(Arrays.toString( StudentDbmsMarks ));

                   System.out.print("Marks have been added:√: Do you want add marks for another Student(y/n) ");
                   //Scanner oZ=new Scanner( System.in );
                   char option=in.next().charAt( 0 );
                   if(option=='y'){
                       addMarks();
                   }else {
                       mainbanner();
                   }
               }else{
                   System.out.println("This student's marks have been already added\n"+
                           "If you want to update the marks,please use [4] Update Marks Option  ");
                   System.out.println("Do you want to add marks for another Student ?(y/n) ");
                   char  option =in.next().charAt(0);
                   if (option=='y'){
                       clearConsole();
                       addMarks();

                   }else{
                       mainbanner();
                   }
               }
           }
       }
   }
   public static void getStudentIdCheck(){
       Scanner in=new Scanner(System.in);
       for (int i = 0; i <StudentId.length ; i++){
           if (StudentId[i].equals(sID)){
               System.out.print("The Student id already exists. \n Enter Student id: ");
         this.      sID=in.nextLine();
           }
       }
       getStudentID();
       System.out.print("Enter the name : ");
    this.sNames=in.nextLine();
       getStudentName();
       System.out.println(Arrays.toString(StudentId));
       System.out.println(Arrays.toString(StudentName));

   }
   public static void getDbmsMarks(){
       Scanner in=new Scanner(System.in);
       int [] temp=new int [StudentDbmsMarks.length+1];
       for (int i = 0; i <StudentDbmsMarks.length ; i++){
           temp[i]=StudentDbmsMarks[i];
       }
       for (int j = StudentDbmsMarks.length; j <temp.length ; j++){
           temp[j]=sDbms;
       }
    this.   StudentDbmsMarks=temp;
   }
   public static void getPrfMarks(){
       Scanner in=new Scanner(System.in);
       int [] temp=new int[StudentPrfMarks.length+1];
       for (int i = 0; i <StudentPrfMarks.length ; i++){
           temp[i]=StudentPrfMarks[i];
       }
       for (int j = StudentPrfMarks.length; j <temp.length ; j++){
           temp[j]=sPrf;
       }
    this.   StudentPrfMarks=temp;
   }
   public final static void clearConsole() {
       try {
           final String os = System.getProperty("os.name");
           if (os.contains("Windows")) {
               new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
           } else {
               System.out.print("\033[H\033[2J");
               System.out.flush();
           }
       }  catch (final Exception e) {
           e.printStackTrace();
           // Handle any exceptions.
       }
   }
   public static void addNewStudentWithMarks(){
       Scanner in=new Scanner(System.in);
       System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------    ");
       System.out.println();
       System.out.println("               					             |      ADD NEW STUDENT WITH MARKS      |    					               ");
       System.out.println();
       System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~     ");

       System.out.println("Enter Student Id: ");
     this.  sID=in.nextLine();
       getStudentIdCheck();

       System.out.println(" Programming fundamental marks: ");
       this.sPrf=in.nextInt();

       while(sPrf < 0 | sPrf >100) {
           System.out.println( "Invalid marks, please enter correct marks↺ : " );
           System.out.print( "Programming Fundamental Marks: " );
           this.sPrf = in.nextInt();
       }
       getPrfMarks();
       System.out.println(Arrays.toString(StudentPrfMarks));
       System.out.print("Database Management System Marks :");
       this.sDbms=in.nextInt();
       while(sDbms<0 | sDbms>100){
           System.out.println("Invalid marks, please enter correct marks↺ : ");
           System.out.print("Database Management System Marks :");
           sDbms=in.nextInt();
       }
       getDbmsMarks();
       System.out.print(Arrays.toString(StudentDbmsMarks));
       System.out.println("Student has been add Successfully: √: \n do you want add a new Student(y/N) :  ");
       char optimiz=in.next().charAt(0);
       if (optimiz=='n'){
           clearConsole();
           mainbanner();
       }else{
           addNewStudentWithMarks();

       }
   }
   public static void addMarks(){
           Scanner in=new Scanner(System.in);
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------    ");
           System.out.println();	
           System.out.println("                              					    |      ADD MARKS       |             					               ");
           System.out.println();
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------     ");

           System.out.print("Enter Student Id: ");
          this. sID=in.nextLine();
           getStudentMarkCheck();

           while(true){
               System.out.print("Invalid Student Id.Do you want to Search again ↺ (y/n) : ");
               Scanner oZ=new Scanner(System.in);
               char optimiz=oZ.next().charAt(0);
               if (optimiz=='y'){
                   System.out.print("Enteer Student Id : ");
               this.sID=in.nextLine();
                   getStudentMarkCheck();
                   addMarks();
               }else{
				   clearConsole();
                   mainbanner();
               }
           }
   }
   public static void upDateDetails(){
       Scanner in=new Scanner(System.in);
       for (int i = 0; i <StudentId.length ; i++){
           if (StudentId[i].equals(sID)){
               System.out.print("Student Name : "+StudentName[i]);
               System.out.print("Enter the new name : ");
               StudentName[i]=in.nextLine();
               System.out.println(Arrays.toString(StudentId));
               System.out.println(Arrays.toString(StudentName));

               System.out.print("Student has been added successfully: Do you want to add a new Student(y\n) : ");
               char option=in.next().charAt(0);;
               clearConsole();
               if (option=='y'){
                   updateStudentDetails();
               }else{
                   mainbanner();
               }
           }
       }
   }
   public static void updateStudentDetails(){
       Scanner in=new Scanner(System.in);
       System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------    ");
       System.out.println();
       System.out.println("                        				 |      UPDATE STUDENT DETAILS      |    							               ");
       System.out.println();
       System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------     ");

       System.out.print("Enter Student Id : ");
       this.sID=in.nextLine();
       upDateDetails();

       while(true){
           System.out.print( "Invalid Student ID.Do you want to search again ↺ (y/n) : " );
           Scanner oZ=new Scanner( System.in );
           char optimiz=oZ.next().charAt( 0 );
           clearConsole();
           if (optimiz=='y'){
               System.out.print("Enter Student ID : ");
            this.   sID=in.nextLine();
               upDateDetails();
           }else{
			   clearConsole();
               mainbanner();
           }
       }
   }
   public static void updateMarks(){
           Scanner in=new Scanner(System.in);
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------    ");
           System.out.println();
           System.out.println("                        					    |      UPDATE MARKS    |         						          ");
           System.out.println();
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------     ");

           System.out.print("Input Student Id\t: ");
           this.sID=in.nextLine();
           setStudentMarks();

           while (true){
               System.out.print( "Invalid Student ID . \n Do you want to search again ↺ (y/n) : " );
               Scanner oZ=new Scanner(System.in);
               char  optimiz=in.next().charAt( 0 );
               clearConsole();
               if (optimiz=='y'){
                   System.out.print("Enter Student ID : ");
                this.   sID=oZ.nextLine();
                   setStudentMarks();
               }else{
                   mainbanner();
               }
           }
   }
   public static void DeleteStudent(){

           Scanner in=new Scanner(System.in);
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------    ");
           System.out.println();
           System.out.println("                       					     |      DELETE STUDENT      | 								                  ");
           System.out.println();
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------     ");
			
		System.out.print("Input Student Id \t: ");
        this.  sID=in.nextLine();
         


           for (int i = 0; i <StudentId.length; i++){
               if (StudentId[i].equals(sID)){
				   
           String[] dSt=new String[StudentId.length-1];
           String[] dSn=new String[StudentName.length-1];
           int[] dPrm=new int[StudentPrfMarks.length-1];
           int[] dDBms=new int[StudentDbmsMarks.length-1];

                   for (int j = 0; j <i ; j++){
                       dSt[j]=StudentId[j];
                       dSn[j]=StudentName[j];
                       dPrm[j]=StudentDbmsMarks[j];
                       dDBms[j]=StudentDbmsMarks[j];
                   }
                   for (int j =i; j<dSt.length ; j++){
                       dSt[j]=StudentId[j+1];
                       dSn[j]=StudentName[j+1];
                       dPrm[j]=StudentPrfMarks[j+1];
                       dDBms[j]=StudentDbmsMarks[j+1];
                   }
                   StudentId=dSt;
                   StudentName=dSn;
                   StudentDbmsMarks=dPrm;
                   StudentDbmsMarks=dDBms;
               }
           }
           System.out.print("Student has been added successfully:   Do you want add a new Student(Y/N) : ");
           char option =in.next().charAt(0);
           clearConsole();
           if (option=='y'){
                DeleteStudent();
               }else{
				mainbanner();
           }
      
       while (true){
           System.out.print("Invalid Student Id.  Do you want to Search again ↺ (y/n) : ");
           Scanner oZ=new Scanner(System.in);
           char optimiz=oZ.next().charAt(0);
           if (optimiz=='y'){
               System.out.print("Enter Student Id: ");
               sID=oZ.nextLine();
               DeleteStudent();
		   }else{
			   mainbanner();            
           }
       
   }
}
   public static void PrintStudentDetails(){
	   int []total=new int[StudentId.length];
       char option ='y';
       while(option=='y'){
           Scanner in=new Scanner(System.in);
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------    ");
           System.out.println();
           System.out.println("                            |      PRINT STUDENT DETAILS       |    						               ");
           System.out.println();
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------     ");
			
			System.out.print("Enter Student Id: ");
			sID=in.nextLine();
			
			for (int i = 0; i <StudentId.length ; i++){
				if (StudentId[i].equals(sID)){
					System.out.print("Student Name : "+StudentName);
					while (StudentPrfMarks[i]==0){
						System.out.print("This student's Marks yet to be added:√: do you want add Marks of another Student(y/N) : ");
						option =in.next().charAt(0);
						if (option=='y'){
							clearConsole();
							PrintStudentDetails();
							}else{
								mainbanner();
								}
							}
							total[i]=StudentPrfMarks[i]+StudentDbmsMarks[i];
						
							System.out.println("--------------------------------------------------------------------");
							System.out.println("Programming Fundamental :     		|   "+StudentPrfMarks[i]+"     |");
							System.out.println("Database Management System :        |	"+StudentDbmsMarks[i]+"     |");
							System.out.println("Total Marks :                       |   "+total[i]           +"     |");
							System.out.println("--------------------------------------------------------------------");
						
					}
				}
			
           System.out.print("Student has been added successfully:√:\n Do you want add a new Student(Y/N) :");
           option =in.next().charAt(0);
           clearConsole();
           if (option=='n'){
               clearConsole();
               mainbanner();

           }
       }
   }
   
   public static void PrintStudentRanks(){
       char option ='y';
       while(option=='y'){
           Scanner in=new Scanner(System.in);
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------    ");
           System.out.println();
           System.out.println("                          		  |      Print Student Ranks    |        		   		        ");
           System.out.println();	
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------     ");




           System.out.print("Student has been added successfully:√: \n Do you want add a new Student(Y/N) : ");
           option =in.next().charAt(0);
           clearConsole();
           if (option=='n'){
               clearConsole();
               mainbanner();

           }
       }
   }
   /**
 * 
 */
public static void BestinProgrammingFundamentals(){
       char option ='y';
       while(option=='y'){
           Scanner in=new Scanner(System.in);
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------    ");
           System.out.println();
           System.out.println("                            		|      BEST IN PROGRAMMING FUNDAMENTALS    |       				            ");
           System.out.println();
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------     ");


           System.out.print("Student has been added successfully:√: Do you want add a new Student(Y/N) :");
           option =in.next().charAt(0);
           clearConsole();
           if (option=='n'){
               clearConsole();
               mainbanner();

           }
       }

   }
   public static void BestinDatabaseManagementSystem(){
       char option ='y';
       while(option=='y'){
           Scanner in=new Scanner(System.in);
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------    ");
           System.out.println();
           System.out.println("                            		|      BEST IN DATABASE MANAGEMENT SYSTEM    |    			               ");
           System.out.println();
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------     ");



           System.out.print("Student has been added successfully: √. Do you want add a new Student(Y/N) :");
           option =in.next().charAt(0);
           clearConsole();
           if (option=='n'){
               clearConsole();
               mainbanner();

           }
       }

   }
   public static void getStudentName(){
       String[] temp=new String[StudentName.length+1];
       for (int i = 0; i <StudentName.length ; i++){
           temp[i]=StudentName[i];
       }
       for (int j = StudentName.length; j <temp.length ; j++){
           temp[j]= sNames;
       }
       this.StudentName=temp;
   }
   public static void getStudentID(){
       Scanner in=new Scanner(System.in);
       String [] temp =new String [StudentId.length+1];
       for (int i = 0; i <StudentId.length ; i++){
          this. temp[i]=StudentId[i];

       }
       for (int i = 0; i <StudentId.length; i++){
           while (StudentId[i].equals(sID)){
               System.out.println("THE Student ID already exists  \n");
               System.out.print("Enter  student id: ");
              this. sID=in.nextLine();
           }
       }
       for (int i = StudentId.length; i <temp.length ; i++){
           this.temp[i]=sID;
       }
       this.StudentId =temp;

   }
   public static void addNewStudent(){
       char option ='y';
       while(option=='y'){
           Scanner in=new Scanner(System.in);
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------    ");
           System.out.println();
           System.out.println("                           				 |      ADD NEW STUDENT     |                 								  ");
           System.out.println();
           System.out.print("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------     ");

           System.out.print("Enter student id: ");
           this.sID=in.nextLine();

           getStudentID();
           getPrfMarks();
           getDbmsMarks();

           System.out.print("Input Student name : ");
           this.sNames=in.nextLine();
           getStudentName();
           System.out.println("name "+Arrays.toString(StudentName)+"\t");
           System.out.println("Prf "+Arrays.toString(StudentPrfMarks)+"\t");
           System.out.println("Data "+Arrays.toString(StudentDbmsMarks)+"\t");

           System.out.print("Student has been added successfully .√:  Do you want add a new Student(Y/N)");
           option =in.next().charAt(0);
           if (option=='n'){
               clearConsole();
               mainbanner();
           }
       }
   }
   public static void mainbanner(){
       Scanner input=new Scanner(System.in);
       System.out.println("[-------------------------------------------------------------------------------------------------------------------------------------------------------------------------]");
      System.out.println();
       System.out.println("                         				    |      WELCOME TO GDSE MARKS MANAGEMENT SYSTEM     |                                             ");
      System.out.println();
       System.out.println("[-------------------------------------------------------------------------------------------------------------------------------------------------------------------------]");

       System.out.print("\n\n");
       //1
       System.out.print("                         [ 1 ] Add New Student  ");
       //2
       System.out.print("\t\t\t\t\t\t    [ 2 ] Add New Student With Marks  ");
       //3
       System.out.print("\n\n\t\t\t [ 3 ] Add Marks                        ");
       //4
       System.out.print("\t\t\t            [ 4 ] Update Student Details ");
       //5
       System.out.print("\n\n\t\t\t [ 5 ] Update Marks                         ");
       //6
       System.out.print("\t\t\t            [ 6 ] Delete Student ");
       //7
       System.out.print("\n\n\t\t\t [ 7 ] Print Student Details ");
       //8
       System.out.print("\t\t\t\t\t            [ 8 ] Print Student Ranks " );
       //9
       System.out.print("\n\n\t\t\t [ 9 ] Best in Programming Fundamentals ");
       //10
       System.out.println("\t\t\t            [ 10 ] Best in Database Management System     " );
       /////////////////////////////////////////////////////////////////////////////////
       System.out.print("\n\n\n Enter an option to continue :^_^: ");
       int option=input.nextInt();
       switch(option){
           case 1: clearConsole();addNewStudent();break;
           case 2: clearConsole();addNewStudentWithMarks();break;
           case 3: clearConsole();addMarks();break;
           case 4: clearConsole();updateStudentDetails();break;
           case 5: clearConsole();updateMarks();break;
           case 6: clearConsole();DeleteStudent();break;
           case 7: clearConsole();PrintStudentDetails();break;
           case 8: clearConsole();PrintStudentRanks();break;
           case 9: clearConsole();BestinProgrammingFundamentals();break;
           case 10:clearConsole();BestinDatabaseManagementSystem();break;
       }
   }

   public static void main(String[] args){
       mainbanner();
   }
}





