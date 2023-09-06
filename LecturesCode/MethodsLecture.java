public class MethodsLecture {
    public static void main(String[] args) {
        System.out.println("Hi");
        recursion(5);
       // int i= getReturnType();
        //System.out.println(sum(12,13));
       // sum1(1,2);
      //  println();
    //   MethodsLecture.println();
    //   MethodsLecture obj = new MethodsLecture();
    //   obj.println();
       
    }

   // // Methods in Java
   //    // Non Return Type
   //     static void println(){
   //      System.out.println("Hi I am non return type");
   //     }
   //    // Return Type
   //     static Integer getReturnType(){
   //        return 12;
   //      }
   //     //Return Type with Parameter
   //     static int sum(int num1, int num2){
   //     return num1+num2;
   //    }
   //     // Non Return Type with Parameter
   //      static void sum(int x, int y){
   //      System.out.println(x+y);
   //    }

   ////Method Overloading
       static void sum(int x, float y){
        System.out.println(x+y);
      }

       static int sum(int num1, int num2){
        return num1+num2;
      }

      static void sum(int num1, int num2, int num3, int num4){
        //return num1+num2;
      }

       //Recursion
        static void recursion(int num){
            
            if(num>0)
                recursion(num-1);

            System.out.println(num);
        }
       
}
