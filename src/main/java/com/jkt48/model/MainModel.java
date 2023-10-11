package com.jkt48.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class MainModel {

    private Integer id;
    private Integer giftId;
    private String giftName;
    private String giftImage;
    private Integer giftPoints;
    private String isFree;
    private Integer totalQty;
    private Integer totalPoints;

    @Embedded
    private Senders senders;
}
