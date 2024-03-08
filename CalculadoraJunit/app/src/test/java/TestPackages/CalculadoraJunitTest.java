/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 * @author Carles Bernabeu Molió
 */
package TestPackages;

import CalculadoraJunit.CalculadoraJunit;
import org.junit.jupiter.api.*;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculadoraJunitTest {
    private CalculadoraJunit calculadora;
    private static LocalDateTime startTime;

    @BeforeEach
    public void setUp() {
        calculadora = new CalculadoraJunit();
        System.out.println("Creamos objeto Calculadora");
    }

    @AfterEach
    public void tearDown() {
        calculadora = null;
        System.out.println("Calculadora = null");
    }

    @BeforeAll
    public static void fechaInicio() {
        startTime = LocalDateTime.now();
        System.out.println("Inicio del conjunto de pruebas: " + startTime);
    }

    @AfterAll
    public static void fechaFinTiempo() {
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Fin del conjunto de pruebas: " + endTime);
        long duration = java.time.Duration.between(startTime, endTime).toMillis();
        System.out.println("Duración total del conjunto de pruebas: " + duration + " milisegundos");
    }

    @Test
    public void testSuma() {
        assertEquals(5, calculadora.suma(2, 3));
        System.out.println("Comprobamos suma");
    }

    @Test
    public void testResta() {
        assertEquals(-1, calculadora.resta(2, 3));
        System.out.println("Comprobamos resta");
    }

    @Test
    public void testMultiplica() {
        assertEquals(6, calculadora.multiplica(2, 3));
        System.out.println("Comprobamos multiplicación");
    }

    @Test
    public void testDivideix() {
        assertEquals(2, calculadora.divideix(6, 3));
        System.out.println("Comprobamos división");
    }

    @Test
    public void testMajorQue() {
        assertTrue(calculadora.majorQue(5, 3));
        assertFalse(calculadora.majorQue(3, 5));
        System.out.println("Comprobamos mayor");
    }

    @Test
    public void testRestablir() {
        calculadora.resta(2, 3);
        calculadora.restablecer();
        assertEquals(0, calculadora.getLastResult());
        assertEquals("Ninguna", calculadora.getLastOp());
        System.out.println("Restablecemos calculadora");
    }
}


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

