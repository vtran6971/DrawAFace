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

    //Fills every index in the array with a single string
    void fill(String str)
    {
        String index = "";
        int x = 0;

        for (int i = 0; i < faceFeatures[0].length; i++) {
            if (faceFeatures[x][i] == null) {
                faceFeatures[x][i] = str;
            }
            faceFeatures[x][i] = str;

            index = index + "" + faceFeatures[x][i];

            if (i+1 == faceFeatures[0].length)
            {
                x += 1;
                i = -1;
                //ACTIVATION of this line and the NEXT will print the array line by line  System.out.println(index);
                //index = "";
            }

            if (x == faceFeatures.length)
            {
                i = faceFeatures[0].length;
            }
        }
    }

    //Logic --> runs through a row checking to see if any index isn't declared and in that case declares it as an empty space
    //Logic --> runs through a row adding all the strings together into one
    //Logic --> when the end of a row is reached reset back to beginning of the next row and prints out the previous line and emptys out the total string
    //Logic --> continues until it reaches the last row and ends the for loop
    public String toString()
    {
        String index = "";
        int x = 0;

        for (int i = 0; i < faceFeatures[0].length; i++)
        {
            if ( faceFeatures[x][i] == null)
            {
                faceFeatures[x][i] = " ";
            }

            index = index + "" + faceFeatures[x][i];

            if (i+1 == faceFeatures[0].length)
            {
                x += 1;
                i = -1;
                System.out.println(index);
                index = "";
            }

            if (x == faceFeatures.length)
            {
                i = faceFeatures[0].length;
            }
        }
        return index;
    }
}
