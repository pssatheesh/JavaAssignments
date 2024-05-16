package StackAssignment;

/*Simulate a Music Player Playlist. Create a chain of songs in LinkedList. The Head points to the current song. Add a provision to add, remove songs anywhere in the playlist.*/

import java.util.LinkedList;
import java.util.Scanner;

public class PlayListLL {
    private static Scanner sc;
    private static LinkedList<String> playlist=new LinkedList<>();

    public static void main(String[] args) {
        sc=new Scanner(System.in);
        playlist.add("Nee Kavithagala");
        playlist.add("Munbe vaa");

        while(true){
            for(String song:playlist){
                System.out.println(song);
            }
            System.out.println("\nWelcome to player\n1.Add song in the list\n2.Remove song");
            System.out.println("Enter the choice:");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    addSong();
                    break;
                case 2:
                    deleteSong();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }

    private static void deleteSong() {
        System.out.println("Enter the song name");
        sc.nextLine();
        String song=sc.nextLine();
        playlist.remove(song);
    }

    private static void addSong() {
        System.out.println("Enter the song name");
        sc.nextLine();
        String song=sc.nextLine();
        playlist.add(song);
    }

}
