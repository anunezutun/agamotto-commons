package com.crece.mas.commons.utils;

import com.crece.mas.commons.dto.SecurityUser;
import com.crece.mas.commons.enumerator.TipoDocumentoEnumerator;
import org.springframework.util.StringUtils;
import java.util.Optional;

public class SecurityUtils {

    public static final String USER_SEPARATOR_IDENTIFIER = "|";

    public static Optional<SecurityUser> buildPrincipalUser(String username){

        Optional<SecurityUser> securityUser = Optional.empty();

        String[] usernameAndDocumentType = StringUtils.split(
                username, USER_SEPARATOR_IDENTIFIER);

        if(usernameAndDocumentType == null){
            return Optional.of(SecurityUser.builder()
                    .legacyUserName(username)
                    .securityUsertype(SecurityUser.SecurityUsertype.BY_LEGACY)
                    .build());

        }

        if (usernameAndDocumentType.length == 2) {
            return Optional.of(SecurityUser
                    .builder()
                    .identityNumber(usernameAndDocumentType[0])
                    .identityType(TipoDocumentoEnumerator.of(usernameAndDocumentType[1]))
                    .securityUsertype(SecurityUser.SecurityUsertype.BY_IDENTITY)
                    .build());
        }

        return securityUser;
    }

    public static String getUsername(SecurityUser securityUser){
        if(securityUser.getSecurityUsertype()== SecurityUser.SecurityUsertype.BY_IDENTITY){
            return securityUser.getIdentityNumber()+USER_SEPARATOR_IDENTIFIER+securityUser.getIdentityType().getCode();
        }else{
            return securityUser.getLegacyUserName();
        }
    }

}
