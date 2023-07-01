package org.example;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;


public class Main {
    public static void main(String[] args) throws IOException, JsonException {
        try (FileReader fileReader = new FileReader("C:\\Users\\Ilia\\Desktop\\Gb\\Java july\\dz2_1\\src\\main\\java\\org\\example\\user.json")) {

            JsonObject deserialize = (JsonObject) Jsoner.deserialize(fileReader);

            Mapper mapper = new DozerBeanMapper();

            Filters staff = mapper.map(deserialize, Filters.class);
            StringBuilder sb = new StringBuilder("select * from students where \n");
            if (!Objects.equals(staff.getName(), "null")) {
                sb.append("Name = ");
                sb.append(staff.getName() + " ");
                sb.append("\n");
            }
            if (!Objects.equals(staff.getCountry(), "null")) {
                sb.append("Country = ");
                sb.append(staff.getCountry() + " ");
                sb.append("\n");
            }
            if (!Objects.equals(staff.getCity(), "null")) {
                sb.append("City = ");
                sb.append(staff.getCity() + " ");
                sb.append("\n");
            }
            if (!Objects.equals(staff.getAge(), "null")) {
                sb.append("Age = ");
                sb.append(staff.getAge() + " ");
                sb.append("\n");
            }

            System.out.println(sb.toString());

        }
    }
}