package com.crece.mas.commons.enumerator;

public enum DiscountTargetEnumerator implements IGenericEnumerator<Integer>{
    PRODUCT(0,"Producto"),
    BRAND(1, "Marca"),
    CATEGORY_LEVEL1(2, "Categoria"),
    CATEGORY_LEVEL2(3, "Subcategoria"),
    PURCHASE_ORDER(10, "Orden de compra");

    Integer code;
    String description;
    DiscountTargetEnumerator(Integer code, String description){
        this.code = code;
        this.description = description;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
