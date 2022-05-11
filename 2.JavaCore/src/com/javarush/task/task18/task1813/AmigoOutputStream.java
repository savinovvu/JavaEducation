package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream fileOutputStream;


    public AmigoOutputStream(FileOutputStream obj) throws FileNotFoundException {
        super(fileName);
        this.fileOutputStream = obj;
    }

    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }

    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    public void close() throws IOException {
        String a = "JavaRush © All rights reserved.";
        fileOutputStream.flush();
        fileOutputStream.write(a.getBytes());
        fileOutputStream.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
