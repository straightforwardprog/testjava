package com.adneom.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        List<List<Integer>> res=  partition(Arrays.asList(new Integer[]{1,2,3,4,5}), 4);
        System.out.println(res);
    }
    
    static List<List<Integer>> partition(List<Integer> li,int taille){
    	final AtomicInteger compteur = new AtomicInteger();

    	final Collection<List<Integer>> result = li.stream()
    	    .collect(Collectors.groupingBy(el -> compteur.getAndIncrement() / taille))
    	    .values();

    	return new ArrayList<List<Integer>>( result);
    }
}
