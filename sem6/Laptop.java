package sem6;

public class Laptop extends Notebooks {
    private int autonomousWorkDuration;

    public Laptop(int ramSize, int hddSize, String operatingSystem, String color, int autonomousWorkDuration) {
        super(ramSize, hddSize, operatingSystem, color);
        this.autonomousWorkDuration = autonomousWorkDuration;
    }

    @Override
    public boolean isSuitableForUse() {
        return (super.isSuitableForUse() && (autonomousWorkDuration >= 60));
    }

    @Override
    public String info() {
        return "Ноутбук:\n" +
                "  RAM: " + ramSize + " MB\n" +
                "  HDD: " + hddSize + " GB\n" +
                "  Операционная система: " + operatingSystem +
                "  Цвет: " + color +
                "  Продолжительность автономной работы: " + autonomousWorkDuration + " min\n" +
                (isSuitableForUse() ? "  подходит для использования" : "  не подходит для использования");
    }
}
