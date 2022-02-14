//package knhel7.jd14.javacore14.task112;

// Task112
// Домашнее задание к занятию 1.1.
// Лямбда-выражения
// Задача 2. Работяга

public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listenerErr = System.out::println;

        Worker worker = new Worker(listener, listenerErr);
        worker.start();
    }

}
