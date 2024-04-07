package com.windows.tiecode.ui.components.FileSelectDialog;


import javax.swing.*;
import java.awt.*;

public class FileSelectDialog extends JDialog {

    public static int SELECT_FILE = 0;
    public static int SELECT_DIR = 1;


    private String title = "TieCode File Selection";

    public FileSelectDialog() {
        setSize(new Dimension(600,400));
        setLocationRelativeTo(null); //居中
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("icon.png")));
        setTitle(title);

        //根布局
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setSize(-1,-1);






//        //功能栏
//        JPanel toolTabPanel = new JPanel();
//        toolTabPanel.setLayout(new BorderLayout());
//        toolTabPanel.setPreferredSize(new Dimension(-1,30));
//        toolTabPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,10));
//
//        JLabel openPathLabel = new JLabel("<html><a href='#' style='color:#f44236'>\"Open File Path\"</a></html>");
//        openPathLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        openPathLabel.setSize(-2,-2);
//        openPathLabel.setFont(new Font(null, Font.PLAIN, 12));
//        openPathLabel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if (e.getButton() == MouseEvent.BUTTON1) {
//                    System.out.println("open path");
//                }
//            }
//        });
//        toolTabPanel.add(openPathLabel,BorderLayout.EAST);
//
//        //文件区域
//        // 创建一个包含列表项的数组
//        String[] data = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
//
//        // 创建 JList 实例，并传入数据数组
//        JList<String> list = new JList<>(data);
//        list.setCellRenderer(new FileItemAdapter());
//        JScrollPane FileSelectPanel = new JScrollPane(list);
//        FileSelectPanel.setSize(-1,-2);
//        FileSelectPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
//
//        panel.add(toolTabPanel,BorderLayout.NORTH);
//        panel.add(FileSelectPanel,BorderLayout.CENTER);

        add(panel,BorderLayout.NORTH);

    }

    /**
     *
     * @param title the title displayed in the dialog's border;
     * a null value results in an empty title
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
