import org.apache.log4j.Logger;

import java.util.Scanner;
//first way
public class FirstWay {
    private static Scanner out = new Scanner(System.in);
    private static Logger logger = Logger.getLogger(FirstWay.class);

    public static void main(String[] args) {
        short arrlength = 0;
        boolean flag = true;
        FirstWay firstWay = new FirstWay();
        Validation va = new Validation();
        System.out.println("please enter a number betwean 1-1000 :");
        do {
            arrlength = out.nextShort();
            logger.debug("check the length of array");
            flag = va.checkLength(arrlength);
        } while (!flag);
        int[] array = new int[arrlength];
        System.out.println("please enter " + arrlength + " number as the price of each day : ");
        logger.debug("fill the array and check the values");
        array = firstWay.fillArray(array);
        logger.debug("calculate the maximum profit");
        System.out.println("maximum profit : "+firstWay.maxProfit(array));
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
        int maxSood = 0;
        int sood = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    sood = array[j] - array[i];
                    if (sood > maxSood)
                        maxSood = sood;
                }
            }
        }
        return maxSood;
    }
}
