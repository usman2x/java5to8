package com.usman.practice.java5.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //There are two ways create thread
        //One is by implementing Runnable Interface
        //Other one is by extending Thread class.
        //V1
        MovieDownloaderV1 movieDownloaderV1 = new
                MovieDownloaderV1("Jawani Phir nahi ani", "http://jpna.com");
        Thread movieDownloaderV1Thread = new Thread(movieDownloaderV1);
//        movieDownloaderV1Thread.start();
//        movieDownloaderV1Thread.join();

        //V2
        Thread movieDownloaderV2 = new
                MovieDownloaderV2("Punjab nahi jaon gi", "http://pnjg.com");
//        movieDownloaderV2.start();
        MovieDownloaderV3 movieDownloaderV3 =
                new MovieDownloaderV3("Namaloom afrad", "http://nma.com");
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> totalTime = executorService.submit(movieDownloaderV3);
        System.out.println("Thread Total Time " + totalTime.get());
    }
}
