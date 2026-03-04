package servicios;

import interfaces.InterfazEnviarEmails;
import modelo.Destinatario;
import org.slf4j.Logger;

public class EnviarEmails implements InterfazEnviarEmails {
    private Logger log;

    public EnviarEmails(Logger log) {
        this.log = log;
    }

    @Override
    public boolean enviarEmail(Destinatario dest, String email) {
        log.info("Enviando a" + dest.toString() + ": " + email);
        return true;
    }
}
