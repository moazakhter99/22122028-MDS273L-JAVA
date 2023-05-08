package Java_Lab.Lab_7;

import java.io.File;
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
                    System.out.println("For Sepal Length");
                    System.out.println("Mean: " + mean(sepalLen));
                    System.out.println("Median: " + median(sepalLen));
                    System.out.println("Mode: " + mode(sepalLen)[0]);
                    System.out.println("Minimum Value: " + min(sepalLen));
                    System.out.println("Maximum value: " + max(sepalLen));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("For Sepal Width");
                    System.out.println("Mean: " + mean(sepalWid));
                    System.out.println("Median: " + median(sepalWid));
                    System.out.println("Mode: " + mode(sepalWid)[0]);
                    System.out.println("Minimum Value: " + min(sepalWid));
                    System.out.println("Maximum value: " + max(sepalWid));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("For Petal Length");
                    System.out.println("Mean: " + mean(petalLen));
                    System.out.println("Median: " + median(petalLen));
                    System.out.println("Mode: " + mode(petalLen)[0]);
                    System.out.println("Minimum Value: " + min(petalLen));
                    System.out.println("Maximum value: " + max(petalLen));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("For Petal Width");
                    System.out.println("Mean: " + mean(petalWid));
                    System.out.println("Median: " + median(petalWid));
                    System.out.println("Mode: " + mode(petalWid)[0]);
                    System.out.println("Minimum Value: " + min(petalWid));
                    System.out.println("Maximum value: " + max(petalWid));
                    System.out.println();
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
            System.out.println("Press 1 for Sepel Length for " + spec);
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
                    System.out.println("For Sepal Length");
                    System.out.println("Mean: " + mean(spec2[0]));
                    System.out.println("Median: " + median(spec2[0]));
                    System.out.println("Mode: " + mode(spec2[0])[0]);
                    System.out.println("Minimum Value: " + min(spec2[0]));
                    System.out.println("Maximum value: " + max(spec2[0]));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("For Sepal Width");
                    System.out.println("Mean: " + mean(spec2[1]));
                    System.out.println("Median: " + median(spec2[1]));
                    System.out.println("Mode: " + mode(spec2[1])[0]);
                    System.out.println("Minimum Value: " + min(spec2[1]));
                    System.out.println("Maximum value: " + max(spec2[1]));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("For Petal Length");
                    System.out.println("Mean: " + mean(spec2[2]));
                    System.out.println("Median: " + median(spec2[2]));
                    System.out.println("Mode: " + mode(spec2[2])[0]);
                    System.out.println("Minimum Value: " + min(spec2[2]));
                    System.out.println("Maximum value: " + max(spec2[2]));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("For Petal Width");
                    System.out.println("Mean: " + mean(spec2[3]));
                    System.out.println("Median: " + median(spec2[3]));
                    System.out.println("Mode: " + mode(spec2[3])[0]);
                    System.out.println("Minimum Value: " + min(spec2[3]));
                    System.out.println("Maximum value: " + max(spec2[3]));
                    System.out.println();
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
                        String[] row = scan.nextLine(). split(",");
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


}
