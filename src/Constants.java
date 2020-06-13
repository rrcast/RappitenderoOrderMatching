import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Constants {
    public static final Map<Integer, List<Integer>> TAGITERATION = new HashMap<Integer, List<Integer>>();

    static {
        TAGITERATION.put(0, Arrays.asList(4));
        TAGITERATION.put(5, Arrays.asList(4, 3));
        TAGITERATION.put(10, Arrays.asList(4, 3, 2));
        TAGITERATION.put(15, Arrays.asList(4, 3, 2, 1));
    }
}