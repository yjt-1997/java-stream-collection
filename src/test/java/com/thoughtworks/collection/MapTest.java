package com.thoughtworks.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

public class MapTest {

    @Test
    public void should_map_to_double(){

        Integer[] array = new Integer[]{1,2,3,4,5};
        List<Integer> list = Arrays.asList(array);

        Map map = new Map(list);

        assertThat(map.getDouble().get(1)).isEqualTo(4);
        assertThat(map.getDouble().get(4)).isEqualTo(10);
    }

    @Test
    public void should_map_to_triple(){

        Integer[] array = new Integer[]{1,3,5,4,9};
        List<Integer> list = Arrays.asList(array);

        Map map = new Map(list);

        assertThat(map.getTriple().get(1)).isEqualTo(9);
        assertThat(map.getTriple().get(4)).isEqualTo(27);
    }

    @Test
    public void should_map_to_fourfold_then_add_1(){

        Integer[] array = new Integer[]{1,2,3,4,5};
        List<Integer> list = Arrays.asList(array);

        Map map = new Map(list);

        assertThat(map.getFourFoldThenAddOne().get(1)).isEqualTo(9);
        assertThat(map.getFourFoldThenAddOne().get(4)).isEqualTo(21);
    }

    @Test
    public void should_map_to_letter(){

        Integer[] array = new Integer[]{1,2,3,4,5};
        List<Integer> list = Arrays.asList(array);

        Map map = new Map(list);

        assertThat(map.mapLetter().get(1)).isEqualTo("b");
        assertThat(map.mapLetter().get(4)).isEqualTo("e");
    }

    @Test
    public void should_map_to_letters(){

        Integer[] array = new Integer[]{1,13,27,30,25,27};
        List<Integer> list = Arrays.asList(array);

        Map map = new Map(list);

        assertThat(map.mapLetters().get(1)).isEqualTo("b");
        assertThat(map.mapLetters().get(2)).isEqualTo("aa");
        assertThat(map.mapLetters().get(3)).isEqualTo("ad");
    }

    @Test
    public void should_sort_from_big_to_small(){

        Integer[] array = new Integer[]{1,2,3,4,5};
        List<Integer> list = Arrays.asList(array);

        Map map = new Map(list);

        assertThat(map.sortFromBig().get(0)).isEqualTo(5);
        assertThat(map.sortFromBig().get(4)).isEqualTo(1);
    }

    @Test
    public void should_sort_from_small_to_big(){

        Integer[] array = new Integer[]{3,2,4,5,1};
        List<Integer> list = Arrays.asList(array);

        Map map = new Map(list);

        assertThat(map.sortFromSmall().get(0)).isEqualTo(1);
        assertThat(map.sortFromSmall().get(4)).isEqualTo(5);
    }
}