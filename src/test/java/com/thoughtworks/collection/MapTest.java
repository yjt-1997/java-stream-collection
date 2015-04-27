package com.thoughtworks.collection;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class MapTest {

    @Test
    public void should_map_to_double(){

        int[] array = new int[]{1,2,3,4,5};
        Map map = new Map(array);

        assertThat(map.getDouble()[1]).isEqualTo(4);
        assertThat(map.getDouble()[4]).isEqualTo(10);
    }

    @Test
    public void should_map_to_triple(){

        int[] array = new int[]{1,3,5,4,9};
        Map map = new Map(array);

        assertThat(map.getTriple()[1]).isEqualTo(9);
        assertThat(map.getTriple()[4]).isEqualTo(27);
    }

    @Test
    public void should_map_to_fourfold_then_add_1(){

        int[] array = new int[]{1,2,3,4,5};
        Map map = new Map(array);

        assertThat(map.getFourFoldThenAddOne()[1]).isEqualTo(9);
        assertThat(map.getFourFoldThenAddOne()[4]).isEqualTo(21);
    }

    @Test
    public void should_map_to_letter(){

        int[] array = new int[]{1,2,3,4,5};
        Map map = new Map(array);

        assertThat(map.mapLetter()[1]).isEqualTo("b");
        assertThat(map.mapLetter()[4]).isEqualTo("e");
    }

    @Test
    public void should_map_to_letters(){

        int[] array = new int[]{1,13,27,30,25,27};
        Map map = new Map(array);

        assertThat(map.mapLetters()[1]).isEqualTo("b");
        assertThat(map.mapLetters()[2]).isEqualTo("aa");
        assertThat(map.mapLetters()[3]).isEqualTo("ad");
    }

    @Test
    public void should_sort_from_big_to_small(){

        int[] array = new int[]{1,2,3,4,5};
        Map map = new Map(array);

        assertThat(map.sortFromBig()[0]).isEqualTo(5);
        assertThat(map.sortFromBig()[4]).isEqualTo(1);
    }

    @Test
    public void should_sort_from_small_to_big(){

        int[] array = new int[]{3,2,4,5,1};
        Map map = new Map(array);

        assertThat(map.sortFromBig()[0]).isEqualTo(1);
        assertThat(map.sortFromBig()[4]).isEqualTo(5);
    }
}