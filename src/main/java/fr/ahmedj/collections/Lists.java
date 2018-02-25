package fr.ahmedj.collections;

import java.util.*;
import org.openjdk.jmh.annotations.Benchmark;

public class Lists {

    //http://blog.soat.fr/2015/07/benchmark-java-jmh-fine-tuning/
    @Benchmark
    public void testMethod() {
        // This is a demo/sample template for building your JMH benchmarks. Edit as needed.
        // Put your benchmark code here.
        this.array();
    }

    public String array(){
        List<String> array = new ArrayList<>();
        int i = 0;
        /*
        while (i < 100){
            array.add("toto "+i);
            System.out.println(array.get(i));
            i++;
        }
        */
        return "OK";
    }

    public static void main (String[] args){
        // ArrayList
        Lists l = new Lists();
        l.testMethod();
    }

}
