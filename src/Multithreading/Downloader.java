package Multithreading;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Downloader extends Thread {
    String link;// =
    // "https://images.unsplash.com/photo-1714212494809-555606435baa?ixlib=rb-4.0.3&q=85&fm=jpg&crop=entropy&cs=srgb&dl=kateryna-hliznitsova-Fob9TUUdzZ0-unsplash.jpg";
    File out;// = new
    // File("/home/zs-gsch04/Downloads/ssssssssssssssssssssssssssssssssss.png");
    boolean stopDownload;

    public Downloader() {
        // TODO Auto-generated constructor stub
    }

    public Downloader(String link, File out) {
        this.link = link;
        this.out = out;

    }

    @Override
    public void run() {
        try {
            URL url = new URL(link);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();

            double fileSize = (double) http.getContentLength();
            BufferedInputStream bis = new BufferedInputStream(http.getInputStream());

            FileOutputStream fos = new FileOutputStream(this.out);
            BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
            byte[] buffer = new byte[1024];
            double downloaded = 0.00;
            int read = 0;

            double percentDownloaded = 0.00;
            while ((read = bis.read(buffer, 0, 1024)) >= 0 && !isStopDownload()) {
                bos.write(buffer, 0, read);
                downloaded += read;
                percentDownloaded = (downloaded * 100 / fileSize);
                String percent = String.format("%4f", percentDownloaded);
                System.out.print("\rDownload " + percent + "% of a file.");
            }
            System.out.println();

            if (stopDownload) {
                fos.close();
                out.delete();
            }
            bos.close();
            bis.close();
            if (!stopDownload) {

                System.out.println("Download Completed...");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getLink() {
        return link;
    }

    public File getOut() {
        return out;
    }

    public boolean isStopDownload() {
        return stopDownload;
    }

    public void setStopDownload(boolean stopDownload) {
        this.stopDownload = stopDownload;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setOut(File out) {
        this.out = out;
    }
}

