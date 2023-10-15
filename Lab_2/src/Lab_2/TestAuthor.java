package Lab_2;

import java.lang.*;
import java.util.Scanner;
import Lab_2.Author;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Belov V.H.", "belov@gmail.com",'M');
        Author a2 = new Author("Suvorova V.L.", "suvorova@gmail.com",'W');
        Author a3 = new Author("Lebedev K.A.", "lebedev@gmail.com",'M');
        System.out.print(a1 + "\n");
        System.out.print(a2 + "\n");
        System.out.print(a3 + "\n");
    }
}