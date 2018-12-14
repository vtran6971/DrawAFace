package com.company;

public class Runner {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        String[][] face = new String[x][y];
        FaceDrawing face1 = new FaceDrawing(face);

        System.out.println(face.length);
        System.out.println(face[0].length);


    }
}
