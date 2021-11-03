package ru.practice_10.ten_three;

public class Client implements ICreateDocument {
    public TextDocument createNewText() {
        return new TextDocument();
    }

    public ImageDocument createNewImage() {
        return new ImageDocument();
    }

    public MusicDocument createNewMusic() {
        return new MusicDocument();
    }

    public String createOpenMusic(IDocument iDocument) {
        return iDocument.infoDocument();
    }


    public String createOpenImage(IDocument iDocument) {
        return iDocument.infoDocument();
    }

    public String createOpenText(IDocument iDocument) {
        return iDocument.infoDocument();
    }
}
