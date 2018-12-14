package com.company;

public class FaceDrawing {
    private String[][] faceFeatures;

    //Constructs an instance of an array
    public FaceDrawing(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }

    //Edits the array by referencing a specific row and column and sets that index equal to a string
    void edit(String replace, int row, int column)
    {
     faceFeatures[row][column] = replace;
    }

    //?????????
    void fill(String str)
    {

    }

    //Logic --> runs through a row adding all the strings together into one
    //Logic --> when the end of a row is reached reset back to beginning of the next row
    public String toString()
    {
        String index = "";
        int x = 0;

        for (int i = 0; i < faceFeatures[0].length; i++)
        {
            index += faceFeatures[x][i];
            if (i+1 == faceFeatures[0].length)
            {
                i = 0;
                x += 1;
            }
        }
        return index;
    }
}
