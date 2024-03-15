package Exercism;

public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int result=0;
        if(numberOfDays>birdsPerDay.length){
            numberOfDays=birdsPerDay.length;
        }
        for(int i=0;i<numberOfDays;i++){
            result+=birdsPerDay[i];
        }
        return result;
    }

    public int getBusyDays() {
        int count=0;
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]>=5){
                count++;
            }
        }
        return count;
    }
}
