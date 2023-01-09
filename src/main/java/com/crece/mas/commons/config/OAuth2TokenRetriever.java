package com.crece.mas.commons.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

public class OAuth2TokenRetriever implements AuthTokenRetriever {
    @Qualifier("userInfoTokenServices")
    @Autowired
    private ResourceServerTokenServices resourceServerTokenServices;
    @Override
    public String getAuthToken(Authentication auth) {
        OAuth2Authentication oauth2 = (OAuth2Authentication) auth;
        OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) oauth2.getDetails();
        return details.getTokenValue();
    }
    
    @Override
    public long getUsuId(Authentication auth) {
        OAuth2Authentication oAuth2Authentication = resourceServerTokenServices.loadAuthentication(getAuthToken(auth));
        Integer usuId = 0;
        if (oAuth2Authentication != null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) oAuth2Authentication.getUserAuthentication().getDetails();
            usuId = (Integer) linkedHashMap.get("idPerson");
        }
        return Long.parseLong(String.valueOf(usuId));
    }

    @Override
    public List<Integer> getRoles(Authentication auth) {
        List<Integer> roles = new ArrayList<>();
        OAuth2Authentication oAuth2Authentication = resourceServerTokenServices.loadAuthentication(getAuthToken(auth));
        if (oAuth2Authentication != null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) oAuth2Authentication.getUserAuthentication().getDetails();
            roles = Collections.unmodifiableList((List<Integer>) linkedHashMap.get("roles"));
        }
        return roles;
    }
}
