package com.windows.tiecode.ui.Adapter;

import com.windows.tiecode.ui.components.JImageVIew;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class FileItemAdapter extends JPanel implements ListCellRenderer<Object> {

    public FileItemAdapter(){
//        setOpaque(true);
//        setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
        setLayout(new SpringLayout());
        JImageVIew image = new JImageVIew();
        image.setSize(40,40);
        image.loadImage(Objects.requireNonNull(getClass().getClassLoader().getResource("icon.png")).getPath());
        image.updateImageSize(20,20);
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        add(image, BorderLayout.WEST);

        JLabel jLabel = new JLabel("测试");
        add(jLabel, BorderLayout.EAST);
    }

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        return this;
    }
}
