/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tp.tplm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author A S U S
 */
public class SimpleClassTest {
    @Test
    public void testPenjumlahan() {
        assertEquals(9, penjumlahan(2, 3));
        assertEquals(0, penjumlahan(0, 0));
        assertEquals(-1, penjumlahan(-2, 1));
    }

    @Test
    public void testPengurangan() {
        assertEquals(1, pengurangan(3, 2));
        assertEquals(0, pengurangan(0, 0));
        assertEquals(-3, pengurangan(-2, 1));
    }

    @Test
    public void testPerkalian() {
        assertEquals(6, perkalian(2, 3));
        assertEquals(0, perkalian(0, 5));
        assertEquals(-2, perkalian(-1, 2));
    }

    @Test
    public void testPembagian() {
        assertEquals(2.0, pembagian(6, 3), 0.001);
        assertEquals(0.0, pembagian(0, 5), 0.001);
        assertEquals(-2.0, pembagian(-4, 2), 0.001);
        // test pembagian oleh nol
        assertThrows(ArithmeticException.class, () -> pembagian(1, 0));
    }

    // Metode yang diuji
    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    public static int pengurangan(int a, int b) {
        return a - b;
    }

    public static int perkalian(int a, int b) {
        return a * b;
    }

    public static double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }
    
    
    
}
