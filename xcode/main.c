//
//  main.c
//  bma-week-7
//
//  Created by Steven Rock on 10/21/12.
//  Copyright (c) 2012 Steven Rock. All rights reserved.
//
/*
 Output:

Hello, World!
Double from floats = 8.37580204010009765625
Int from floats = 8
Double from divided floats = 0.600107967853546142578125000

 */

#include <stdio.h>

int main(int argc, const char * argv[])
{

    // insert code here...
    printf("Hello, World!\n");


    float a = 3.141279;
    float b = 5.234523456753464353;

    double c = a + b;
    int d = a + b;

    double e = a/b;

    printf("Double from floats = %.20f\n", c);
    printf("Int from floats = %i\n", d);
    printf("Double from divided floats = %.27f\n", e);

    return 0;

}
