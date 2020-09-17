package ru.x5;

public class Monitor {

    private Double diagonal;
    private String manufacturer;

    public Monitor(Double diagonal, String manufacturer) {
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        String str = "";
        str += " Диагональ (дюймов): " + Double.toString(diagonal) + ",";
        str += " Производитель: " + manufacturer;
        return str;
    }
}
