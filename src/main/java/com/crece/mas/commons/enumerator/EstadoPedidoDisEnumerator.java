package com.crece.mas.commons.enumerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import com.crece.mas.commons.exception.CreceMasNotFoundException;

public enum EstadoPedidoDisEnumerator implements IGenericEnumerator<Integer> {

	SOLICITADO(1, "solicitado", true, Collections.emptyList()),
	ANULADO(2, "anulado", true, Collections.singletonList(SOLICITADO)),
	ACEPTADO(3, "aceptado", true, Collections.singletonList(SOLICITADO)),
    //TODO: Evaluate if legacy status will be used
	PARCIALMENTE_ACEPTADO(4, "parcialmente-aceptado", false, Collections.singletonList(SOLICITADO)),
	EN_PROCESO(5, "en-proceso", false, Collections.singletonList(SOLICITADO)),
	ENVIADO(6, "enviado", false, Collections.singletonList(SOLICITADO)),
	DESPACHADO(7, "despachado", false, Collections.singletonList(SOLICITADO)),
	RECHAZADO(8, "rechazado", false, Collections.singletonList(SOLICITADO)),
    //--------------------------------------------------------------------
    FACTURADO(9, "facturado", false, Collections.singletonList(ACEPTADO)),
    PAGADO(10, "pagado", false, Collections.singletonList(FACTURADO)),
    CANCELADO(11, "cancelado", false, Collections.singletonList(FACTURADO));

    private final int code;
    private final String description;
    private final Boolean enabled;
    private final List<EstadoPedidoDisEnumerator> precedence;

    EstadoPedidoDisEnumerator(int code, String description, Boolean enabled, List<EstadoPedidoDisEnumerator> precedence) {
        this.code = code;
        this.description = description;
        this.enabled = enabled;
        this.precedence = precedence;
    }
    
    public static EstadoPedidoDisEnumerator of(String description) {
    	return Stream.of(EstadoPedidoDisEnumerator.values())
    			.filter(x -> x.getDescription().equals(description))
    			.findFirst()
    			.orElseThrow(()-> new CreceMasNotFoundException("No existe estado: " + description)); 
    }
    
    @Override
    public String toString() {
        return "ErrorCodeEnumerator{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public Boolean evaluateTransition(EstadoPedidoDisEnumerator currentState) {
        return precedence.contains(currentState);
    }
}