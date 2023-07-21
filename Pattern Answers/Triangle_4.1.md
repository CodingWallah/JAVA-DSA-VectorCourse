## Triangle Pattern Solution Number 4.1 

\*               <br />
\* \*            <br />
\* \* \*         <br />
\* \* \* \*      <br />
\* \* \* \* \*   <br />
\* \* \* \*      <br />
\* \* \*         <br />
\* \*            <br />
\*               <br />

```java
   public static void main(String[] args) {

        // Please give 9 as input for above pattern.

        System.out.println("Enter any odd number greater than 1 to print Triangle : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 != 0 && num != 1){
        int mid=(num/2)+1;
        int row = 1;
        int secondHalfColumnPosition = mid-1;
        sc.close();
        while(row <= num){
            int column =1;
            if(row <= mid){
                while(column<=row){
                    System.out.print("* ");
                    column++;
                }
            }
            if(row > mid){
                while(column <= secondHalfColumnPosition){
                    System.out.print("* ");
                    column++;
                }
                secondHalfColumnPosition--;
            }
            System.out.println();
            row++;
        }
        }
        else{
            System.out.println("Please enter valid input");
        }
    }
```

<div align="right">

Contributed By <a href="https://github.com/rath23"> Muneer Ahmad</a>

</div>