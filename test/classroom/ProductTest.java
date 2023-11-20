package classroom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    ProductExhibition product;
    @BeforeEach void startWith(){
        product = new ProductExhibition();
    }
    @Test public void testThatAllTheCategorySizeIs20(){
        assertEquals(20, product.getAllCategories().size());
    }
    @Test public void testThatMenCategoryIs(){
        List<Product> products = product.getAllCategories();
        List<Product> foundProducts = product.getFoundCategories
                (products, "men's clothing");
        assertEquals(4, foundProducts.size());
    }
    @Test public void sortByDescending(){
        List<Product> products = product.getAllCategories();
        List<Product> foundProducts = product.sortProduct(products);
        System.out.println(foundProducts);
        assertEquals(20, foundProducts.size());
    }
}