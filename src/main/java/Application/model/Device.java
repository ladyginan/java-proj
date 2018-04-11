package Application.model;

public class Device {
    private final String mark;
    private final String Color;
    private final int year;
    private int deviceId;

    public Device(String mark, String color, int year) {
        this.mark = mark;

        this.Color = color;
        this.year = year;
        this.deviceId = deviceId++;
    }

    public int getId() {
        return deviceId;
    }


    public String getMark() {
        return mark;
    }


    public String getColor() {
        return Color;
    }

    public int getYear() {
        return year;
    }
}
