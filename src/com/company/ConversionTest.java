package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {
    @Test
    void OneCmEqualsOneCm(){
        double Actualcm=1;
        double expected=1;
        Conversion bar= new Conversion();
        double actual =bar.cmToCm(Actualcm);

        assertEquals(expected,actual);

    }

    @Test
    void oneMeterEqualsHundredCm(){
        double actualM=1;
        double expectedCm=100;
        Conversion bar =new Conversion();
        double actual=bar.mToCm(actualM);
        double expected=bar.cmToCm(100);

        assertEquals(expected,actual);


    }
    @Test
    void HundredCmToKm(){
        double actualCm=100;
        double expectedKm=0.001;
        Conversion bar =new Conversion();

        double actual= bar.cmToCm(100);
        double expected= bar.kmToCm(expectedKm);

        assertEquals(expected,actual);
    }
    @Test
    void oneMeterPlusHundredCentimeterGivesTwoMeter(){
        double actualM=1;
        double actualCm=100;
        double expectedM=2;
        Conversion bar =new Conversion();
        double actual=bar.mToCm(1)+ bar.cmToCm(actualCm);
        double expected= bar.mToCm(2);

        assertEquals(expected,actual);

    }
    @Test
    void oneMeterMinusFiftyCentimeterGivesHalfmeter(){
        double actualM=1;
        double actualCm=50;
        double expectedM=0.5;
        Conversion bar =new Conversion();
        double actual=bar.mToCm(1)- bar.cmToCm(actualCm);
        double expected= bar.mToCm(0.5);

        assertEquals(expected,actual);

    }
    @Test
    void TwoThousandCmMinusOneMeterGivesNineteenHundredCm(){
        double actualM=1;
        double actualCm=2000;
        double expectedCm=1900;
        Conversion bar =new Conversion();
        double actual=bar.cmToCm(2000)-bar.mToCm(1);
        double expected= bar.cmToCm(1900);

        assertEquals(expected,actual);

    }
    

}