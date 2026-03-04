package servicios;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ContactoSim implements InterfazContactoSim {
    private DatosSolicitud ds;


    @Override
    public int solicitarSimulation(DatosSolicitud sol) {
        ds = sol;
        return new Random().nextInt();
    }

    @Override
    public DatosSimulation descargarDatos(int ticket) {
        return null;
    }

    @Override
    public List<Entidad> getEntities() {
        List<Entidad> lista = new ArrayList<>();
        for(int u = 0; u < 10; u++){
            Entidad e =  new Entidad();
            e.setName("entidad" + u);
            lista.add(e);
        }
        return lista;
    }

    @Override
    public boolean isValidEntityId() {
        return false;
    }
}
