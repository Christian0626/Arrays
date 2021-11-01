public class Arrays {

    public static void main(String[] args) {

        int rows = 5;
        int columns = 4;


        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;

        for(int i = 0; i < myArray.length; i++)
        {

            System.out.println("Five Element Array");
            System.out.println("--");
            System.out.println("Index " + i + ": " + myArray[i]);
            System.out.println("--");


        }

        int[] myArray2 = new int[10];


        myArray2[0] = myArray[0];
        myArray2[1] = myArray[1];
        myArray2[2] = myArray[2];
        myArray2[3] = myArray[3];
        myArray2[4] = myArray[4];
        myArray2[5] = 6;
        myArray2[6] = 7;
        myArray2[7] = 8;
        myArray2[8] = 9;
        myArray2[9] = 10;



        for(int i = 0; i < myArray2.length; i++)
        {

            System.out.println("Ten element array");
            System.out.println("--");
            System.out.println("Index " + i + ": " + myArray2[i]);
            System.out.println("--");


        }

        double[][] gradesArray = new double[rows][columns];
        gradesArray[0][0] = 77;
        gradesArray[1][0] = 45;
        gradesArray[2][0] = 32;
        gradesArray[3][0] = 23;
        gradesArray[4][0] = 67;





    }




}
