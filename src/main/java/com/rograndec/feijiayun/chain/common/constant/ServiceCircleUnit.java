package com.rograndec.feijiayun.chain.common.constant;

public enum ServiceCircleUnit {
    DAY(0,"天"),
    MONTH(1,"月");

    private int code;
    private String name;

    private ServiceCircleUnit(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public int getCode() {
        return code;
    }
    public void setType(int code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static String getName(int code) {
        for (ServiceCircleUnit c : ServiceCircleUnit.values()) {
            if (c.getCode() == code) {
                return c.getName();
            }
        }
        return null;
    }
}
