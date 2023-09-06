public class MostlyAskedBasicQuestions {
    // method to find factorial of given number using recursion
    // HW - using recursion
     static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }
    
    //print fibonacci series | HW - using recursion
    static void fibonacci(int n){
         int n1=0,n2=1,n3;    
         System.out.print(n1+" "+n2);//printing 0 and 1    
         for(int i=2;i<n;++i)
            {    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
            }   
       }
    
    //reverse the digits
     static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
    
    //Count Even or Odd digits and Summ , Palindrome - similar

    //palindrome string
    static boolean palindromeString(String string){
         String newstString = "";

        for(int i = string.length()-1; i>=0; i--)
        {
            newstString +=string.charAt(i);
        }

        if(string.equals(newstString))
               return true;
        return false;
    }
   

    static void swap(int num1, int num2){
        // num1 = num1 + num2;
        // num2 = num1 - num2;
        // num1 = num1 - num2;
        int temp = num1;
        num1=num2;
        num2=temp;
    }
    // Driver method
    public static void main(String[] args)
    {
        int num = 5;
       // System.out.println(num+"! = "+factorial(0));
       // fibonacci(5);
       // System.out.println(121==reverseDigits(121));
        //System.out.println(palindromeString("aba"));

        // int x = 10;
        // int y = 20;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        // System.out.println("Before Swapping "+ x + y);
        //  // int temp = x;
        //   x= x+y;
        //   y=x-y;
        //   x=x-y;
        // //swap(x, y);
        // System.out.println("After Swapping "+ x + y);


    }
}
