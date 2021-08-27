package com.company;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
public class Test {
public static void main(String[] args) throws Exception {
            Desktop desk = Desktop.getDesktop();
            for (int i = 0; i < 20; i++) {
                desk.browse(new URI("https://bit.ly/3yipBZf"));
                desk.browse(new URI("https://bit.ly/38dDFsa"));
                Thread.sleep(1000);
        }
    }
}