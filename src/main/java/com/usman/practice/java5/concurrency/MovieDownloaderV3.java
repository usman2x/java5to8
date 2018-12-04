package com.usman.practice.java5.concurrency;

import java.util.concurrent.Callable;

public class MovieDownloaderV3 implements Callable<String> {
    private String movieName;
    private String movieResource;

    public MovieDownloaderV3(String movieName, String movieResource) {
        this.movieName = movieName;
        this.movieResource = movieResource;
    }

    @Override
    public String toString() {
        return "MovieDownloaderV3{" +
                "movieName='" + movieName + '\'' +
                ", movieResource='" + movieResource + '\'' +
                '}';
    }

    @Override
    public String call() throws Exception {
        String threadExecutionTime = "";
        try {
            Long startTime = System.currentTimeMillis();
            Thread.sleep(1500);
            System.out.println("Downloading Movie.." + this.toString());
            Thread.sleep(1000);
            Long endTime = System.currentTimeMillis() - startTime;
            threadExecutionTime = String.valueOf(endTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return threadExecutionTime;
    }

}
