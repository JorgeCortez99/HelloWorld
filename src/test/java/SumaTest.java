import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sumarTest() {
        int a = 1;
        int b = 2;
        Suma s = new Suma();


        Assertions.assertEquals(3,s.sumar(a,b));

    }
}