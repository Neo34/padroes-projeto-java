package subsistema1.crm;

import java.util.logging.Logger;

public class CrmService {

    private static Logger LoggerFactory;
    private static final Logger logger = LoggerFactory.getLogger(String.valueOf(CrmService.class));

    private CrmService() {
        // Construtor privado para evitar instância
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        // Simula gravação no CRM
        logger.info("Cliente salvo no sistema de CRM:");
        logger.info("Nome: {}");
        logger.info("CEP: {}");
        logger.info("Cidade: {}");
        logger.info("Estado: {}");
    }
}
