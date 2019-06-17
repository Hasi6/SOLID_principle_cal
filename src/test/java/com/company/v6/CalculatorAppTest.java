package com.company.v6;

import com.company.v6.repository.NumberRepository;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculatorAppTest {

    @Test
    public void testCase1(){
//        mock a number repository
        NumberRepository numberRepository = mock(NumberRepository.class);

        List<Double> numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(20.0);
        when(numberRepository.read()).thenReturn(numbers);

        String[] args ={"add"};
        CalculatorApp calculatorApp = new CalculatorApp(numberRepository, args);

        CalculatorApp.run();
        verify(numberRepository.read());
    }

}