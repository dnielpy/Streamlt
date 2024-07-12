package com.example.demo;

public class VideoFile {
    private String encodedPath;
    private String fileName;

    public VideoFile(String encodedPath, String fileName) {
        this.encodedPath = encodedPath;
        this.fileName = fileName;
    }

    public String getEncodedPath() {
        return encodedPath;
    }

    public String getFileName() {
        return fileName;
    }
}