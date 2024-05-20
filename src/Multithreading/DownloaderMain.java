package Multithreading;

import java.io.File;
import java.util.Scanner;

/* Simple Producer-Consumer (Thread Communication):
Create two threads: a producer and a consumer.
The producer adds items to a shared buffer (e.g., an array).
The consumer removes items from the buffer and processes them.
Implement synchronization (e.g., wait-notify) to ensure the consumer doesn't access empty buffers and the producer doesn't overflow.*/


public class DownloaderMain {
    public static void main(String[] args) {
        String url = "https://i0.wp.com/picjumbo.com/wp-content/uploads/beautiful-nature-mountain-scenery-with-flowers-free-photo.jpg?w=600&quality=80";
        String destinationPath = "C:/Users/Lucky Dell/Desktop";

        Downloader downloader = new Downloader(url, destinationPath);
        downloader.start();

        try {
            Thread.sleep(500);
            downloader.stopDownload();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
