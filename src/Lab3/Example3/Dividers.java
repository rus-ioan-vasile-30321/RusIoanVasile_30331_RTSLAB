package Lab3.Example3;

import java.util.ArrayList;
import java.util.List;

public class Dividers implements Runnable{
    private static int sum;
    private int n;
    private int[] dividersList;
    Dividers(int n){
        this.n=n;
    }

    public void run(){
        while (true){
            if(n>50000) {
                dividersList = dividers(n);
            }

            try{
                Thread.sleep(1000);
            }catch(Exception e){e.printStackTrace();}
        }
    }

    public int[] dividers(int n) {
        List<Integer> dividersList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dividersList.add(i);
            }
        }

        // Convert ArrayList to array
        int[] dividersArray = new int[dividersList.size()];
        for (int i = 0; i < dividersList.size(); i++) {
            dividersArray[i] = dividersList.get(i);
        }

        return dividersArray;
    }


}
