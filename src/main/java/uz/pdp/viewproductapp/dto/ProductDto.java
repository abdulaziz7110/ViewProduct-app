package uz.pdp.viewproductapp.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductDto {

    private Integer id;
    private String name;
    private double price;
    private String description;
    private Integer categoryId;
}
