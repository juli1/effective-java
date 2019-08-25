package org.gunnm.java.effective;

import java.io.*;

/**
 * Examples of how to use exceptions with Java 8+
 * and avoid to have nested try/catch.
 */
public class TryWithResources {


    /**
     * Read the file but throws exceptions if file is not found or there is problem reading the file.
     * @param path
     * @return
     * @throws IOException
     */
    public static String readFile(String path) {
        StringBuffer sb = new StringBuffer();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String s;

            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
        }
        catch(IOException ex) {
            return null;
        }
        return sb.toString();
    }

    /**
     * Read the file but throws exceptions if file is not found or there is problem reading the file.
     * @param path
     * @return
     * @throws IOException
     */
    public static String readFileThrowException(String path) throws IOException {
        StringBuffer sb = new StringBuffer();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String s;

            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
        }
        return sb.toString();
    }
}
