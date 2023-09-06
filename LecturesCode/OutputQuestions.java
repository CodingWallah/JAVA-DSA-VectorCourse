class OutputQuestions {
    public static void main(String args[]) 
    {    
        //1st question - 31, 32, 35, 32.0    
         int g = 3;
         System.out.print(++g * 8);

         System.out.println("\n-------");
        //2nd question - Nan , infinity, 0.0 , all
         double a, b,c;
         a = 3.0/0;
         b = 0/4.0;
         c=0/0.0;

         System.out.println(a);
         System.out.println(b);
         System.out.println(c);

         System.out.println("\n-------");
         //3rd Question - 5 6 6 5, 5 6 5, Compile Error, Runtime Error 
         int x;
         x = 5;
         {
         int y = 6;
         System.out.print(x + " " + y);
         }
        // System.out.println(x + " " + y);

         System.out.println("\n-------");
         //4th Question - Guess Output ?
         byte by = 50;
         //by = by * 50;
         System.out.println(by);

         System.out.println("\n-------");
         //5th Question 
            int p,q,r,s;
            p=q=r=s=20;
            p+=q-=r*=s/=20;
           System.out.println(p+" "+q+" "+r+" "+s);

    } 
}