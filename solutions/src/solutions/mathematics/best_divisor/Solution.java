package solutions.mathematics.best_divisor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		long s=0;long p=0;long t=0;
		long n = in.nextLong();

		for(long i=1;i<=n;i++) {

			if(n%i==0)			{
				long z=i;
				while(z!=0)
				{
					long r=z%10;
					s=s+r;
					z=z/10;
				}
				if(s>t)
				{
					t=s;
					p=i;
				}
				else if(s==t)
				{
					if(i<p)
					{
						p=i;
					}

				}
				s=0;
			}
		}
		System.out.print(p);
		in.close();
	}
}