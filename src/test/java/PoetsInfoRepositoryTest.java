import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class PoetsInfoRepositoryTest {

    @Test
    void junitTestExample(){
        assertNotEquals(1, 2);
    }

    @Test
    void mockitoTestExample() {
        PoetsInfoRepository thisRepo = Mockito.mock(PoetsInfoRepository.class);
        PoetsInfoRepository thatRepo = Mockito.mock(PoetsInfoRepository.class);

        assertNotEquals(thisRepo, thatRepo);
    }
}