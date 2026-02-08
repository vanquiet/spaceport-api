package com.spaceport.spaceportapi.model;

public class Pilot extends BaseEntity {
    private String name;
    private String licenseCode;

    public Pilot() {}

    public Pilot(int id, String name, String licenseCode) {
        this.id = id;
        this.name = name;
        this.licenseCode = licenseCode;
    }

    @Override
    public String getType() { return "PILOT"; }

    public String getName() { return name; }
    public String getLicenseCode() { return licenseCode; }

    public void setName(String name) { this.name = name; }
    public void setLicenseCode(String licenseCode) { this.licenseCode = licenseCode; }
}
