package com.crece.mas.commons.dto;

import com.crece.mas.commons.enumerator.TipoDocumentoEnumerator;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SecurityUser {

    String identityNumber;
    TipoDocumentoEnumerator identityType;
    String legacyUserName;
    SecurityUsertype securityUsertype;

    public enum SecurityUsertype{
        BY_IDENTITY, BY_LEGACY;
    }

}
