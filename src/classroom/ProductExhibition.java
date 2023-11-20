package classroom;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

public class ProductExhibition {
    public List<Product> getAllCategories() {
        ObjectMapper mapper = new ObjectMapper();
        List<Product> products = new ArrayList<>();
        try {
            URI uri = new URI("https://fakestoreapi.com/products");
            URL url = uri.toURL();
            InputStream stream = url.openStream();
            products = mapper.readValue(stream, new TypeReference<>() {
            });
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
        return products;
    }

    public List<Product> getFoundCategories(List<Product> products, String category) {
        return products.stream().filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());
    }
    public List<Product> sortProduct(List<Product> products){
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getCategory().compareTo(o2.getCategory());
            }
        });
//        Comparator<Product> comparator = (firstProduct, secondProduct) -> firstProduct.getCategory()
//                .compareTo(secondProduct.getCategory());
//        products.sort(comparator);
        return products;
    }
}
