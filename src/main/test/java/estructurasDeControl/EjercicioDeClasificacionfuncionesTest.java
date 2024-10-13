package estructurasDeControl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EjercicioDeClasificacionfuncionesTest {

    @Test
    void testCalificacionA() {
        assertEquals("A", EjercicioDeClasificacionfunciones.obtenerCalificacion(95));
        assertEquals("A", EjercicioDeClasificacionfunciones.obtenerCalificacion(100));
        assertEquals("A", EjercicioDeClasificacionfunciones.obtenerCalificacion(90));
    }

    @Test
    void testCalificacionB() {
        assertEquals("B", EjercicioDeClasificacionfunciones.obtenerCalificacion(85));
        assertEquals("B", EjercicioDeClasificacionfunciones.obtenerCalificacion(89));
        assertEquals("B", EjercicioDeClasificacionfunciones.obtenerCalificacion(80));
    }

    @Test
    void testCalificacionC() {
        assertEquals("C", EjercicioDeClasificacionfunciones.obtenerCalificacion(75));
        assertEquals("C", EjercicioDeClasificacionfunciones.obtenerCalificacion(79));
        assertEquals("C", EjercicioDeClasificacionfunciones.obtenerCalificacion(70));
    }

    @Test
    void testCalificacionD() {
        assertEquals("D", EjercicioDeClasificacionfunciones.obtenerCalificacion(65));
        assertEquals("D", EjercicioDeClasificacionfunciones.obtenerCalificacion(69));
        assertEquals("D", EjercicioDeClasificacionfunciones.obtenerCalificacion(60));
    }

    @Test
    void testCalificacionF() {
        assertEquals("F", EjercicioDeClasificacionfunciones.obtenerCalificacion(50));
        assertEquals("F", EjercicioDeClasificacionfunciones.obtenerCalificacion(59));
        assertEquals("F", EjercicioDeClasificacionfunciones.obtenerCalificacion(0));
    }

    @Test
    void testNumeroFueraDeRango() {
        assertEquals("Número fuera del rango válido", EjercicioDeClasificacionfunciones.obtenerCalificacion(-5));
        assertEquals("Número fuera del rango válido", EjercicioDeClasificacionfunciones.obtenerCalificacion(105));
        assertEquals("Número fuera del rango válido", EjercicioDeClasificacionfunciones.obtenerCalificacion(101));
    }
}
