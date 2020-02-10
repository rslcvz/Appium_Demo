package tests;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HasDuplicates {
    public static void main(String[] args) {

        String [] str = {"a", "b", "c","c", "d"};

        List inputList = Arrays.asList(str);
        Set inputSet = new HashSet(inputList);

        if(inputSet.size() < inputList.size()){

            System.out.println("This is a duplicate");
        }else{
            System.out.println("Its not duplicate");
        }

    }
}
