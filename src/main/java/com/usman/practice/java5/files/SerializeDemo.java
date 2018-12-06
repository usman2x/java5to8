package com.usman.practice.java5.files;

import com.usman.practice.model.Person;
import com.usman.practice.util.ModelUtil;
import com.usman.practice.util.Utils;

import java.io.*;
import java.util.List;

public class SerializeDemo {
    private static String filePath = "D:\\Open Source\\java-learning\\java5to8\\src\\main\\java\\com\\usman\\practice\\model\\persolList.txt";

    public static void main(String[] args) {
        SerializeDemo serializeDemo = new SerializeDemo();
        try {
            serializeDemo.saveIntoFile();
            serializeDemo.readFromFile();
        } catch (IOException e) {
            System.out.println("File Exception " + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    private void readFromFile() throws IOException, ClassNotFoundException {
        File file = new File(filePath);
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Person> personList = (List<Person>) objectInputStream.readObject();
        Utils.showList(personList);
    }

    private void saveIntoFile() throws IOException {
        List<Person> personList = ModelUtil.createPersonListForSerialization();
        File file = new File(filePath);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(personList);
//        personList.forEach(person -> {
//            try {
//                objectOutputStream.writeObject(person);
//            } catch (IOException e) {
//                System.out.println(e);
//            }
//        });
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
