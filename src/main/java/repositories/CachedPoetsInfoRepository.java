package repositories;

import api.PoetsInfoApiClient;

import java.util.HashMap;
import java.util.Map;

public class CachedPoetsInfoRepository {

    private final PoetsInfoApiClient poetInfoApiClient = new PoetsInfoApiClient();
    private final Map<String, String> cache = new HashMap<>();

    public String yearOfBirth(String poet) {
        if (cacheContainsYearOfBirthOf(poet)) {
            return cache.get(poet);
        }
        String yearOfBirth = poetInfoApiClient.yearOfBirth(poet);
        cache.put(poet, yearOfBirth);
        return yearOfBirth;
    }

    private boolean cacheContainsYearOfBirthOf(String poetName) {
        return cache.get(poetName) != null;
    }
}
