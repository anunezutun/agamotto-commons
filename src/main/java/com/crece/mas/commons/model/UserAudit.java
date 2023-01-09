package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_audit", schema = "public", catalog = "crecemasdb")
public class UserAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_managed")
    private String userManaged;

    @Column(name = "action_name")
    private String actionName;

    @Column(name = "operation_site")
    private String operationSite;

    @Column(name = "date_managed")
    @CreationTimestamp
    private Timestamp dateManaged;

    @Column(name = "affected_user")
    private String affectedUser;

}
