package com.revature.cocktailsort;

public class CocktailSort {
    int i,j,k;
    public void cocktail(int array[]){
        for(i=0;i<array.length;i++);
            for(j=0;j<array.length;j++);
            int current =array[j];
            int next = array[j+1];
            if(current>next){
                array [j]=next;
                array[j+1]=current;
            }
        System.out.println(array[j]);

    }
}
