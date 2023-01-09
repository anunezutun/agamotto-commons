package com.crece.mas.commons.config;

import java.util.List;
import org.springframework.security.core.Authentication;

public interface AuthTokenRetriever {
    String getAuthToken(Authentication auth);
    
    long getUsuId(Authentication auth);

    List<Integer> getRoles(Authentication auth);
}
