package org.example;

import com.github.cliftonlabs.json_simple.Jsonable;
import com.github.cliftonlabs.json_simple.JsonObject;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class Filters implements Jsonable {
    //    {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    private String name;
    private String country;
    private String city;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public String toJson() {
        final StringWriter writable = new StringWriter();
        try {
            this.toJson(writable);
        } catch (final IOException e) {
        }
        return writable.toString();
    }

    @Override
    public void toJson(Writer writer) throws IOException {
        final JsonObject json = new JsonObject();
        json.put("name", this.getName());
        json.put("country", this.getCountry());
        json.put("city", this.getCity());
        json.put("age", this.getAge());
        json.toJson(writer);
    }
}
