package company.v2;

public class MaxValueFilter {



    public int filter(int[] values) {


        int maxValue = 0;

        for (int value : values) {

            if (maxValue < value) {

                maxValue = value;
            }
        }
        return maxValue;

    }



}