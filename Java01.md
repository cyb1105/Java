### ex1)

```java
public class Example2 {
    public static void main(String[] args){        
		int a = 1;
        int b = 2;
        int c = a++ + ++b; //
        System.out.println(a +","+ a++ + ","+ ++b + "," + c); // 2, 2, 4, 4

        a = 1;
        for(int i = 0; i<10; i++ ){
            a++;
            System.out.println(a + "=" + i);

            String name = "java";
            List list1 = new ArrayList();
            Collection list2 = new ArrayList();

            System.out.println(list1 instanceof List);
            System.out.println(list1 instanceof Collection);

            System.out.println(name instanceof String);
            System.out.println(name instanceof Object);
        }
    }
}
```

### ex2)

```java
package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example2 {
    public static void main(String[] args){
            long startTime = System.currentTimeMillis();
            String str = "A";
            for(int i=0; i<100_000; i++){
                str += "A";
            }
            long endTime = System.currentTimeMillis();
        System.out.print("Elapsed time:"+(endTime-startTime));


        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("A");
        for(int i=0; i<100_000; i++){
            str += "A";
        }
        endTime = System.currentTimeMillis();
        System.out.println("\n(StringBuilder)Elapsed time:"+(endTime-startTime));

        }
    }

```

