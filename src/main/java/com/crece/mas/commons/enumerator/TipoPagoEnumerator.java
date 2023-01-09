package com.crece.mas.commons.enumerator;

import com.crece.mas.commons.exception.CreceMasNotFoundException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum TipoPagoEnumerator implements IGenericEnumerator<String> {

    TIENDA_PAGO("TIENDA_PAGO", "Tienda Pago","Tienda Pago", "Tienda Pago", true, false, TipoPagoEnumerator.MODE_CASH,-2),
    CREDITO_7("CREDITO_7", "Crédito 7 días","Crédito 7 días", "Crédito", true, false, TipoPagoEnumerator.MODE_CREDIT,-1),
    CREDITO_14("CREDITO_14", "Crédito 14 días","Crédito 14 días", "Crédito", true, false, TipoPagoEnumerator.MODE_CREDIT,0),
    EFECTIVO("EFECTIVO", "Pagar en efectivo contra entrega","Efectivo", "Efectivo", true, true, TipoPagoEnumerator.MODE_CASH,1),
    YAPE("YAPE", "Paga con yape contra entrega","Yape", "Yape", true, false, TipoPagoEnumerator.MODE_CASH,2),
    PLIN("PLIN", "Paga con plin contra entrega","Plin", "Plin", false, false, TipoPagoEnumerator.MODE_CASH,3),
    POS("POS", "Paga con POS Inalámbrico","POS",  "Tarjeta", true, true, TipoPagoEnumerator.MODE_CASH,4),
    TRANSFERENCIA("TRANSFERENCIA", "A una cuenta del ","Transferencia", "Transferencia", true, true, TipoPagoEnumerator.MODE_CASH,5),
    YAPE_PLIN("YAPE_PLIN", "Paga con yape / plin contra entrega", "Yape | Plin", "Yape | Plin", false, true, TipoPagoEnumerator.MODE_CASH,2);

    public static final String MODE_CREDIT = "CREDITO";
    public static final String MODE_CASH = "CONTADO";
    private final String code;
    private final String description;
    private final String name;
    private final String alternativeName;
    private final boolean isSellInEnabled;
    private final boolean isSellOutEnabled;
    private final String mode;
    private final int order;

    TipoPagoEnumerator(String code, String description, String name, String alternativeName, boolean isSellInEnabled, boolean isSellOutEnabled, String mode, int order) {
        this.code = code;
        this.description = description;
        this.name = name;
        this.alternativeName = alternativeName;
        this.isSellInEnabled = isSellInEnabled;
        this.isSellOutEnabled = isSellOutEnabled;
        this.mode = mode;
        this.order = order;
    }

    public static TipoPagoEnumerator of(String code){
        return Stream.of(TipoPagoEnumerator.values())
                .filter(m -> m.getCode().equals(code))
                .findFirst()
                .orElseThrow(()->new CreceMasNotFoundException("No existe tipo de pago:" + code));
    }

    @Override
    public String toString() {
        return "TipoPagoEnumerator{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", mode='" + mode + '\'' +
                '}';
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

	public String getMode() {
		return mode;
	}

    public String getAlternativeName() {
        return alternativeName;
    }

    public boolean isSellInEnabled() {
        return isSellInEnabled;
    }

    public boolean isSellOutEnabled() {
        return isSellOutEnabled;
    }

    public int getOrder() {
        return order;
    }

    public static List<TipoPagoEnumerator> getSellOut() {
        return Arrays.stream(values())
                .filter(TipoPagoEnumerator::isSellOutEnabled)
                .sorted(Comparator.comparing(TipoPagoEnumerator::getOrder))
                .collect(Collectors.toList());
    }
    public static List<TipoPagoEnumerator> getSellIn() {
        return Arrays.stream(values())
                .filter(TipoPagoEnumerator::isSellInEnabled)
                .sorted(Comparator.comparing(TipoPagoEnumerator::getOrder))
                .collect(Collectors.toList());
    }
}