package com.crece.mas.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "productos_almacen_chatbot", schema = "public", catalog = "crecemasdb")
public class ProductosAlmacenChatbot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pac_id")
    private long pacId;

    @Column(name = "pac_codigo_almacen")
    private String pacCodigoAlmacen;

    @Column(name = "pac_codigo_chatbot")
    private String pacCodigoChatbot;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pac_pal_id", referencedColumnName = "pal_id", nullable = false)
    private ProductosAlmacen productosAlmacen;

}
