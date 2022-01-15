package kg.easy.computerservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "printer")
@Data


public class Printer {

    @Id
    private int code;

    @ManyToOne
    @JoinColumn(name = "model")
    private Product product;
    private String color;
    private String type;
    private double price;
}
