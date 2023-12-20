package org.example;


public class StrSort {
    public String[] a;
    public int len;

    public StrSort() {
        a = new String[2];
        len = 0;//колво элементов в массиве
    }
    private void uvelich() {
        if (len == a.length) {
            String[] nA = new String[a.length + 1];
            for (int i = 0; i < len; i++) {
                nA[i] = a[i];
            }
            a = nA;
        }
    }
    public void add(String b) {
        uvelich();
        int index = len;
        for (int i = 0; i < len; i++) {
            if (b.length() < a[i].length()) {
                index = i;
                break;
            }
        }
        for (int i = len; i > index; i--) {
            a[i] = a[i-1];
        }
        a[index] = b;
        len += 1;
    }

    public String getMax() {
        if (len == 0) {
            throw new RuntimeException("Array is empty");
        }
        else {return a[len - 1];}
    }

    public double getSr() {
        if (len == 0) {
            throw new RuntimeException("Array is empty");
        }
        int allSum = 0;
        for (int i = 0; i < len; i++) {
            allSum += a[i].length();
        }
        return (double) allSum / len;
    }
}