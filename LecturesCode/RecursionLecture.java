public class RecursionLecture {
    static int num=2;
    public static void recursion(){
            if(num>0){
                num--;
               recursion();
               
            }
              System.out.println("100");
            
    }

    // public static void print5(){
    //     System.out.println(5);
    //     print4();
    // }
    // public static void print4(){
    //     System.out.println(4);
    //     print3();
    // }
    // public static void print3(){
    //     System.out.println(3);
    //     print2();
    // }
    // public static void print2(){
    //     System.out.println(2);
    //     print1();
    // }
    // public static void print1(){
    //     System.out.println(1);
    // }
    public static void main(String[] args) {
        //recursion();
        //print5();
    }
    public static class Practice{

        static void myRFun1(int num){
                if(num== 0) return; 
                System.out.println(num);
                myRFun1(num-1);
                
        }

        static void myRFun2(int num){
                if(num== 0) return; 

                myRFun2(num-1);
                System.out.println(num);
                myRFun2(num-1);
        }

        static void myRFun3(int num){
                if(num== 0) return; 
                System.out.println(num);
                myRFun3(num-1);
                System.out.println(num);
        }

        public static void main(String[] args) {
            myRFun3(3);
        }

    }
    public static class DirectRecursion {
      public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

        public static void main(String[] args) {
            countdown(5);
        }
    }

    public static class IndirectRecursion {
        public static void fun1() {
            System.out.println("fun1");
            fun2();
            System.out.println("After fun2");
        }

        public static void fun2() {
            System.out.println("fun2");
          //  fun1();
          //  System.out.println("After fun1");
        }


        public static void main(String[] args) {
            fun1();
        }
    }

    public static class TreeRecursion {
        public static int nthFibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return nthFibonacci(n - 1) + nthFibonacci(n - 2);
            }
        }

        public static void main(String[] args) {
            int result = nthFibonacci(4);
            System.out.println(result);
        }
    }

    public static class NestedRecursion {
    public static int nestedSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + nestedSum(nestedSum(n - 1));
        }
    }

    public static void main(String[] args) {
        int result = nestedSum(2);
        System.out.println(result);
    }
}

    public static class MutualRecursion {
        public static boolean isEven(int n) {
            if (n == 0) {
                return true;
            } else {
                return isOdd(n - 1);
            }
        }

        public static boolean isOdd(int n) {
            if (n == 0) {
                return false;
            } else {
                return isEven(n - 1);
            }
        }

        public static void main(String[] args) {
            System.out.println(isEven(6));
        }

        //ODD EVEN Direct Solution
        public static class OddEven {
                public static boolean isEven(int n) {
                    if (n == 0) {
                        return true; // Base case: 0 is an even number
                    } else if (n == 1) {
                        return false; // Base case: 1 is an odd number
                    } else {
                        return isEven(n - 2); // Recursive call with n-2
                    }
                }

                public static void main(String[] args) {
                    int number = 6;
                    if (isEven(number)) {
                        System.out.println(number + " is an even number.");
                    } else {
                        System.out.println(number + " is an odd number.");
                    }
                }
            }

    }


}

