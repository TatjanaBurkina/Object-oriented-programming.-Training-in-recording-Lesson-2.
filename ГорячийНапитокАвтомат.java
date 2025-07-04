// Интерфейс ТорговыйАвтомат
interface ТорговыйАвтомат {
    ГорячийНапитокСТемпературой getProduct(String name, int volume, int temperature);
}

// Класс автомата, реализующий интерфейс
public class ГорячийНапитокАвтомат implements ТорговыйАвтомат {
    @Override
    public ГорячийНапитокСТемпературой getProduct(String name, int volume, int temperature) {
        return new ГорячийНапитокСТемпературой(name, volume, temperature);
    }

    public static void main(String[] args) {
        // Создание автомата
        ГорячийНапитокАвтомат автомат = new ГорячийНапитокАвтомат();

        // Запрос напитков 
        ГорячийНапитокСТемпературой кофе = автомат.getProduct("Кофе", 250, 80);
        ГорячийНапитокСТемпературой чай = автомат.getProduct("Чай", 200, 70);

        // Вывод информации
        System.out.println(кофе);
        System.out.println(чай);
    }
}
