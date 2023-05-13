package Java_Lab.Lab_7;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Java_lab_7 {

    static Float[] sepalLen = new Float[150];
    static Float[] sepalWid = new Float[150];
    static Float[] petalLen = new Float[150];
    static Float[] petalWid = new Float[150];
    static Float[][] setosa = new Float[4][50];
    static Float[][] versicolor = new Float[4][50];
    static Float[][] virginica = new Float[4][50];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        createArr();
        int choice;
        do {
            System.out.println("Press 1 for Sepel Length");
            System.out.println("Press 2 for Sepel Width");
            System.out.println("Press 3 for Petal Length");
            System.out.println("Press 4 for Petal Width");
            System.out.println("Press 5 for Iris Setosa");
            System.out.println("Press 6 for Iris Versicolor");
            System.out.println("Press 7 for Iris virginica");
            System.out.println("Press 0 to exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    String st = ToString("Sepal Length", sepalLen);
                    System.out.println(st);
                    choose("Sepal Length", sepalLen);
                    break;
                case 2:
                String st1 = ToString("Sepal Width", sepalWid);
                System.out.println(st1);
                choose("Sepal Width", sepalWid);
                    break;
                case 3:
                String st2 = ToString("Petal Length", petalLen);
                System.out.println(st2);
                choose("Petal Length", petalLen);
                    break;
                case 4:
                String st3 = ToString("Petal Width", petalWid);
                System.out.println(st3);
                choose("Petal Width", petalWid);
                    break;
                case 5:
                    selectspec("Setosa");
                    break;
                case 6:
                    selectspec("Versicolor");
                    break;
                case 7:
                    selectspec("virginica");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid Input");

            }

        } while (choice != 0);

    }

    public static void selectspec(String spec) {
        int choice;
        do {
            System.out.println("\nPress 1 for Sepel Length for " + spec);
            System.out.println("Press 2 for Sepel Width for " + spec);
            System.out.println("Press 3 for Petal Length " + spec);
            System.out.println("Press 4 for Petal Width " + spec);
            System.out.println("Press 0 to go back");
            System.out.println("Choice: ");
            choice = Integer.parseInt(scan.nextLine());

            Float[][] spec2 = new Float[4][50];

            if (spec.contains("Setosa")) {
                spec2 = setosa;
            } else if (spec.contains("Versicolor")) {
                spec2 = versicolor;
            } else if (spec.contains("virginica")) {
                spec2 = virginica;
            }

            switch (choice) {
                case 1:
                String st = ToString("Sepal Length of " + spec, spec2[0]);
                System.out.println(st);
                choose("Sepal Length of " + spec, spec2[0]);
                    break;
                case 2:
                String st1 = ToString("Sepal Width of " + spec, spec2[1]);
                System.out.println(st1);
                choose("Sepal Width of " + spec, spec2[1]);
                    break;
                case 3:
                String st2 = ToString("Petal Length of " + spec, spec2[2]);
                System.out.println(st2);
                choose("Petal Length of " + spec, spec2[2]);
                    break;
                case 4:
                String st3 = ToString("Petal Width of " + spec, spec2[3]);
                System.out.println(st3);
                choose("Petal Width of " + spec, spec2[3]);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 0);
    }

    public static void createArr() {

        try {
            String path = "Java_Lab/Lab_7/Iris.csv";
            File file = new File(path);
            if (file.exists()) {
                Scanner scan = new Scanner(file);
                if (file.canRead()) {
                    int i = 0;
                    scan.nextLine();
                    int s = 0;
                    int v = 0;
                    int v1 = 0;
                    while (scan.hasNextLine()) {
                        String[] row = scan.nextLine().split(",");
                        sepalLen[i] = Float.parseFloat(row[1]);
                        sepalWid[i] = Float.parseFloat(row[2]);
                        petalLen[i] = Float.parseFloat(row[3]);
                        petalWid[i] = Float.parseFloat(row[4]);

                        if (row[5].equals("Iris-setosa")) {
                            setosa[0][s] = Float.parseFloat(row[1]);
                            setosa[1][s] = Float.parseFloat(row[2]);
                            setosa[2][s] = Float.parseFloat(row[3]);
                            setosa[3][s] = Float.parseFloat(row[4]);
                            s++;
                        }

                        if (row[5].equals("Iris-versicolor")) {
                            versicolor[0][v] = Float.parseFloat(row[1]);
                            versicolor[1][v] = Float.parseFloat(row[2]);
                            versicolor[2][v] = Float.parseFloat(row[3]);
                            versicolor[3][v] = Float.parseFloat(row[4]);
                            v++;
                        }

                        if (row[5].equals("Iris-virginica")) {
                            virginica[0][v1] = Float.parseFloat(row[1]);
                            virginica[1][v1] = Float.parseFloat(row[2]);
                            virginica[2][v1] = Float.parseFloat(row[3]);
                            virginica[3][v1] = Float.parseFloat(row[4]);
                            v1++;
                        }

                        i++;
                    }
                }
                scan.close();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static Float mean(Float[] arr) {
        Float sum = 0.0f;
        for (Float x : arr) {
            sum += x;
        }

        Float mean = sum / arr.length;

        return mean;
    }

    static Float median(Float[] arr) {
        Arrays.sort(arr);
        Float median = 0.0f;
        int len = arr.length;
        if (len % 2 == 1) {
            median = arr[((len + 1) / 2) - 1];
        } else {
            median = (arr[len / 2 - 1] + arr[len / 2]) / 2;
        }
        return median;
    }

    private static Float intCount(Float[] arr, Float val) {
        Float count = 1.0f;
        for (Float x : arr) {
            if (x.equals(val)) {
                count += 1.0f;
            }
        }
        return count;
    }

    static String[] mode(Float[] intArr) {
        Float val = 0.0f;
        String[] intFreq = new String[2];
        for (Float x : intArr) {
            float con = intCount(intArr, x);
            if (con > val) {
                val = con;

                intFreq[0] = Float.toString(x);

                intFreq[1] = Integer.toString((int) con);

            }

        }
        return intFreq;
    }

    static Float min(Float[] arr) {
        Float min = max(arr);
        for (Float x : arr) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    private static Float max(Float[] arr) {
        Float max = 0.0f;
        for (Float x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    static void createFile(String fileName) {

    }

    protected static String ToString(String info, Float[] Array) {
        String toFile = "\n" + info + "\nMean: " + mean(Array) + "\nMedian: " + median(Array)
        + "\nMode: " + mode(Array)[0] + "\nMinimum Value: " + min(Array) + "\nMaximum value: "
         + max(Array) + "\n";
         return toFile;
    }

    static void writeToFile(String name, String content) {
        /*
         * Create a file with the name_info
         * And wite the info to the file
         */
        String fileName = name + "_info.txt";
        String filepath = "Java_Lab\\Lab_7\\" + fileName;
        try {
            File file = new File(filepath);

            if (file.exists()) {
                System.out.println("File Already exists");
            } else {
                System.out.println("File Does not exist");
                file.createNewFile();
            }
            if (file.canWrite()) {
                FileWriter writeInFile = new FileWriter(file);
                writeInFile.write(content);
                writeInFile.close();
            } else {
                System.out.println("Could not write in file");
            }
        } catch (Exception error) {
            System.out.println(error);
        }

    }

    static void choose(String name, Float[] arr) {
        System.out.println("Do You want to write it to file [y/n]: ");
        String choice = scan.nextLine().toLowerCase();

        switch (choice) {
            case "y":
            String toFile = ToString(name, arr);
            writeToFile(name, toFile);
            break;
            case "n":
            break;
        }
    }

}
