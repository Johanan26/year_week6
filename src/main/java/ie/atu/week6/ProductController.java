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

    @PostMapping("addProduct")
    public List<Product> newProduct(@RequestBody Product product)
    {
        list = myService.addProduct(product);
        return list;
    }
    @PutMapping("updateProduct/{id}")
    public List<Product> updateProduct(@PathVariable int id, @RequestBody Product product)
    {
        list = myService.updateProduct(id,product);
        return list;
    }

    @DeleteMapping("deleteProduct/{id}")
    public List<Product> deleteProduct(@PathVariable int id)
    {
        list = myService.deleteProduct(id);
        return list;
    }
}
