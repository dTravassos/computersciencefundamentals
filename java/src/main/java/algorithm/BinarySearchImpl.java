package algorithm;

public class BinarySearchImpl <T extends Comparable<T>> {

    private T[] elements;

    public BinarySearchImpl(T[] elements) {
        this.elements = elements;
    }

    public Integer iterativeSearch(T input) {
        if (elements.length == 0) {
            return -1;
        }

        Integer min = 0;
        Integer max = this.elements.length - 1;
        Integer index;

        while (min <= max) {
            index =  min + (max - min) / 2; //Avoid overflow

            if ( elements[index] == input) {
                return index;
            } else if (elements[index].compareTo(input) < 0) {
                max = index - 1 ;
            } else {
                min = index + 1;
            }
        }

        return -1;
    }

    public Integer recursiveSearch(T input) {
        if (elements.length == 0) {
            return -1;
        }

        return recursive(input, 0, elements.length);

    }

    private Integer recursive(T input, Integer min, Integer max) {
        Integer index =  min + (max - min) / 2;

        if (elements[index] == input) {
            return index;
        }

        if (min > max) {
            return -1;
        }

        Integer new_max = elements[index].compareTo(input) > 0 ? max : index - 1;
        Integer new_min = elements[index].compareTo(input) > 0 ? min : index + 1;

        return recursive(input, new_min, new_max);
    }
}
