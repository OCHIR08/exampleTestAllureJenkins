import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {

    @Test
    @Description("Тест,  который всегда проходит (passed)")
    void testPassed() {
        assertTrue(true);
    }

    @Test
    @Description("Тест, который всегда падает (failed)")
    void testFailed() {
//        assertTrue(true, "Этот тест должен упасть");
    }

//    @Test
//    @Description("Тест со статусом skipped (declined)")
//    void testSkipped() {
//        // Пропуск через Assumptions
//        org.junit.jupiter.api.Assumptions.assumeTrue(false, "Этот тест будет пропущен");
//    }
}
