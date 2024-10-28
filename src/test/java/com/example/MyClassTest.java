package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class MyClassTest {

    MyClass myClass = new MyClass();

    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }
    @Test
    public void testPath1() {
        int[] value = {10, 20, 30, -999};
        int minimum = 5;
        int maximum = 50;
        int result = myClass.average(value, minimum, maximum);
        assertEquals(20, result, "Đường 1: Kiểm tra tính toán average khi các điều kiện đều thỏa mãn");
    }

    @Test
    public void testPath2() {
        int[] value = {1, 2, 3, -999};
        int minimum = 5;
        int maximum = 50;
        int result = myClass.average(value, minimum, maximum);
        assertEquals(-999, result, "Đường 2: Kiểm tra bỏ qua tính sum khi không có giá trị hợp lệ");
    }

    @Test
    public void testPath3() {
        int[] value = {-999};
        int minimum = 0;
        int maximum = 50;
        int result = myClass.average(value, minimum, maximum);
        assertEquals(-999, result, "Đường 3: Kiểm tra khi validNumber > 0 nhưng không có giá trị đầu vào mới");
    }

    @Test
    public void testPath4() {
        int[] value = {-999};
        int minimum = 0;
        int maximum = 50;
        int result = myClass.average(value, minimum, maximum);
        assertEquals(-999, result, "Đường 4: Kiểm tra khi validNumber <= 0 và không có giá trị hợp lệ");
    }
}
