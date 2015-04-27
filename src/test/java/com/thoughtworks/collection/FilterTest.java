package com.thoughtworks.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by hgwang on 4/27/15.
 */
public class FilterTest {

    @Test
    public void should_return_even(){
        Integer[] array = new Integer[] {1,2,3,4,5};

        List<Integer> arrayList =  Arrays.asList(array);

        Filter filter = new Filter(arrayList);
        assertThat(filter.filterEven().size()).isEqualTo(2);
    }

    @Test
    public void should_return_multiple_of_three(){
        Integer[] array = new Integer[] {6,2,3,4,9};

        List<Integer> arrayList =  Arrays.asList(array);

        Filter filter = new Filter(arrayList);
        assertThat(filter.filterMultipleOfThree().size()).isEqualTo(3);
    }

    @Test
    public void should_return_common_elements(){
        Integer[] array = new Integer[] {6,2,3,4,9};
        Integer[] array1 = new Integer[] {2,3,5,9,6};

        List<Integer> arrayList =  Arrays.asList(array);
        List<Integer> arrayList1 =  Arrays.asList(array1);

        Filter filter = new Filter(arrayList);
        assertThat(filter.getCommonElements(arrayList, arrayList1).size()).isEqualTo(4);
    }


    @Test
    public void should_return_different_elements(){
        Integer[] array = new Integer[] {6,2,3,4,9};
        Integer[] array1 = new Integer[] {2,3,5,9,6};

        List<Integer> arrayList =  Arrays.asList(array);
        List<Integer> arrayList1 =  Arrays.asList(array1);

        Filter filter = new Filter(arrayList);
        assertThat(filter.getDifferentElements(arrayList, arrayList1).size()).isEqualTo(2);
    }
}
