package com.crece.mas.commons.converter;

import com.crece.mas.commons.enumerator.BannerStateEnumerator;
import com.crece.mas.commons.enumerator.ShoppingCartItemStateEnumerator;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ShoppingCartItemStateConverter implements AttributeConverter<ShoppingCartItemStateEnumerator, Boolean> {

	@Override
	public Boolean convertToDatabaseColumn(ShoppingCartItemStateEnumerator shoppingCartItemStateEnumerator) {
		return shoppingCartItemStateEnumerator != null && shoppingCartItemStateEnumerator.getCode()
			.equals(BannerStateEnumerator.ACTIVE.getCode());
	}

	@Override
	public ShoppingCartItemStateEnumerator convertToEntityAttribute(Boolean enabled) {
		return enabled.equals(true) ? ShoppingCartItemStateEnumerator.ACTIVE : ShoppingCartItemStateEnumerator.INACTIVE;
	}
}
