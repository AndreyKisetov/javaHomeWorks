package sem6;

public class Main {
    /**
     * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
     * методы. Реализовать в java.
     * Создать множество ноутбуков.
     * Написать метод, который будет запрашивать у пользователя критерий (или
     * критерии) фильтрации и выведет ноутбуки,
     * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
     * “Введите цифру, соответствующую необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объем HHD или SSD
     * 3 - Операционная система
     * 4 - Цвет …
     * Далее нужно запросить минимальные значения для указанных критериев -
     * сохранить параметры фильтрации можно также в Map.
     * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
     * условиям.
     */
    public static void main(String[] args) {
        Laptop macbook = new Laptop(4096, 1024, "MacOS", "Золотистый", 640);
        Laptop acer = new Laptop(1024, 256, "Windows", "Белый", 240);
        Laptop asus = new Laptop(4096, 512, "Windows", "Чёрный", 300);

        System.out.println(macbook.info());
        System.out.println(acer.info());
        System.out.println(asus.info());
    }
}
