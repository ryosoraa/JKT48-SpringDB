package com.jkt48.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Senders {

    private Integer timestamp;
    private Integer userId;
    private String name;
    private Integer avatarId;
    private Integer qty;
    private Integer totalPoints;

}
