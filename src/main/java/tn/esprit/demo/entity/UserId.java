package tn.esprit.demo.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;

@Embeddable
@Setter
@Getter
public class UserId implements Serializable {
    private int userId;
    private String cin;
}
