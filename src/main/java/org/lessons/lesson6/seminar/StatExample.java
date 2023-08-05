package org.lessons.lesson6.seminar;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.ArrayList;
import java.util.List;

public class StatExample {

    public static void main(String[] args) {
        List<Integer> values = List.of(65, 51 , 16, 11 , 6519, 191 ,0 , 98, 19854, 1, 32);
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
        for (Integer v : values) {
            descriptiveStatistics.addValue(v);
        }

        //Средне арефметическое
        System.out.println(descriptiveStatistics.getMean());
        System.out.println(descriptiveStatistics.getMax());
        System.out.println(descriptiveStatistics.getMin());
        System.out.println(descriptiveStatistics.getSum());
    }
}
