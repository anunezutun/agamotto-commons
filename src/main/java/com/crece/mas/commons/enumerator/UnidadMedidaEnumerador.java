package com.crece.mas.commons.enumerator;

import com.crece.mas.commons.exception.CreceMasNotFoundException;

import java.util.Optional;
import java.util.stream.Stream;

public enum UnidadMedidaEnumerador implements IGenericEnumerator<String> {

    UNI("UNI", "Unidad", "un"),
    MTR("MTR", "Metro", "mt"),
    LTR("LTR", "Litro", "lt"),
    GRM("GRM", "Gramo", "gr"),
    KGM("KGM", "'Kilogramo", "kg"),
    MLT("MLT", "Mililitro", "ml");

    private final String code;
    private final String description;
    private final String abbreviation;

    private UnidadMedidaEnumerador(String code, String description, String abbreviation) {
        this.code = code;
        this.description = description;
        this.abbreviation = abbreviation;
    }
    

    public static UnidadMedidaEnumerador of(String code){
        return Stream.of(UnidadMedidaEnumerador.values())
                .filter(m -> m.getCode().equals(code))
                .findFirst()
                .orElseThrow(()->new CreceMasNotFoundException("No existe la unidad de medida:" + code));
    }

    public static UnidadMedidaEnumerador findByDescription(String description){
        return Stream.of(UnidadMedidaEnumerador.values())
                .filter(m -> m.getDescription().equals(description))
                .findFirst()
                .orElseThrow(()->new CreceMasNotFoundException("No existe la unidad de medida con descripción:" + description));
    }
    
    public static Optional<UnidadMedidaEnumerador> getIfPresent(String code){
        return Stream.of(UnidadMedidaEnumerador.values())
                .filter(m -> m.getCode().equals(code))
                .findFirst();
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    @Override
    public String toString() {
        return "UnidadMedidaEnumerador{" +
                "code=" + code +
                ", description=" + description +
                ", abbreviation=" + abbreviation + '}';
    }
    

    
}
