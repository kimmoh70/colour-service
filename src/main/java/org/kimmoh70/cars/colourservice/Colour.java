package org.kimmoh70.cars.colourservice;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Year;

@Document(collection = "colours")
public class Colour {

    @Id
    public String id;
    @Indexed(unique=true)
    public String name;
    @Indexed(unique = true)
    public String code;


    public Year start;

    public Year end;


    public Colour() {}
    public Colour(final String name, final String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Year getStart() {
        return start;
    }

    public void setStart(Year start) {
        this.start = start;
    }
    public Year getEnd() {
        return end;
    }

    public void setEnd(Year end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return String.format(
                "Colour[id=%s, name='%s', code='%s']",
                id, name, code);
    }


}
