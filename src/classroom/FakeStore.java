package classroom;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FakeStore {
    static ObjectMapper objectMapper = new ObjectMapper();
    public static void main(String[] args) {
        try{
            URL url = new URI("https://fakestoreapi.com/products").toURL();
            InputStream stream = url.openStream();
            List<Product> products = objectMapper.readValue(stream, new TypeReference<>() {});
//            display(users);
//            System.out.println(products);
            String location = "";
            Path path = Paths.get(location);
            try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path)) {
//                bufferedWriter
            }
            System.out.println(findByCategoryName(products, "men's clothing"));
//            stream.close();
        }catch (Exception exception){
            System.err.println(exception.getMessage());
        }
    }
    public static Collection<Product> findByCategoryName(List<Product> products,String category){
        Collection<Product> collection = new ArrayList<>();
        return products.stream().filter(product -> product.getCategory()
                .equals(category)).collect(Collectors.toList());
//        for (Product product : products){
//            if (product.getCategory().equals(category))
//                collection.add(product);
//        }
//        return collection;
    }
}
