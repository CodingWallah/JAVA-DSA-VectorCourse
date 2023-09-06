import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.transform.Source;

public class InputOutputLecture {
    public static void main(String[] args) {
     // Input- Command line arguments
    // System.out.println(args[1]);
     // Input- Using Scanner Class
       // Scanner scan = new Scanner(System.in);
        //int a = scan.nextInt();
       // String st = scan.nextLine();
       // System.out.println("Your entered value is " + st);
        // char ch = scan.next().charAt(1);
        // System.out.println("Your Enterd Value is "+ch);


     // Input- Using BufferedReader
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  
        // try {
        //     String input = reader.readLine();
        //     System.out.println("Your input = "+input);
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
            
      
        //Output - print, println, printf, format, err
        // System.out.print("Shivam");
        // System.out.println("Sharma");
        // float n = 5.2222232f;
        // System.out.printf("%10.5f",n);

        //Date Format
      System.out.println(new Date());
      SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
      String str = ft.format(new Date());
      System.out.println("Formatted Date : " + str);

    
    }
}
