package ru.x5_v2;

public interface IHDDFactory {
    IHDD createIBM(String manufacturer, int size, HddTypes hddType, HddFormFactorTypes formFactor,
                     boolean doubleSpeed);
    IHDD createFujitsu(String manufacturer, int size, HddTypes hddType, HddFormFactorTypes formFactor) ;
}
