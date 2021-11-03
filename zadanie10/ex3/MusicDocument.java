package ru.practice_10.ten_three;

public class MusicDocument implements IDocument {
    private final String document;

    public MusicDocument(){
        this.document = "Music document[ It's the final countdown!... ]";
    }

    public String infoDocument() {

        return document;
    }
}
