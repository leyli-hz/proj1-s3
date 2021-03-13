import org.apache.log4j.Logger;

import java.util.Scanner;
//second way
public class SecondWay {
    private  static Scanner out = new Scanner(System.in);
    private  static Logger logger = Logger.getLogger(SecondWay.class);
    public static void main(String[] args) {
        short arrlength = 0;
        boolean flag = true;
        Validation validation = new Validation();
        System.out.println("please enter a number betwean 1-1000 :");
        do {
            arrlength = out.nextShort();
            logger.debug("check the length of array");
            flag = validation.checkLength(arrlength);
        } while (!flag);

        int[] array = new int[arrlength];
        System.out.println("please enter " + arrlength + " number as the price of each day : ");
        logger.debug("fill the array and check the values");
        SecondWay scw= new SecondWay();
        array=scw.fillArray(array);

        logger.debug("calculate the maximum profit");
        System.out.println("maximum profit : "+ scw.maxProfit(array));
    }

    public int[] fillArray(int[] arr) {
        Validation va= new Validation();
        int newValue = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            do {
                newValue = out.nextInt();
                flag = va.checkValues(newValue);
            } while (!flag);
            arr[i] = newValue;
        }
        return arr;
    }

    public int maxProfit(int[] array) {
        int min_cost = Integer.MAX_VALUE;
        int max_profit = 0;
        int profit = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min_cost)
                min_cost = array[i];

            profit = array[i] - min_cost;

            if (max_profit < profit)
                max_profit = profit;
        }
        return max_profit;
    }
}
