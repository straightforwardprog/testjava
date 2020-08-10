package com.adneom.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

public class AppTest {
   @org.junit.Test
   public void partition(){
    	final int taille=3;
    	List<Integer> li=Arrays.asList(new Integer[]{1,2,3,4,5});
    	List<List<Integer>> result=new ArrayList<List<Integer>>();
    	result.add(Arrays.asList(new Integer[]{1,2,3}));
    	result.add(Arrays.asList(new Integer[]{4,5}));
	    Assert.assertEquals(result, App.partition(li, taille));
   }
}
