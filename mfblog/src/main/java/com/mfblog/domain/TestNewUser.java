package com.mfblog.domain;

import java.io.Serializable;

/**
 * Created by liushiyu on 2017/6/30.
 */
public class TestNewUser implements Serializable {

    private String name;
    private String address;
    private String sax;

    public TestNewUser() {

    }

    public TestNewUser(String name, String address, String sax) {
        this.name = name;
        this.address = address;
        this.sax = sax;
    }

    @Override
    public String toString() {
        return "TestNewUser{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sax='" + sax + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestNewUser that = (TestNewUser) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        return sax != null ? sax.equals(that.sax) : that.sax == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (sax != null ? sax.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSax() {
        return sax;
    }

    public void setSax(String sax) {
        this.sax = sax;
    }
}
