package com.aujas.bootwebapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "address_id")
    private Long addressId;

   @Column(name = "pin_code")
   private Long pincode;
    @Column(name = "city")
   private String city;
    @Column(name = "country")
   private String country;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @JsonIgnore
    private Student student;

    public Address() {
    }

    public Address(Long addressId, Long pincode, String city, String country, Student student) {
        this.addressId = addressId;
        this.pincode = pincode;
        this.city = city;
        this.country = country;
        this.student = student;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

   /* @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", pincode=" + pincode +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", student=" + student +
                '}';
    }*/
}
