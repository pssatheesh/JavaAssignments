package Exercism;

public class Annalyn {
    public static boolean canFastAttack(boolean c) {
        return !c;
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {

        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return archerIsAwake==false && prisonerIsAwake==true;
    }
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        // return (petDogIsPresent)?(archerIsAwake)?false:true :((archerIsAwake||knightIsAwake)&&prisonerIsAwake )?true:false;

        if(petDogIsPresent){
            if(archerIsAwake){
                return false;
            }
            return true;
        }else{
            if(archerIsAwake||knightIsAwake ){
                return false;
            }
            else if(prisonerIsAwake)
                return true;

        }
        return false;
    }
    public static void main(String []s){

    }

}
