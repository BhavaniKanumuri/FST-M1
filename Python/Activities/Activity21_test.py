import pytest

#Addition Test
def test_addition():
    #Initialization of two numbers
    num1 = 25
    num2 = 25

    #Add them
    sum = num1 + num2
    
    #Assertion
    assert sum == 50

#Subtraction Test
def test_subtraction():
    #Initialization of two numbers
    num1 = 50
    num2 = 25

    #Subtract them
    diff = num1 - num2
    
    #Assertion
    assert diff == 25     

#Multiplication Test
def test_multiplication():
    #Initialization of two numbers
    num1 = 10
    num2 = 10

    #Multiply them
    mul = num1 * num2
    
    #Assertion
    assert mul == 100

#Division Test
def test_division():
    #Initialization of two numbers
    num1 = 25
    num2 = 5

    #Divide them
    quo = num1 / num2
    
    #Assertion
    assert quo == 5

