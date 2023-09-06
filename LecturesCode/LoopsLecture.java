public class LoopsLecture {
    public static void main(String[] args) {
         int i=0, j =1,sum=0;
         while(i<=100){
             //System.out.println("while = "+i);
        //    // System.out.println((++count)+ " Sorry !!");
        //    // i+=2;
        if(i%2==0)
              sum+=i;
            i++;
         }
         System.out.println(sum);

        do{
            System.out.println("do = "+j);
            j++;
        }while(j<1);

        //increasing
        for(i=1; i<=100; i++){
            System.out.println(i);
        }

        //dcreasing
        for(i=5; i>=1; --i){
            int arr[] = {1,2,3,4};
            for(int val: arr)
            System.out.print(val);
            System.out.println();
        }

       // break & continue
        for(int a=1;a<10;a++){
           System.out.println(a);
           if(a==5) break; 
        }
       int b=100;
       for(b=1;b<5;b++){
       }
       System.out.println(b);
    }

}
