package ru.practice_10.ten_three;

public class TextDocument implements IDocument {
    private final String document;

    public TextDocument(){
        this.document = "Text document[ Hello World! ]";
    }

    public String infoDocument() {
        return document;

    }
}
