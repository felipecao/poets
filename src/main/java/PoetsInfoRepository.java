import java.util.HashMap;
import java.util.Map;

public class PoetsInfoRepository {

    private final PoetsInfoClient poetInfoClient = new PoetsInfoClient();
    private final Map<String, String> cache = new HashMap<>();

    public String yearOfBirth(String poetName) {
        if (cache.get(poetName) != null) {
            return cache.get(poetName);
        }
        String yearOfBirth = poetInfoClient.yearOfBirth(poetName);
        cache.put(poetName, yearOfBirth);
        return yearOfBirth;
    }
}
