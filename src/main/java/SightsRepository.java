import java.util.HashMap;
import java.util.Map;

public class SightsRepository {

    private final Map<Integer, Sight> sights = new HashMap<>();

    public Map<Integer, Sight> getSights() {
        sights.put(1, new Sight("Всероссийский музей А.С. Пушкина и филиалы", 6, 1));
        sights.put(2, new Sight("Литературно-мемориальный музей Ф.М. Достоевского", 4, 2));
        sights.put(3, new Sight("Казанский собор", 4, 3));
        sights.put(4, new Sight("Кунсткамера", 3.5, 4));
        sights.put(5, new Sight("Екатерининский дворец", 1.5, 5));
        sights.put(6, new Sight("Зоологический музей", 5.5, 6));
        sights.put(7, new Sight("Петропавловская крепость", 10, 7));
        sights.put(8, new Sight("Русский музей", 5, 8));
        sights.put(9, new Sight("Спас на Крови", 2, 9));
        sights.put(10, new Sight("Исаакиевский собор", 5, 10));
        sights.put(11, new Sight("Эрмитаж", 8, 11));
        sights.put(12, new Sight("Зимний дворец Петра", 7, 12));
        sights.put(13, new Sight("Музей восковых фигур", 2, 13));
        sights.put(14, new Sight("Петербургский музей кукол", 1, 14));
        sights.put(15, new Sight("Ленинградский зоопарк", 9, 15));
        sights.put(16, new Sight("Музей современного искусства Эрарта", 7, 16));
        sights.put(17, new Sight("Медный всадник", 1, 17));
        sights.put(18, new Sight("Музей микроминиатюры Русский Левша", 3, 18));
        sights.put(19, new Sight("Музей обороны и блокады Ленинграда", 2, 19));
        sights.put(20, new Sight("Навестить друзей", 12, 20));
        return sights;
    }
}
