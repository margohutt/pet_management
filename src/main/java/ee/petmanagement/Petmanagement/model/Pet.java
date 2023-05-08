package ee.petmanagement.Petmanagement.model;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import jakarta.persistence.*;

import java.io.Serializable;

@JsonPOJOBuilder
@Entity
public class Pet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private int code;
    private String type;
    private String furColor;
    private String countryOfOrigin;
    @Column(nullable = false, updatable = false)
    private String petCode;

    public Pet() {}

    public Pet(String name, int code, String type, String furColor, String countryOfOrigin, String petCode) {
        this.name = name;
        this.code = code;
        this.type = type;
        this.furColor = furColor;
        this.countryOfOrigin = countryOfOrigin;
        this.petCode = petCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getCode(){
        return code;
    }

    public void setCode(int code){
        this.code = code;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getFurColor(){
        return furColor;
    }

    public void setFurColor(String furColor){
        this.furColor = furColor;
    }

    public String getCountryOfOrigin(){
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin){
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getPetCode(){ return petCode; }

    public void setPetCode(String petCode){ this.petCode = petCode; }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", furColor='" + furColor + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }
}
