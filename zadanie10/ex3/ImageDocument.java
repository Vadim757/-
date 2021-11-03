package ru.practice_10.ten_three;

public class ImageDocument implements IDocument {
    private final String document;
    public ImageDocument(){
        this.document = "Image document[ (◕‿◕) ]";
    }
    public String infoDocument() {
        return document;
    }
}
