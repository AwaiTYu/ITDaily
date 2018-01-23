package com.json.itdaily.realmbean;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Json on 2018/1/23.
 */

public class MobilePhone extends RealmObject {
    private String name;
    private int price;
    @PrimaryKey
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
