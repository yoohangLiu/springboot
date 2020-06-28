package com.xs.boot.entity.zkyx;

public class skVio {
    private int violation_id;
    private String violation_name;
    private String suggest_deal;

    public int getViolation_id() {
        return violation_id;
    }

    public void setViolation_id(int violation_id) {
        this.violation_id = violation_id;
    }

    public String getViolation_name() {
        return violation_name;
    }

    public void setViolation_name(String violation_name) {
        this.violation_name = violation_name;
    }

    public String getSuggest_deal() {
        return suggest_deal;
    }

    public void setSuggest_deal(String suggest_deal) {
        this.suggest_deal = suggest_deal;
    }

    @Override
    public String toString() {
        return "Vio{" +
                "violation_id=" + violation_id +
                ", violation_name='" + violation_name + '\'' +
                ", suggest_deal='" + suggest_deal + '\'' +
                '}';
    }

}
