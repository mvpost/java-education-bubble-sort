package ru.mtsbank.shapes.sort;

public class Main {
    public static void main(String[] args) {

        Sphere[] spheres = new Sphere[5];
        spheres[0] = new Sphere(5, 1);
        spheres[1] = new Sphere(20, 1);
        spheres[2] = new Sphere(15, 2);
        spheres[3] = new Sphere(1, 3);
        spheres[4] = new Sphere(10, 5);

        bubbleSort(spheres);
        for (int i = 0; i < spheres.length; i++) {
            System.out.println(spheres[i].weight + " " + spheres[i].calculateDensity());
        }
    }

    public static void bubbleSort(Sphere[] spheres) {
        int n = spheres.length;
        Sphere temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (spheres[j - 1].calculateDensity() > spheres[j].calculateDensity()) {
                    temp = spheres [j - 1];
                    spheres[j - 1] = spheres[j];
                    spheres[j] = temp;
                }
            }
        }
    }
}