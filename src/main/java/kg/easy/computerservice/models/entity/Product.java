package kg.easy.computerservice.models.entity;


import kg.easy.computerservice.models.enums.Type;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    String maker;

    @Id
    String model;

    @Enumerated(EnumType.STRING)
    Type type;
}
