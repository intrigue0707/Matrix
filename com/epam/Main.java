package com.epam;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {


            Scanner sc = new Scanner(System.in);
        int row1,column1,row2,column2,m3sum = 0;


                System.out.println("Insert number of rows for Matrix1");
                row1 = sc.nextInt();
                System.out.println("Insert number of columns for Matrix1");
                column1= sc.nextInt();
        int [][] Matrix1= new int [row1][column1];
        for(int i=0;i <row1;i++)
        {
            for(int k=0;k <column1;k++)
            {
                System.out.println("Enter the element of "+ i +" row "+ k +" column:");
                Matrix1[i][k] = sc.nextInt();
            }
        }
        System.out.println("Insert number of rows for Matrix2");
        row2=sc.nextInt();
        if (column1==row2){
        System.out.println("Insert number of columns for Matrix2");
        column2=sc.nextInt();
        int [][] Matrix2= new int [row2][column2];
        for(int i=0;i <row2;i++)
        {
            for(int k=0;k <column2;k++)
            {
                System.out.println("Enter the element of "+ i +" row "+ k +" column:");
                Matrix2[i][k] = sc.nextInt();
            }
        }

        int [][] Matrix3= new int [row1][column2];
        for (int i = 0 ; i < row1 ; i++ )
        {
            for (int k = 0 ; k< column1 ; k++ )
            {
                for (int l = 0 ; l <row2 ; l++)
                    m3sum = m3sum + Matrix1[i][l]*Matrix2[l][k];
                Matrix3[i][k] = m3sum;

            }
        }
        System.out.println("Matrix3 is:\n");
        for(int i=0;i < row1;i++)
        {
            for(int k=0;k< column2;k++)
            {
                System.out.print(Matrix3[i][k] + ",");
            }
            System.out.println("\n");
        }
    }else {
            System.out.println("Number of column in Matrix1 should be equal number of rows in Matrix2");
            Main.main(args);
        }


           }}

