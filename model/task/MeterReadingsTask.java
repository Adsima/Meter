package calculate.model.task;

public class MeterReadingsTask {
    private static Double coldWater;
    private static Double hotWater;
    private static Double electricity;

    public static Double getColdWater() {
        return coldWater;
    }

    public static void setColdWater(Double coldWater) {
        MeterReadingsTask.coldWater = coldWater;
    }

    public static Double getHotWater() {
        return hotWater;
    }

    public static void setHotWater(Double hotWater) {
        MeterReadingsTask.hotWater = hotWater;
    }

    public static Double getElectricity() {
        return electricity;
    }

    public static void setElectricity(Double electricity) {
        MeterReadingsTask.electricity = electricity;
    }
}
