package ru.x5_v2;

// Абстракция фабрики RAM
public interface IRAMFactory {
  IRAM  createSamsung(String manufacturer, int size, int frequency, RamTypes ramType, boolean doubleDataRate);
  IRAM  createKingston(String manufacturer, int size, int frequency, RamTypes ramType);
}
