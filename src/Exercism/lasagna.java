package Exercism;

public class lasagna {

    static final int LASAGNA_COOKING_TIME=40;
    public int expectedMinutesInOven(){
        return LASAGNA_COOKING_TIME;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public  int remainingMinutesInOven(int lasagnaInOvenInMinutes){
        return expectedMinutesInOven()-lasagnaInOvenInMinutes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers){
        return numberOfLayers*2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int lasagnaInOvenInMinutes){
        return preparationTimeInMinutes(numberOfLayers)+lasagnaInOvenInMinutes;
    }

}
