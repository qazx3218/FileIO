package edu.handong.csee.java.example.fileread.benchmark;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Usage: java UsingBufferedReader <file path>");
            return;
        }

        String filePath = args[0];

        StopWatch.start();

        BufferedReader inputStream = new BufferedReader(new FileReader(filePath));
        while (inputStream.read() != -1) {}

        long duration = StopWatch.stop();
        System.out.println("Reading " + filePath + ": " + duration + " milsec");

        inputStream.close();
    }
}