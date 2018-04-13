package com.example.admin.contentproviderproject;

public class DataModel
{
    final public static DataContract Contract = new DataContract(
            "DataModel",
            "Id",
            "INTEGER",
            new String[]{ "Name", "Value"},
            new String[]{ "TEXT", "TEXT"},
            1);
    int id;
    String name;
    String value;

    public DataModel(int id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
