package com.hanadumal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* Todo: java.io
 https://www.baeldung.com/java-read-file
 mvn exec:java -Dexec.mainClass='com.hanadumal.Reader'
 */
public class Reader {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        r.ReadWithBufferedReader();
    }

    public void ReadWithBufferedReader() throws IOException {

        String file ="/Users/huobi/Documents/java_template/data/readme.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine;
        while( (currentLine = reader.readLine()) != null) {
            System.out.println(currentLine);
        }
        reader.close();
    }
}