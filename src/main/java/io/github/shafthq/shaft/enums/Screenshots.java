package io.github.shafthq.shaft.enums;

public enum Screenshots {
    ELEMENT("element"), VIEWPORT("regular"), FULL("fullpage");
    final String value;

    Screenshots(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}