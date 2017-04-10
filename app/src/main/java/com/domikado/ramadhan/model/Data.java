
package com.domikado.ramadhan.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nama_rsu")
    @Expose
    private String namaRsu;
    @SerializedName("jenis_rsu")
    @Expose
    private String jenisRsu;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("kode_pos")
    @Expose
    private Integer kodePos;
    @SerializedName("telepon")
    @Expose
    private List<String> telepon = null;
    @SerializedName("faximile")
    @Expose
    private List<String> faximile = null;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("kode_kota")
    @Expose
    private Integer kodeKota;
    @SerializedName("kode_kecamatan")
    @Expose
    private Integer kodeKecamatan;
    @SerializedName("kode_kelurahan")
    @Expose
    private Integer kodeKelurahan;
    @SerializedName("latitude")
    @Expose
    private Float latitude;
    @SerializedName("longitude")
    @Expose
    private Float longitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaRsu() {
        return namaRsu;
    }

    public void setNamaRsu(String namaRsu) {
        this.namaRsu = namaRsu;
    }

    public String getJenisRsu() {
        return jenisRsu;
    }

    public void setJenisRsu(String jenisRsu) {
        this.jenisRsu = jenisRsu;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Integer getKodePos() {
        return kodePos;
    }

    public void setKodePos(Integer kodePos) {
        this.kodePos = kodePos;
    }

    public List<String> getTelepon() {
        return telepon;
    }

    public void setTelepon(List<String> telepon) {
        this.telepon = telepon;
    }

    public List<String> getFaximile() {
        return faximile;
    }

    public void setFaximile(List<String> faximile) {
        this.faximile = faximile;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getKodeKota() {
        return kodeKota;
    }

    public void setKodeKota(Integer kodeKota) {
        this.kodeKota = kodeKota;
    }

    public Integer getKodeKecamatan() {
        return kodeKecamatan;
    }

    public void setKodeKecamatan(Integer kodeKecamatan) {
        this.kodeKecamatan = kodeKecamatan;
    }

    public Integer getKodeKelurahan() {
        return kodeKelurahan;
    }

    public void setKodeKelurahan(Integer kodeKelurahan) {
        this.kodeKelurahan = kodeKelurahan;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

}
