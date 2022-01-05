package org.example;

import org.junit.Assert;
import org.junit.Test;

public class letterGradeTest {
    @Test
    public void TestA(){
        Assert.assertEquals('A', letterGrade.letterGrade(99));
    }
    @Test
    public void TestB(){
        Assert.assertEquals('B', letterGrade.letterGrade(88));
    }
    @Test
    public void TestC(){
        Assert.assertEquals('C', letterGrade.letterGrade(77));
    }
    @Test
    public void TestD(){
        Assert.assertEquals('D', letterGrade.letterGrade(66));
    }
    @Test
    public void TestF(){
        Assert.assertEquals('F', letterGrade.letterGrade(55));
    }
    @Test
    public void TestX(){
        Assert.assertEquals('X', letterGrade.letterGrade(111));
        Assert.assertEquals('X', letterGrade.letterGrade(-1));
    }

}
