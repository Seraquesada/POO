package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws PacienteExecption {

        try {
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(2022,5,10));
            paciente.darAlta(new Date(2021,5,11));
        } catch (PacienteExecption e){
            System.err.println(e);
        }

    }
}
