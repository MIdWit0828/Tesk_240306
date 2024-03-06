package com.ohgiraffers.tesk_240306.mvc.model.dto;

public class MenuDTO {
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private String categoryName;
    private int categoryCode;
    private String orderableStatus;

    public MenuDTO() {

    }

    public MenuDTO(int menuCode, String menuName, int menuPrice, String categoryName, String orderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.categoryName = categoryName;
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", categoryName='" + categoryName + '\'' +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }
}
