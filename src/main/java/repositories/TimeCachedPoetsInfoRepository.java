package repositories;

import api.PoetsInfoApiClient;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;

public class TimeCachedPoetsInfoRepository {

    private final PoetsInfoApiClient poetInfoApiClient;
    private final Map<String, String> cache;
    private final Duration cacheTimeToLive = Duration.ofMinutes(10);
    private Instant lastDownloadInstant = Instant.now();

    public TimeCachedPoetsInfoRepository(PoetsInfoApiClient poetInfoApiClient, Map<String, String> cache) {
        this.poetInfoApiClient = poetInfoApiClient;
        this.cache = cache;
    }

    public String yearOfBirth(String poet) {
        if (cacheContainsYearOfBirthOf(poet) && isCacheUpToDate()) {
            return cache.get(poet);
        }
        String yearOfBirth = poetInfoApiClient.yearOfBirth(poet);
        cache.put(poet, yearOfBirth);
        return yearOfBirth;
    }

    private boolean cacheContainsYearOfBirthOf(String poetName) {
        return cache.get(poetName) != null;
    }

    private boolean isCacheUpToDate() {
        return lastDownloadInstant.plus(cacheTimeToLive).isBefore(Instant.now());
    }
}
