package ie.atu.week6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.objenesis.SpringObjenesis;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductServices myService;


    public ProductController(ProductServices myService) {
        this.myService = myService;
    }

    private List<Product> list = new ArrayList<>();
// Creating a class which is intersted in requests and response. sEPARATION OF Concern

    @PostMapping("addProduct")
    public List<Product> newProduct(@RequestBody Product product)
    {
        //send it to do business logic
        list = myService.addProduct(product);
        return list;
    }
}
