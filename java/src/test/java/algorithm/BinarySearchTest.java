package algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinarySearchTest {

    private Integer[] sorted_array = new Integer[]{1,11,32,66,72,200,223};
    private Integer[] empty_array = new Integer[]{};
    private Integer[] single_element_array = new Integer[]{66};

    private Integer preferred_element_value = 66;
    private Integer not_found_element = 111;

    @Test
    public void test_iterative_empty_array_case() {
        assertEquals(new Integer(-1), new BinarySearchImpl<Integer>(empty_array).iterativeSearch(preferred_element_value));
    }

    @Test
    public void test_iterative_sorted_array_not_found_element_case() {
        assertEquals(new Integer(-1), new BinarySearchImpl<Integer>(sorted_array).iterativeSearch(not_found_element));
    }

    @Test
    public void test_iterative_sorted_array_found_element_case() {
        assertEquals(new Integer(3), new BinarySearchImpl<Integer>(sorted_array).iterativeSearch(preferred_element_value));
    }

    @Test
    public void test_iterative_single_item_array_case() {
        assertEquals(new Integer(0), new BinarySearchImpl<Integer>(single_element_array).iterativeSearch(preferred_element_value));
    }

    @Test
    public void test_recursive_empty_array_case() {
        assertEquals(new Integer(-1), new BinarySearchImpl<Integer>(empty_array).recursiveSearch(preferred_element_value));
    }

    @Test
    public void test_recursive_sorted_array_not_found_element_case() {
        assertEquals(new Integer(-1), new BinarySearchImpl<Integer>(sorted_array).recursiveSearch(not_found_element));
    }

    @Test
    public void test_recursive_sorted_array_found_element_case() {
        assertEquals(new Integer(3), new BinarySearchImpl<Integer>(sorted_array).recursiveSearch(preferred_element_value));
    }

    @Test
    public void test_recursive_single_item_array_case() {
        assertEquals(new Integer(0), new BinarySearchImpl<Integer>(single_element_array).recursiveSearch(preferred_element_value));
    }
}
