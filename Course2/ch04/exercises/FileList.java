package Course2.ch04.exercises;

import java.io.*;

public class FileList {
    public void list(File f) {
        list(f, 0);
    }

    public void list(File f, int depth) {
        printName(f, depth);
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (File i : files) list(i, depth + 1);
        }
    }

    void printName(File f, int depth) {
        String name = f.getName();
        for (int i = 0; i < depth; i++) System.out.print("   ");
        if (f.isDirectory()) System.out.println("Dir: " + name);
        else System.out.println(name + " " + f.length());
    }

    public static void main(String args[]) {
        FileList L = new FileList();
        File f = new File("./src/Course2/");
        L.list(f);
    }
}