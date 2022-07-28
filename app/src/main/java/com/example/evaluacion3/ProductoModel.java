package com.example.evaluacion3;

public class ProductoModel {
    private String productoName;
    private String productoPhoto;

    public ProductoModel(String productoName, String productoPhoto) {
        this.productoName = productoName;
        this.productoPhoto = productoPhoto;
    }

    public String getProductoName() { return productoName; }

    public String getProductoPhoto() { return productoPhoto; }

    public void setProductoName(String productoName) { this.productoName = productoName;}


    public void setProductoPhoto(String productoPhoto) { this.productoPhoto = productoPhoto;}
}
