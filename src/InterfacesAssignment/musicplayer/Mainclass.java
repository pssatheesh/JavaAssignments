package InterfacesAssignment.musicplayer;

import java.util.Scanner;


/*Define an interface named Playable with methods like play() , pause() , and stop() . Implement this interface in classes representing different types of music players such as MP3Player , CDPlayer , and StreamingPlayer . Allow the user to control the playback of these players through the implemented interface.
 */


public class Mainclass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while(true)
        {
            System.out.println("\nEnter your choice \n1.mp3Player\n2.CDPlayer\n3.Streaming Player\n4.Exit");
            System.out.println("Enter your choice");
            int choice=scanner.nextInt();
            switch(choice){
                case 1:
                    Playable mp3=new mp3Player();
                    mp3.controls();
                    break;
                case 2:
                    Playable cd=new cdPlayer();
                    cd.controls();
                    break;
                case 3:
                    Playable sp=new StreamingPlayer();
                    sp.controls();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
    }
}
