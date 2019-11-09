package sample;

import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Image {
    private int iD;
    private String Name;
    private String url;

    public Image() {
    }

    public Image(int iD, String name, String url) {
        this.iD = iD;
        Name = name;
        this.url = url;
    }

    public void openFile() {
        try {
            Desktop.getDesktop().open(new File(url));
        } catch (Exception e) {}
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
