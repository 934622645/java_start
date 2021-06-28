import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestStart {
    private Start test;
    @BeforeEach
    void setUp() {
        test = new Start();
    }

    @Test
    @DisplayName("这是一个基本测试")
    void test1() {
        test.test();
    }
}