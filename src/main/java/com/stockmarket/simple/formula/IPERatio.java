package com.stockmarket.simple.formula;

import com.stockmarket.simple.exception.InvalidValueException;

public interface IPERatio {

    Double calculate() throws InvalidValueException;
}
