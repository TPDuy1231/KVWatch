/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Watch;

public class WatchDTO {
    private int Id;
    private String Name;
    private String Brand;
    private String Model;
    private String Type;
    private String Origin;
    private String Material;
    private double Price;
    private String WaterResistance;
    private int WarrantyYears;
    private String Gender;
    private String DialColor;
    private String BandColor;
    private String BandMaterial;
    private String Features;

    public WatchDTO() {
        
    }

    public WatchDTO(int Id, String Name, String Brand, String Model, String Type, String Origin, String Material, double Price, String WaterResistance, int WarrantyYears, String Gender, String DialColor, String BandColor, String BandMaterial, String Features) {
        this.Id = Id;
        this.Name = Name;
        this.Brand = Brand;
        this.Model = Model;
        this.Type = Type;
        this.Origin = Origin;
        this.Material = Material;
        this.Price = Price;
        this.WaterResistance = WaterResistance;
        this.WarrantyYears = WarrantyYears;
        this.Gender = Gender;
        this.DialColor = DialColor;
        this.BandColor = BandColor;
        this.BandMaterial = BandMaterial;
        this.Features = Features;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getWaterResistance() {
        return WaterResistance;
    }

    public void setWaterResistance(String WaterResistance) {
        this.WaterResistance = WaterResistance;
    }

    public int getWarrantyYears() {
        return WarrantyYears;
    }

    public void setWarrantyYears(int WarrantyYears) {
        this.WarrantyYears = WarrantyYears;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDialColor() {
        return DialColor;
    }

    public void setDialColor(String DialColor) {
        this.DialColor = DialColor;
    }

    public String getBandColor() {
        return BandColor;
    }

    public void setBandColor(String BandColor) {
        this.BandColor = BandColor;
    }

    public String getBandMaterial() {
        return BandMaterial;
    }

    public void setBandMaterial(String BandMaterial) {
        this.BandMaterial = BandMaterial;
    }

    public String getFeatures() {
        return Features;
    }

    public void setFeatures(String Features) {
        this.Features = Features;
    }
    
    
    
}
