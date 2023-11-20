package com.GradedProject2.SkyscraperConstruction.main;

import java.util.Scanner;

import com.GradedProject2.SkyscraperConstruction.service.ConstructionService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of floors in the building:");
        int numberOfFloors = scanner.nextInt();
        int[] floorSizes = new int[numberOfFloors];

        for (int i = 0; i < numberOfFloors; i++) {
            System.out.println("Enter the floor size for day " + (i + 1) + ":");
            floorSizes[i] = scanner.nextInt();
        }

        ConstructionService.constructBuilding(floorSizes);
        scanner.close();
    }
}
