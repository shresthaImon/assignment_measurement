package models;

public class Measurement {
    public Integer value;

    public Measurement(Integer value) {
        this.value = value;
    }

    public int getcm() {
        return value * 100;
    }

    public int getkm() {
        return value / 100;
    }

    public int getmn() {
        return value * 100;
    }

    public int getdm() {
        return value * 10;
    }

}
