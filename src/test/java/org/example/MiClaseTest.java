package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiClaseTest {

    @Test
    void dia_laboral() {

        assertEquals(true, MiClase.dia_laboral("Lunes"));
        assertEquals(true, MiClase.dia_laboral("Martes"));
        assertEquals(true, MiClase.dia_laboral("Miercoles"));
        assertEquals(true, MiClase.dia_laboral("Jueves"));
        assertEquals(true, MiClase.dia_laboral("Viernes"));
        assertEquals(false, MiClase.dia_laboral("Sabado"));
        assertEquals(false, MiClase.dia_laboral("Domingo"));
        assertEquals(false, MiClase.dia_laboral(""));


    }
}