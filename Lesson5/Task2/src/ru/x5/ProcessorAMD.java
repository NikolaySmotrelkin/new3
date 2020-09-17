package ru.x5;

public class ProcessorAMD extends Processor {

    public ProcessorAMD(int frequency, int coreCount, int cashRam, String description, String manufacturer) {
        super(frequency, coreCount, cashRam, description, manufacturer);
    }

    public String getAMDInfo() {
      return "Процессор AMD";
  }
}
