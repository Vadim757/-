package ru.practice_10.ten_three;

import javax.swing.*;
import java.util.Objects;

public class GUI extends JFrame {
    String last;
    TextDocument text_1;
    ImageDocument image_1;
    MusicDocument music_1;
    public GUI() {
        super("Files");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menu = new JMenuBar();
        menu.add(FileMenu());
        setJMenuBar(menu);
        setSize(500,500);
        setVisible(true);
    }
    public JMenu FileMenu(){
        JMenu file = new JMenu("File");
        JMenu file_new = new JMenu("New");
        JMenuItem file_open = new JMenuItem("Open");
        JMenuItem file_save = new JMenuItem("Save");
        JMenuItem file_exit = new JMenuItem("Exit");
        JMenuItem text_doc = new JMenuItem("TextDocument");
        JMenuItem image_doc = new JMenuItem("ImageDocument");
        JMenuItem music_doc = new JMenuItem("MusicDocument");
        file.add(file_new);
        file.add(file_open);
        file.add(file_save);
        file.add(file_exit);
        file_new.add(text_doc);
        file_new.add(image_doc);
        file_new.add(music_doc);
        Client client = new Client();
        JTextArea console = new JTextArea(100, 0);
        JScrollPane scrollPane = new JScrollPane(console);
        add(scrollPane);
        text_doc.addActionListener(e -> {
            last = "text";
            text_1 = client.createNewText();
            console.append("Текстовый документ создан\n");
        });
        image_doc.addActionListener(e -> {
            last = "image";
            image_1 = client.createNewImage();
            console.append("Картинка создана\n");
        });
        music_doc.addActionListener(e -> {
            last = "music";
            music_1 = client.createNewMusic();
            console.append("Аудио файл создан\n");
        });
        file_open.addActionListener(e -> {
            console.append("Открыт файл\n");
            if (Objects.equals(last, "text")) {
                console.append(client.createOpenText(text_1) + "\n");
            }
            else if (Objects.equals(last, "image")) {
                console.append(client.createOpenImage(image_1) + "\n");
            }
            else if (Objects.equals(last, "music")) {
                console.append(client.createOpenMusic(music_1) + "\n");
            }
        });
        file_save.addActionListener(e -> {
            console.append("Файл сохранён\n");
        });
        file_exit.addActionListener(e -> {
            console.append("Файл закрыт\n");
        });

        return file;
    }
}
