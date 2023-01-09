package com.crece.mas.commons.utils;

import com.crece.mas.commons.guid.GUIDGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class GUIDGeneratorTest {

    private GUIDGenerator guidGenerator;

    @BeforeEach
    void onSetup(){
        guidGenerator = new GUIDGenerator(1, 1);
    }

    @Test
    void generateUniqueId() throws InterruptedException {
        int threadCount = 5;
        int maxPerThread = 25000;
        List<BigInteger> uniques = generateIds(threadCount, maxPerThread, BigInteger.class);

        System.out.println(String.format("Total: %d", uniques.size()));

        Set<BigInteger> uniquesSet = new HashSet<>();
        List<BigInteger> duplicates = uniques.stream()
                .filter(e -> !uniquesSet.add(e))
                .collect(Collectors.toList());

        System.out.println(String.format("Duplicated: %d", duplicates.size()));

        assertTrue(duplicates.isEmpty());
    }

    @Test
    void generateMaskedUniqueId() throws InterruptedException {
        int threadCount = 5;
        int maxPerThread = 25000;
        List<BigInteger> uniques = generateIds(threadCount, maxPerThread, BigInteger.class);
        List<String> uniquesMasked = uniques.stream()
                .map(e -> guidGenerator.encodeID(e))
                .collect(Collectors.toList());

        System.out.println(String.format("Total: %d", uniquesMasked.size()));

        Set<String> uniquesSet = new HashSet<>();
        List<String> duplicates = uniquesMasked.stream()
                .filter(e -> !uniquesSet.add(e))
                .collect(Collectors.toList());

        System.out.println(String.format("Duplicated: %d", duplicates.size()));

        assertTrue(duplicates.isEmpty());
    }

    @Test
    void maskUnmaskId() {
        BigInteger generatedId = guidGenerator.generateID();
        BigInteger unmaskedId;

        String maskedId = guidGenerator.encodeID(generatedId);
        unmaskedId = guidGenerator.decodeAlphaID(maskedId);

        assertEquals(generatedId, unmaskedId);
    }

    @Test
    void generateAlphaId() throws InterruptedException {
        int threadCount = 5;
        int maxPerThread = 25000;
        List<String> uniques = generateIds(threadCount, maxPerThread, String.class);

        System.out.printf("Total: %d%n", uniques.size());

        Set<String> uniquesSet = new HashSet<>();
        List<String> duplicates = uniques.stream()
                .filter(e -> !uniquesSet.add(e))
                .collect(Collectors.toList());

        System.out.printf("Duplicated: %d%n", duplicates.size());

        Assertions.assertTrue(duplicates.isEmpty());
    }

    private <T> List<T> generateIds(int threadCount, int maxPerThread, Class<T> type) throws InterruptedException {
        Thread[] threads = new Thread[threadCount];
        List<T> uniqueIds = Collections.synchronizedList(new ArrayList<>());
        for(int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> {
                for(int j = 0; j < maxPerThread; j++) {
                    uniqueIds.add(type == BigInteger.class ? (T) guidGenerator.generateID(): (T) guidGenerator.generateAlphaID());
                }
            });
        }
        for(int i = 0; i < threadCount; i++) {
            threads[i].start();
        }
        for(int i = 0; i < threadCount; i++) {
            threads[i].join();
        }
        return uniqueIds;
    }
}