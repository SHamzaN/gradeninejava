package ghar.javawork.virtual.unit1.part3;
public class Baseball{
    public static void main(String[] args){
        int hits = 27;
        int atBats = 80;
        double battingAvg = 0;
        int roundedAvg = 0;



        battingAvg = (double) hits / atBats;
        battingAvg = battingAvg + 0.0005;
        battingAvg = battingAvg * 1000;
        roundedAvg = (int) battingAvg;


        System.out.println("Hits = " + hits + "");
        System.out.println("At Bats = " + atBats + "");
        System.out.println("-------------------------");
        System.out.println("Batting Average = " + roundedAvg + "");

    }
}