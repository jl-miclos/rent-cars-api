package br.gov.sp.fatec.domain.request;

import br.gov.sp.fatec.domain.enums.AluguelStatus;
import java.util.Date;

public record AluguelRequest(
        Date dataInicio, Date dataFim, double valor, AluguelStatus status, long carroId, long clienteId) {}
