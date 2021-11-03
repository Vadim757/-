package ru.practice_10.ten_three;

public interface ICreateDocument{
    public TextDocument createNewText();

    public ImageDocument createNewImage();

    public MusicDocument createNewMusic();

    public String createOpenMusic(IDocument iDocument);

    public String createOpenText(IDocument iDocument);

    public String createOpenImage(IDocument iDocument);
}
