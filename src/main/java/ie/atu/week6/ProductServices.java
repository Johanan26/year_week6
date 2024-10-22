package ie.atu.week6;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServices {

    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product)
    {
        //do buisness stuff like retrieving details from db or generating files pdfs
        myList.add(product);
        return myList;
    }

    public  List<Product> updateProduct(int id, Product product)
    {
        for(Product p : myList){
            if(p.getId() == id)
            {
                myList.remove(p);
            }
        }
        myList.add(product);
        return myList;
    }
}
