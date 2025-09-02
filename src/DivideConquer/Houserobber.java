package DivideConquer;

public class Houserobber {


    private int maxMoneyrobber(int [] housenetworth,int currentIndex){
        if (currentIndex>=housenetworth.length){
            return 0;

        }

        int stealcurrenthouse=housenetworth[currentIndex]+maxMoneyrobber(housenetworth,currentIndex+2);
        int skipcurrentHouse=maxMoneyrobber(housenetworth,currentIndex+1);

        return Math.max(stealcurrenthouse,skipcurrentHouse);
    }

    public int maxMoney(int[] houseworth ){
        return maxMoneyrobber(houseworth,0);
    }
}
