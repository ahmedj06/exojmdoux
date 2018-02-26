package fr.ahmedj.streams;

import java.io.*;

public class Streams {
    File file = new File("C:/Workspace/exojmdoux/tests.txt");

    public void bufferedStreamNew (int b){
            try (BufferedReader buf = new BufferedReader(new FileReader(file), b)) {
                System.out.println(buf.readLine());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
    }

    public void fileStream (){
        int n = 0;
        try (FileInputStream fin = new FileInputStream(file)){
            for( int a = fin.read(); a!=-1; a = fin.read()) {
                System.out.print((char) a);
            }
        } catch (IOException f){
            f.getMessage();
        }
    }
}
