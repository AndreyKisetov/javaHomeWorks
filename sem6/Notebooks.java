package sem6;

public class Notebooks {
    protected int ramSize;
    protected int hddSize;
    protected String operatingSystem;
    protected String color;

    public Notebooks(int ramSize, int hddSize, String operatingSystem, String color) {
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public boolean isSuitableForUse() {
        if ((ramSize >= 2048) && (hddSize >= 320))
            return true;
        else
            return false;
    }

    public String info() {
        return "Ноутбук:\n" +
                "  RAM: " + ramSize + " MB\n" +
                "  HDD: " + hddSize + " GB\n" +
                "  Операционная система: " + operatingSystem +
                "  Цвет: " + color +
                (isSuitableForUse() ? "  подходит для использования" : "  не подходит для использования");
    }
}
