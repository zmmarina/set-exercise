package com.zmonteiro;

import java.util.Objects;

public class Color implements Comparable<Color>{
    private String name;

    public Color(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return Objects.equals(name, color.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Color color) {
        return this.getName().compareTo(color.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}
