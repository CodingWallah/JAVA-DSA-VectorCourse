
## Square Pattern Solution Number 1.3

A B C D E  <br />
A B C D E  <br />
A B C D E  <br />
A B C D E  <br />

```java
    public static void main(String args[]) {
      for(int row = 1 ; row <=5 ;row++ ){
          char letter = 'A';
            for (int column = 0;column<4 ; column++){
                System.out.print( (char)(letter+column) +" ");
            }
            System.out.print("\n");
        }

    }
```

<div align="right">

Contributed By <a href="https://github.com/rath23"> Muneer Ahmad</a>

</div>