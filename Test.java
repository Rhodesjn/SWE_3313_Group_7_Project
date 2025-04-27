import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Test {
   public static void main(String[] args) throws ParseException{
      Scanner scan = new Scanner(System.in);
      //creating User 
      NewUser user = creatingUser(scan);
      //adding income for the user
      Income userIncome = inputingIncom(user, scan);
      user.addRecord(userIncome);

      //printing user's information 
      for (FinancialRecord record : user.getRecords()){
         System.out.println("Record for "+record.getUser().getName() + " : $"+record.getAmount());
      }
      scan.close();
   }

   public static NewUser creatingUser(Scanner scan){
      
      System.out.println("What is your name?");
      String userName = scan.nextLine();
      System.out.println("What is your email?");
      String userEmail = scan.nextLine();
      System.out.println("What currency do you use?");
      String userCurrnecy = scan.nextLine();
      return new NewUser(userName, userEmail, userCurrnecy);
   }
    public static Income inputingIncom (NewUser user, Scanner scan) throws ParseException {
      System.out.println("What is the total amount of $$ in your account?");
      double userAmount = scan.nextDouble();
      scan.nextLine();
      System.out.println("Enter the date of Trasaction (MM/dd/yyyy): ");
      String dateString=scan.nextLine();
      SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
      dateFormat.setLenient(false);
      Date date = dateFormat.parse(dateString);
      scan.close();
      return new Income(userAmount, date, user);
   }
}


 
