package Multithreading;

import java.io.File;
import java.util.Scanner;

public class DownloaderMain {
    public static void main(String[] args) {
        Downloader downloadFileURL = new Downloader();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Download File \n2.Stop Downloading \n3.ReDownload\n0.Exit\nEnter The Choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter The File  Download Link");
                    // sc.next();
                    String link = sc.next();
                    System.out.println("File Name With Extentions:");
                    String fname = sc.next();
                    File out = new File("C:/Users/Lucky Dell/Downloads" + fname);
                    downloadFileURL.setLink(link);
                    downloadFileURL.setOut(out);
                    downloadFileURL.start();
                    break;
                }
                case 2: {
                    downloadFileURL.setStopDownload(true);
                    System.out.println("Stopped....");
                    break;
                }
                case 3:{
                    downloadFileURL.start();
                    break;
                }
                case 0: {
                    System.exit(0);
                    return;
                }

                default:
                    System.out.println("Invalid Choice");

            }

        }
    }
}
