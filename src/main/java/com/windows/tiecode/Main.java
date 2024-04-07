package com.windows.tiecode;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.windows.tiecode.ui.components.FileSelectDialog.FileSelectDialog;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FlatMacLightLaf.setup();
        try {
            UIManager.setLookAndFeel( new FlatMacLightLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        new FileSelectDialog().show();
    }
}