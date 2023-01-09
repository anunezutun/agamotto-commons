package com.crece.mas.commons.benchmarks;


import com.crece.mas.commons.guid.GUIDGenerator;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class BenchmarksTests {

    private static GUIDGenerator guidGenerator = new GUIDGenerator(1, 2);

    //@Test
    public void runBenchmarks() throws Exception {
        Options opts = new OptionsBuilder()
                .include("\\." + this.getClass().getSimpleName() + "\\.")
                .warmupIterations(3)
                .warmupTime(TimeValue.seconds(10))
                .measurementIterations(3)
                .measurementTime(TimeValue.minutes(5))
                .forks(0)
                .threads(5)
                .shouldDoGC(true)
                .shouldFailOnError(true)
                .jvmArgs("-server")
                .build();

        new Runner(opts).run();
    }

    @Benchmark
    public void idGeneration() {
        guidGenerator.generateID();
    }

    @Benchmark
    public void idMask(GUIDDataProvider guidDataProvider) {
        guidGenerator.encodeID(guidDataProvider.guid);
    }

    @Benchmark
    public void idUnmask(GUIDDataProvider guidDataProvider) {
        guidGenerator.decodeAlphaID(guidDataProvider.maskedGuid);
    }

    @State(Scope.Benchmark)
    public static class GUIDDataProvider {
        private BigInteger guid;
        private String maskedGuid;
        @Setup(Level.Invocation)
        public void setup() {
            guid = guidGenerator.generateID();
            maskedGuid = guidGenerator.encodeID(guid);
        }
    }
}
