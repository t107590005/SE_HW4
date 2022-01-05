package org.example;

import org.junit.Assert;
import org.junit.Test;

public class letterGradeTest2 {
    @Test
    public void Test99_101(){
        Assert.assertEquals('X', letterGrade.letterGrade(101));
        Assert.assertEquals('A', letterGrade.letterGrade(100));
        Assert.assertEquals('A', letterGrade.letterGrade(99));
    }
    @Test
    public void Test89_91(){
        Assert.assertEquals('A', letterGrade.letterGrade(91));
        Assert.assertEquals('A', letterGrade.letterGrade(90));
        Assert.assertEquals('B', letterGrade.letterGrade(89));
    }
    @Test
    public void Test79_81(){
        Assert.assertEquals('B', letterGrade.letterGrade(81));
        Assert.assertEquals('B', letterGrade.letterGrade(80));
        Assert.assertEquals('C', letterGrade.letterGrade(79));
    }
    @Test
    public void Test69_71(){
        Assert.assertEquals('C', letterGrade.letterGrade(71));
        Assert.assertEquals('C', letterGrade.letterGrade(70));
        Assert.assertEquals('D', letterGrade.letterGrade(69));
    }
    @Test
    public void Test59_61(){
        Assert.assertEquals('D', letterGrade.letterGrade(61));
        Assert.assertEquals('D', letterGrade.letterGrade(60));
        Assert.assertEquals('F', letterGrade.letterGrade(59));
    }
    @Test
    public void TestNegative1_1(){
        Assert.assertEquals('F', letterGrade.letterGrade(1));
        Assert.assertEquals('F', letterGrade.letterGrade(0));
        Assert.assertEquals('X', letterGrade.letterGrade(-1));
    }

}
