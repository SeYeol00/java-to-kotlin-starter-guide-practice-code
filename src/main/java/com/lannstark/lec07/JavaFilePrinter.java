package com.lannstark.lec07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaFilePrinter {

  public void readFile(String path) throws IOException {
//    File currentFile = new File(".");
//    File file = new File(currentFile.getAbsoluteFile() + "/a.txt");
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      System.out.println(reader.readLine());
    }
  }

}
