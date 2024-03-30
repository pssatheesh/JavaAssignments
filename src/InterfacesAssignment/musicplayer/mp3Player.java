package InterfacesAssignment.musicplayer;

import java.util.Scanner;

public class mp3Player implements Playable{
    @Override
    public void controls() {
        Scanner scanner=new Scanner(System.in);
        boolean pl=true;
        boolean pa=false;
        boolean st=false;
        while(true) {
            System.out.println("\nEnter your choice \n1.Play\n2.Pause\n3.Stop\n4.Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    if(pl){
                        play();
                        pl=false;
                        pa=true;
                        st=true;
                    }
                    else{
                        System.out.println("Already played");
                    }
                    break;
                case 2:
                    if(pa){
                        pause();
                        pa=false;
                    }else{
                        System.out.println("Music is not started");
                    }
                    break;
                case 3:
                    if(st){
                        stop();
                        st=false;
                        pl=true;
                        pa=false;
                    }else
                        System.out.println("Already stopped");
                    break;
                case 4:
                    Mainclass.main(null);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public void play() {
        System.out.println("Mp3 Player is start to play");
    }
    public void pause() {
        System.out.println("Mp3 Player is pause the song");
    }

    public void stop() {
        System.out.println("Mp3 Player is stopped");
    }
}
