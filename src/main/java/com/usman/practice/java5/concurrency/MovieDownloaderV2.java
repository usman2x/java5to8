package com.usman.practice.java5.concurrency;

public class MovieDownloaderV2 extends Thread {
    private String movieName;
    private String movieResource;

    public MovieDownloaderV2(String movieName, String movieResource) {
        this.movieName = movieName;
        this.movieResource = movieResource;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Downloading Movie.." + this.toString());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "MovieDownloaderV2{" +
                "movieName='" + movieName + '\'' +
                ", movieResource='" + movieResource + '\'' +
                '}';
    }
}
