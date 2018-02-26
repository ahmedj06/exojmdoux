
package fr.ahmedj;

import fr.ahmedj.collections.Lists;
import fr.ahmedj.streams.Streams;
import org.openjdk.jmh.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Principal {

    //http://blog.soat.fr/2015/07/benchmark-java-jmh-fine-tuning/
    @Benchmark
    @BenchmarkMode(Mode.AverageTime) @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Fork(value = 1)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    public static void testMethod() {
        Streams s = new Streams();
        s.bufferedStreamNew(16*1024);

    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime) @OutputTimeUnit(TimeUnit.MICROSECONDS)
    @Fork(value = 1)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    public static void testMethod1() {
        Streams s = new Streams();
        s.bufferedStreamNew(8192);

    }

    public static void main (String[] args){
        Principal.testMethod();
        Principal.testMethod1();
    }
}
