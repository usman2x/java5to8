package com.usman.practice.java5.concurrency;

public class MovieDownloaderV1 implements Runnable {
    private String movieName;
    private String movieResource;

    public MovieDownloaderV1(String movieName, String movieResource) {
        this.movieName = movieName;
        this.movieResource = movieResource;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Downloading Movie.." + this.toString());
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "MovieDownloaderV1{" +
                "movieName='" + movieName + '\'' +
                ", movieResource='" + movieResource + '\'' +
                '}';
    }
}
