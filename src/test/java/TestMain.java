import org.example.ArraysWork;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    void addition() {
        int[] t = new int[]{1, -9, -1, 78, 300};
        assertEquals(ArraysWork.minValue(t), -9);
        assertEquals(ArraysWork.minValue(new int[] {-77,12, 99, 300, -99, 127}), -99);
    }
}
