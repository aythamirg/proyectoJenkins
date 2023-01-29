package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiClaseTest {

    @Test
    void dia_laboralLunes() {

        MiClase clase = new MiClase();
        boolean result = clase.dia_laboral("Lunes");
        assertEquals(true, result);
    }

    @Test
    void dia_laboralMartes() {

        MiClase clase = new MiClase();
        boolean result = clase.dia_laboral("Martes");
        assertEquals(true, result);
    }

    @Test
    void dia_laboralMiercoles() {

        MiClase clase = new MiClase();
        boolean result = clase.dia_laboral("Miercoles");
        assertEquals(true, result);
    }

    @Test
    void dia_laboralJueves() {

        MiClase clase = new MiClase();
        boolean result = clase.dia_laboral("Jueves");
        assertEquals(true, result);
    }

    @Test
    void dia_laboralViernes() {

        MiClase clase = new MiClase();
        boolean result = clase.dia_laboral("Viernes");
        assertEquals(true, result);
    }

    @Test
    void dia_laboralSabado() {

        MiClase clase = new MiClase();
        boolean result = clase.dia_laboral("Sabado");
        assertEquals(false, result);
    }

    @Test
    void dia_laboralDomingo() {

        MiClase clase = new MiClase();
        boolean result = clase.dia_laboral("Domingo");
        assertEquals(false, result);
    }

    @Test
    void dia_laboralSinResultado() {

        MiClase clase = new MiClase();
        boolean result = clase.dia_laboral("");
        assertEquals(false, result);
    }
}