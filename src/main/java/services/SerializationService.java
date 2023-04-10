package services;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationService {

    Path myPath = Paths.get("NioFile.txt");
    public static void main(String[] args) {
        SerializationService serializationService = new SerializationService();
//        serializationService.writeToAString();
//        serializationService.bufferToAString();
//        serializationService.readFromBuffer();
        serializationService.splitText();
    }

    public void writeToAString() {
        try {
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("hello foo!");
            writer.write("one two three");
            writer.write("four five six");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void bufferToAString() {
        try {
            File file = new File("Bar.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("hello bar! \n");
            writer.write("one two three \n");
            writer.write("four five six");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readFromBuffer() {
        try {
            File file = new File("Bar.txt");
            FileReader fileReader = new FileReader(file);

            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void splitText() {
        String toTest = "What is blue + yellow?/green";
        String[] result = toTest.split("/");
        for (String token: result) {
            System.out.println(token);
        }

        try {
            File file = new File("Split.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String[] bufferedResult = reader.readLine().split("/");
            for (String res : bufferedResult) {
                System.out.println(res);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void nioTwoBufferedWriter() throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(myPath);
    }
}

