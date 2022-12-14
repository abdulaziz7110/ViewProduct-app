package uz.pdp.viewproductapp.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Locale;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Product {

    private Integer id;
    private String name;
    private double price;
    private String description;
    private Category category;

}
