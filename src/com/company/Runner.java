package com.company;

public class Runner {
    public static void main(String[] args) {
        int x = 8;
        int y = 18;

        String[][] face = new String[x][y];
        FaceDrawing face1 = new FaceDrawing(face);

        face1.edit(" ", 0,0);
        face1.edit(" ", 0,1);
        face1.edit(" ", 0,2);
        face1.edit(" ", 0,3);
        face1.edit(" ", 0,4);
        face1.edit(" ", 0,5);
        face1.edit(" ", 0,6);
        face1.edit("_", 0,7);
        face1.edit("_", 0,8);
        face1.edit("_", 0,9);
        face1.edit("_", 0,10);
        face1.edit("_", 0,11);
        face1.edit("_", 0,12);
        face1.edit("_", 0,13);
        face1.edit("_", 0,14);
        face1.edit(" ", 0,15);
        face1.edit("", 0,16);
        face1.edit("", 0,17);

        face1.edit(" ", 1,0);
        face1.edit(" ", 1,1);
        face1.edit(" ", 1,2);
        face1.edit(" ", 1,3);
        face1.edit(" ", 1,4);
        face1.edit(" ", 1,5);
        face1.edit("/", 1,6);
        face1.edit(" ", 1,7);
        face1.edit("O", 1,8);
        face1.edit(" ", 1,9);
        face1.edit(" ", 1,10);
        face1.edit(" ", 1,11);
        face1.edit(" ", 1,12);
        face1.edit("O", 1,13);
        face1.edit(" ", 1,14);
        face1.edit("|", 1,15);
        face1.edit("", 1,16);
        face1.edit("", 1,17);

        face1.edit(" ", 2,0);
        face1.edit(" ", 2,1);
        face1.edit(" ", 2,2);
        face1.edit(" ", 2,3);
        face1.edit(" ", 2,4);
        face1.edit("/", 2,5);
        face1.edit(" ", 2,6);
        face1.edit("_", 2,7);
        face1.edit("_", 2,8);
        face1.edit("_", 2,9);
        face1.edit("_", 2,10);
        face1.edit("_", 2,11);
        face1.edit(" ", 2,12);
        face1.edit(" ", 2,13);
        face1.edit("|", 2,14);
        face1.edit("", 2,15);
        face1.edit("", 2,16);
        face1.edit("", 2,17);

        face1.edit(" ", 3,0);
        face1.edit(" ", 3,1);
        face1.edit(" ", 3,2);
        face1.edit(" ", 3,3);
        face1.edit("/", 3,4);
        face1.edit("-", 3,5);
        face1.edit(" ", 3,6);
        face1.edit(" ", 3,7);
        face1.edit(" ", 3,8);
        face1.edit(" ", 3,9);
        face1.edit(" ", 3,10);
        face1.edit(" ", 3,11);
        face1.edit("-", 3,12);
        face1.edit("/", 3,13);
        face1.edit("", 3,14);
        face1.edit("", 3,15);
        face1.edit("", 3,16);
        face1.edit("", 3,17);

        face1.edit(" ", 4,0);
        face1.edit(" ", 4,1);
        face1.edit(" ", 4,2);
        face1.edit("/", 4,3);
        face1.edit(" ", 4,4);
        face1.edit(" ", 4,5);
        face1.edit(" ", 4,6);
        face1.edit(" ", 4,7);
        face1.edit(" ", 4,8);
        face1.edit(" ", 4,9);
        face1.edit(" ", 4,10);
        face1.edit("/", 4,11);
        face1.edit(" ", 4,12);
        face1.edit(" ", 4,13);

        face1.edit(" ", 5,0);
        face1.edit(" ", 5,1);
        face1.edit("/", 5,2);
        face1.edit(" ", 5,3);
        face1.edit(" ", 5,4);
        face1.edit(" ", 5,5);
        face1.edit(" ", 5,6);
        face1.edit(" ", 5,7);
        face1.edit(" ", 5,8);
        face1.edit(" ", 5,9);
        face1.edit(" ", 5,10);
        face1.edit("|", 5,11);
        face1.edit(" ", 5,12);
        face1.edit(" ", 5,13);

        face1.edit(" ", 6,0);
        face1.edit("/", 6,1);
        face1.edit(" ", 6,2);
        face1.edit(" ", 6,3);
        face1.edit(" ", 6,4);
        face1.edit(" ", 6,5);
        face1.edit(" ", 6,6);
        face1.edit(" ", 6,7);
        face1.edit(" ", 6,8);
        face1.edit(" ", 6,9);
        face1.edit(" ", 6,10);
        face1.edit("|", 6,11);
        face1.edit(" ", 6,12);
        face1.edit(" ", 6,13);

        face1.edit("/", 7,0);
        face1.edit(" ", 7,1);
        face1.edit(" ", 7,2);
        face1.edit(" ", 7,3);
        face1.edit(" ", 7,4);
        face1.edit(" ", 7,5);
        face1.edit(" ", 7,6);
        face1.edit(" ", 7,7);
        face1.edit(" ", 7,8);
        face1.edit(" ", 7,9);
        face1.edit(" ", 7,10);
        face1.edit("|", 7,11);
        face1.edit(" ", 7,12);
        face1.edit(" ", 7,13);

        face1.toString();
        face1.fill(":>");

    }
}
