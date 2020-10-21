package ru.x5_v2;

// Общий кдасс HDD
public class HDD implements IHDD {
    private String manufacturer;
    private int size;
    private HddTypes hddType;
    private HddFormFactorTypes formFactor;

    public HDD(String manufacturer, int size, HddTypes hddType, HddFormFactorTypes formFactor) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.hddType = hddType;
        this.formFactor = formFactor;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public HddTypes getHddType() {
        return hddType;
    }

    public HddFormFactorTypes getFormFactor() {
        return formFactor;
    }

    @Override
    public String toString() {
        String str = "";
        str += " Размер (ГБ): " + Integer.toString(size) + ",";
        str += " Производитель: " + manufacturer + ",";

        switch (hddType) {
            case HDD:
                str += " Тип: HDD,";
                break;
            case SSD:
                str += " Тип: SSD,";
                break;
            default:
                str += " Тип: не определен,";
                break;
        }

        switch (formFactor) {
            case SIMM:
                str += " Форм-фактор: SIMM";
                break;
            case DIMM:
                str += " Форм-фактор: DIMM";
                break;
            case RIMM:
                str += " Форм-фактор: RIMM";
                break;
            default:
                str += " Форм-фактор: не определен ";
                break;
        }

        return str;
    }
}
