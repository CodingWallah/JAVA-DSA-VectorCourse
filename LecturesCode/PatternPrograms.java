import java.util.Scanner;

public class PatternPrograms {
    public static void main(String[] args) {
        int size=5;
         //pattern1(size);
        // pattern2(size);
         //pattern3(size);
        // pattern4(size);
        // pattern5(size);
         pattern6(size);
          //HourGlass();
         // diamond();
       // Full_Triangle();

    }

    public static void pattern1(int n){
        
            for(int row=1;row<n;row++){
                char ch='A';
                // for(int col=1;col<n;col++){
                //     System.out.print(ch);
                //     ch = (char)(ch+1);
                // }
                // System.out.print((char)(ch+col));
                 //  System.out.print(ch);
                // ending line after each row
                for(int col=1;col<n;col++){
                    if(row==1 || col== 1 || row==n-1 || col== n-1)
                    System.out.print(ch+" ");
                    else
                    System.out.print("  ");
                    ch++;
                }
                System.out.println();

            }

    }

    public static void pattern2(int n)
    {
        //STAR PATTERN
        for(int row=1; row<=n; row++)
        {
          for(int col=1; col<=row; col++)
            {
                // printing stars
                System.out.print("* ");
            }
            // ending line after each row
            System.out.println();
        }

        //CHARACTER
        char ch='A';
        for(int row=1; row<=n; row++)
            {
            for(int col=1; col<=row; col++)
                {
                    // printing stars
                    System.out.print((char)(ch));
                  //  ch = (char)(ch+1);
                }
                // ending line after each row
                System.out.println();
             ch = (char)(ch+1);
            }
   }

    public static void pattern3(int n){
         //STAR PATTERN
        for(int row=1; row<=n; row++)
        {
          for(int col=1; col<=n-row; col++)
            {
                // printing stars
                System.out.print("* ");
            }
            // ending line after each row
            System.out.println();
        }

        //CHARACTER
         char ch='A';
        
        for(int row=1; row<=n; row++)
            {
            for(int col=1; col<=n-row+1; col++)
                {
                    // printing stars
                    System.out.print(ch+" ");
                }
                // ending line after each row
                System.out.println();
                ch++;
            }
    }

   public static void pattern4(int n) {
    int num=1;
        for (int row = 0; row < 2 * n; row++) {
            int colms = row > n ? 2 * n - row: row;
            for (int col = 1; col <colms; col++) {
                 System.out.print(num);
            }
            num++;
            System.out.println();
        }
   }
 
    public static void pattern5(int n)
    {
        
        // for(int row=0; row<n; row++)
        // {
        //     // printing spaces
        //      for(int col=1; col<=n-row; col++)
        //         System.out.print(" ");
            
        //     // printing stars
        //     for(int col=0; col<=row; col++)
        //         System.out.print("* ");

        //     // end line after evry row
        //     System.out.println();
        // }

        //odd value triangle
    for(int row=0; row<n; row++)
            {
                for(int col=0; col<n; col++)
                // printing spaces
                  if(col<row)
                  System.out.print(" ");
                 // printing stars
                 else
                    System.out.print("* ");

                // end line after evry row
                System.out.println();
            }
    }

     public static void pattern6(int n)
    {
        
        for(int row=1; row<n; row++)
        {
            // printing spaces
             for(int col=1; col<row; col++)
                System.out.print(" ");
            
            // printing stars
            for(int col=1; col<=n-row; col++)
                System.out.print("*");

            //end line
             System.out.println();
        }

        System.out.println("---------------------------");
        //another soln - efficent soln
        int rows=n;
        for (int i = 1; i <= rows; i++) {
            // Print spaces for each row
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print odd stars for each row
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }


    }

    public static void HourGlass(){
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();

        int spaces = 0;
        int stars = rows;

        //method 2  
        //Printing the upper pattern
        for (int i = 1; i <= rows; i++)
        {
            //Printing the spaces
          for (int j = 1; j < i; j++)
              System.out.print(" ");

              //printing star or numbers
          for (int j = i; j <= rows; j++)
            {
                //System.out.print(j+" ");
                System.out.print("* ");
            }  
            System.out.println();
        }
        
 
       //Printing the lower pattern = reverse pattern
        for (int i = rows-1; i >= 1; i--)
        {
            //Printing the spaces
          for (int j = 1; j < i; j++)
                  System.out.print(" ");

           //printing star or numbers
          for (int j = i; j <= rows; j++)
            {
                //System.out.print(j+" ");
                 System.out.print("* ");
            }  
            System.out.println();
        }
    }

      public static void diamond() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();

        int spaces = rows / 2;
        int stars = 1;

        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) {

            //print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            //print stars
            for (int j = 1; j <= stars; j++) {
                //System.out.print("*");
                System.out.print(j);
            }

            System.out.println();

            if (i <= rows / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
    }


     public static void Full_Triangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the character: ");
        char ch = scanner.nextLine().charAt(0);

        for (int row = 1; row <= height; row++) {

            //print the spaces
            for (int col = 1; col <= height - row; col++) {
                System.out.print(" ");
            }

            //print character
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }

}

 