package ie.atu.week6;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
   @PositiveOrZero(message = "employeeid must be greater or equal to zero")
   private int id;

   @NotBlank(message = "Name cannot be Blank")
   private String name;

   @PositiveOrZero(message = "employeeid must be greater or equal to zero")
   private double price;
}
