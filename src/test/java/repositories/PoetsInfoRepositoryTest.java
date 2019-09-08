package repositories;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import repositories.CachedPoetsInfoRepository;

import static org.junit.jupiter.api.Assertions.*;

class PoetsInfoRepositoryTest {

    @Test
    void junitTestExample(){
        assertNotEquals(1, 2);
    }

    @Test
    void mockitoTestExample() {
        CachedPoetsInfoRepository thisRepo = Mockito.mock(CachedPoetsInfoRepository.class);
        CachedPoetsInfoRepository thatRepo = Mockito.mock(CachedPoetsInfoRepository.class);

        assertNotEquals(thisRepo, thatRepo);
    }
}