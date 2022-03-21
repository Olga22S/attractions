import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Sight> sights = new SightsRepository().getSights();
        List<Sight> visitList = new ArrayList<>();
        double allTime = 48 - (8 * 2);
        double spendTime = 0;
        int sightNums = 20;

        for (int i = sightNums; i >= 0; i--) {
            Sight sight = sights.get(i);
            if (sight.getTime() <= getAverageSightTime(sights)) {
                visitList.add(sight);
                sights.remove(i);
                if (spendTime + sight.getTime() > allTime) {
                    break;
                }
                spendTime += sight.getTime();
            }
        }
        visitList.forEach(System.out::println);
    }

    private static double getAverageSightTime(Map<Integer, Sight> sights) {
        double sum = sights.values().stream()
                .mapToDouble(Sight::getTime)
                .sum();
        return sum / sights.size();
    }
}
