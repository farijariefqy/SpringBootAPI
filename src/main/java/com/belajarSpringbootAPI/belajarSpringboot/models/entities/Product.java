package com.belajarSpringbootAPI.belajarSpringboot.models.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "tbl_product")
@JsonIdentityInfo(
      generator = ObjectIdGenerators.PropertyGenerator.class,
      property = "id"
)
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name is reuquired")
    @Column(name="product_name", length=100)
    private String nama;

    @NotEmpty(message = "Description  is reuquired")
    @Column(name="product_description", length = 500)
    private String description;

    private double price;

    @ManyToMany
    @JoinTable(name ="tbl_product_suplier",
    joinColumns = @JoinColumn(name ="product_id"),
    inverseJoinColumns = @JoinColumn(name = "suplier_id"))
   // @JsonManagedReference //agar json dibatasi
    private Set<Supplier> suppliers;

    @ManyToOne
    private Category category;

    public Product() {
    }

    public Product(Long id, String nama, String description, double price) {
        this.id = id;
        this.nama = nama;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}
