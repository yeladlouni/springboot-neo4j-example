package com.example.springbootneo4jexample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.Objects;

@Node
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    @Id
    @GeneratedValue
    private Long neoId;
    private String id;
    private String label;
    private Double length;
    private Double width;
    private Double heigth;
    private Double weight;
    private Double Price;

    public Product() {

    }

    public Product(Long neoId, String id, String label, Double length, Double width, Double heigth, Double weight, Double price) {
        this.neoId = neoId;
        this.id = id;
        this.label = label;
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        this.weight = weight;
        Price = price;
    }

    public Long getNeoId() {
        return neoId;
    }

    public void setNeoId(Long neoId) {
        this.neoId = neoId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(neoId, product.neoId) && Objects.equals(id, product.id) && Objects.equals(label, product.label) && Objects.equals(length, product.length) && Objects.equals(width, product.width) && Objects.equals(heigth, product.heigth) && Objects.equals(weight, product.weight) && Objects.equals(Price, product.Price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(neoId, id, label, length, width, heigth, weight, Price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "neoId=" + neoId +
                ", id='" + id + '\'' +
                ", label='" + label + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", heigth=" + heigth +
                ", weight=" + weight +
                ", Price=" + Price +
                '}';
    }
}



//Node Vertex
//Edge
//DAG  directed acyclic graph
