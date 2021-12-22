package com.example.trabajorecu;

public class PDFUpload {
    public String name;
    public String url;

    public PDFUpload() {
    }

    public PDFUpload(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

