package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSum(int leftBorder,int rightBorder,boolean isEven){
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        if(isEven){
            return IntStream.rangeClosed(leftBorder, rightBorder).filter(i -> i % 2 == 0).sum();
        }
        return return IntStream.rangeClosed(leftBorder, rightBorder).filter(i -> i % 2 != 0).sum();
        
    }
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        return getSum(leftBorder,rightBorder,true);
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        return getSum(leftBorder,rightBorder,false);
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(i -> i * 3 + 2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(i -> {
            if (i % 2 == 1)
                return i * 3 + 2;
            return i;
        }).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        //return arrayList.stream().filter(i -> i % 2 == 0);
        return arrayList.stream().filter(i -> i % 2 == 0).mapToDouble(i -> i).average().getAsDouble();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
