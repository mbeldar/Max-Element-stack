package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner s;
    static ArrayList<Long> max = new ArrayList<Long>();
    static ArrayList<Long> skipped = new ArrayList<Long>();
    public static void main(String[] args) {
	// write your code here

            s = new Scanner(System.in);
            int NumOption = s.nextInt();

            while(NumOption>0){
                NumOption--;

                int op = s.nextInt();
                if(op==1){

                    long num = s.nextLong();

                    if(max.size()==0){
                        max.add(num);

                    }
                    else{
                        if(max.get(0)<=num)
                            max.add(0,num);
                    }
                    op = 4;
                    skipped.add(0,num);
                }
                if(op==2){
                    if(skipped.get(0).equals(max.get(0)))
                    {
                        try {
                            if(!(skipped.get(0).equals(skipped.get(1))))
                                max.remove(0);
                        }
                        catch (Exception r){
                           // System.out.println(r);
                            max.remove(0);
                        }
                    }
                    skipped.remove(0);
                    op = 4;
                }
                if(op==3){
                   // op = 4;
                    System.out.println(max.get(0));
                }
                if(op==9){

                    System.out.println("!!!\n"+skipped);
                    System.out.println(max);

                }

            }
    }
}
