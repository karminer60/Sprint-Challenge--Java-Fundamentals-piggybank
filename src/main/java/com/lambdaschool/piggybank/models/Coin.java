package com.lambdaschool.piggybank.models;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin {

    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    long coinid;
    string name;
    string namepural;
    double value;
    int quantity;

    public Coin(string name, string namepural, double value, int quantity) {
        this.name = name;
        this.namepural = namepural;
        this.value = value;
        this.quantity = quantity;
    }

    public Coin() {
        //default constructor
    }

    public long getCoinid() {
        return coinid;
    }

    public void setCoinid(long coinid) {
        this.coinid = coinid;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getNamepural() {
        return namepural;
    }

    public void setNamepural(string namepural) {
        this.namepural = namepural;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "coinid=" + coinid +
                ", name=" + name +
                ", namepural=" + namepural +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}
