package com.crece.mas.commons.enumerator;

import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

public enum OctogonEnumerator {

	GRASAS_TRANS,
	GRASAS_SATURADAS,
	SODIO,
	AZUCAR;

	public static boolean isValid(String octogon) {
		return Stream.of(OctogonEnumerator.values())
			.anyMatch(
				octogonEnumerator -> StringUtils.isNotEmpty(octogon) && !octogon.trim().isEmpty()
					&& octogon.equalsIgnoreCase(String.valueOf(octogonEnumerator)));
	}
}
