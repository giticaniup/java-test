package com.kode.concurrent;

public class TestLiveLock {
    public static void main(String[] args) {
        Person talong = new Person("talong");
        Person sharon = new Person("sharon");
        talong.friend = sharon;
        sharon.friend = talong;
        talong.bow();
        new Thread(sharon).start();
        new Thread(talong).start();
    }
}

class Person implements Runnable {
    Person friend;
    String name;
    boolean bow = false;

    public Person(String name) {
        this.name = name;
    }

    public void bow() {
        System.out.println(name + " bow");
        bow = true;
    }

    public void up() {
        System.out.println(name + " up");
        bow = false;
    }

    public void run() {
        while (friend.bow) {
            this.bow();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.up();
        }
    }
}

