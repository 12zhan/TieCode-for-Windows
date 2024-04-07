package com.windows.tiecode.ui.components;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JImageVIew extends JPanel {
    private BufferedImage image;

    /**
     * Load Image's Function，file path to BufferedImage
     */
    public JImageVIew loadImage(String imagePath) {
        try {
            // 从文件加载图像
            File file = new File(imagePath);
            image = ImageIO.read(file);
        } catch (IOException e) {
            //错误抛出
            throw new RuntimeException(e);
        }

        return this;
    }


    // 加载网络图像方法
    public void loadOnlineImage(String imageUrl) {
        try {
            // 从 URL 加载图像
            URL url = new URL(imageUrl);
            image = ImageIO.read(url);
            updateImageSize(0,0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 重新调整图像大小方法
    private BufferedImage resizeImage(BufferedImage originalImage, int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(originalImage, 0, 0, width, height, null);
        g2d.dispose();
        return resizedImage;
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(width,height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // 绘制图像
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        }
    }

    // 更新图像大小方法
    public void updateImageSize(int imageWidth,int imageHeight) {
        if (image != null && imageWidth > 0 && imageHeight > 0) {
            image = resizeImage(image, imageWidth, imageHeight);
        }
    }
}
