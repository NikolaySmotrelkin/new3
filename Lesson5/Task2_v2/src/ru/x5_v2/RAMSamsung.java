package ru.x5_v2;

// Реализация RAM Samsung
public class RAMSamsung extends  RAM {
    private boolean doubleDataRate;

    public RAMSamsung(String manufacturer, int size, int frequency, RamTypes ramType, boolean doubleDataRate) {
        super(manufacturer, size, frequency, ramType);
        this.doubleDataRate = doubleDataRate;
    }

    public boolean isDoubleDataRate() {
        return doubleDataRate;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += ", Технология Double-Data-Rate: ";
        str += (doubleDataRate) ? "поддерживает" : "не поддерживает";
        return str;
    }
}

