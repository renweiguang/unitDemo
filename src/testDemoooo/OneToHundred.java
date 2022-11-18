package testDemoooo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 1-->100 偶数之和
 */
public class OneToHundred
{
    public static void main(String[] args)
    {
        // Integer sum = 0;
        // for(int i=0;i<100;i++){
        // if(i%2==0){
        // sum=sum+i;
        // }
        // }
        // System.out.println(sum);

        long count = IntStream.rangeClosed(1, 50)
                .filter(r -> r % 2 == 0)
                .sum();

        System.out.println(count);

    }

}
