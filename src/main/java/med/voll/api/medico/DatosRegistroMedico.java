package med.voll.api.medico;

import med.voll.api.DatosDireccion;

public record DatosRegistroMedico(
        String nombre,
        String email,
        String docummento,
        Especialidad especialidad,
        DatosDireccion direccion
) {}
