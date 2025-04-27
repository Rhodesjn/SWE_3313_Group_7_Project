import java.util.Scanner;
import java.util.Date;
import java.util.NoSuchElementException;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Test {
   public static void main(String[] args) throws ParseException{
      //creating User 
      NewUser user = creatingUser();
  
      Income userIncome = inputingIncom(user);
      user.addRecord(userIncome);
      //testing userIncome's getters
      for (FinancialRecord record : user.getRecords()){
         System.out.println("Record for "+record.getUser().getName() + " : $"+record.getAmount());
      }
   }

   public static NewUser creatingUser(){
      Scanner scan = new Scanner(System.in);
      System.out.println("What is your name?");
      String userName = scan.nextLine();
      System.out.println("What is your email?");
      String userEmail = scan.nextLine();
      System.out.println("What currency do you use?");
      String userCurrnecy = scan.nextLine();
      scan.close();
      return new NewUser(userName, userEmail, userCurrnecy);
   }
   
    public static Income inputingIncom (NewUser user) throws ParseException {
      Scanner scan = new Scanner(System.in);
      System.out.println("What is the total amount of $$ in your account?");
      double userAmount = 0;
      try{
         userAmount=scan.nextDouble();
      } catch(NoSuchElementException e){
         System.out.println("No valid input found. Please Try again.");
      }
   

      //scan.nextLine();      

      //scan.nextLine();
      System.out.println("Enter the date of Trasaction (MM/dd/yyyy): ");
      String dateString="";
      if(scan.hasNextLine()){
         dateString = scan.nextLine();
      }
      SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
      dateFormat.setLenient(false);
      Date date = dateFormat.parse(dateString);
      scan.close();
      return new Income(userAmount, date, user);
   }

}


 
