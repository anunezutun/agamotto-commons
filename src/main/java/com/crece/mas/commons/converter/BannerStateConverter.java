package com.crece.mas.commons.converter;

import com.crece.mas.commons.enumerator.BannerStateEnumerator;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class BannerStateConverter implements AttributeConverter<BannerStateEnumerator, Boolean> {

	@Override
	public Boolean convertToDatabaseColumn(BannerStateEnumerator bannerStateEnumerator) {
		return bannerStateEnumerator != null && bannerStateEnumerator.getCode()
			.equals(BannerStateEnumerator.ACTIVE.getCode());
	}

	@Override
	public BannerStateEnumerator convertToEntityAttribute(Boolean enabled) {
		return enabled.equals(true) ? BannerStateEnumerator.ACTIVE : BannerStateEnumerator.INACTIVE;
	}
}
