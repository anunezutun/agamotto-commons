package com.crece.mas.commons.guid;

import com.crece.mas.commons.config.SpringContext;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

public class GUIDGeneratorStrategy implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        GUIDGenerator guidGenerator = SpringContext.getBean(GUIDGenerator.class);
        return guidGenerator.generateAlphaID();
    }
}
