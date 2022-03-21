import java.util.Objects;

public class Sight {

    private final String name;
    private final double time;
    private final int importance;


    public Sight(String name, double time, int importance) {
        this.name = name;
        this.time = time;
        this.importance = importance;
    }

    public String getName() {
        return name;
    }

    public double getTime() {
        return time;
    }

    public int getImportance() {
        return importance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Sight)) {
            return false;
        }
        Sight sight = (Sight) o;
        return Double.compare(sight.time, time) == 0 && importance == sight.importance && name.equals(sight.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, time, importance);
    }

    @Override
    public String toString() {
        return name + " (время= " + time + " важность= " + importance + ")";
    }
}
