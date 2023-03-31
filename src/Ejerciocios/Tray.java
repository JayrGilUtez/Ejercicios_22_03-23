package Ejerciocios;

public class Tray {
    public Prize[] tray = new Prize[2];
    public String name;

    public Tray(Prize[] tray, String name) {
        this.tray = tray;
        this.name = name;
    }
    public Tray(){

    }

    public Prize[] getTray() {
        return tray;
    }

    public void setTray(Prize[] tray) {
        this.tray = tray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


