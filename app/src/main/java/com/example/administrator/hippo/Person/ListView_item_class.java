package com.example.administrator.hippo.Person;

public class ListView_item_class {
    private  int Icon;
    private String Name;

    public ListView_item_class(int icon, String name) {
        Icon = icon;
        Name = name;
    }

    public ListView_item_class() {
    }

    public int getIcon() {
        return Icon;
    }

    public void setIcon(int icon) {
        Icon = icon;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
