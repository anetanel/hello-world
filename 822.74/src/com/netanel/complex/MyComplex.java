package com.netanel.complex;

public class MyComplex {
	private double real;
	private double imag;
	
	//Constructor
	public MyComplex (double real, double imag)
	{
		this.real = real;
		this.imag = imag;
	}
	
	//Getters
	public double getReal()
	{
		return real;
	}
	
	public double getImag()
	{
		return imag;
	}
	
	//Setters
	public void setReal(double real)
	{
		this.real = real;
	}
	
	public void setImag(double imag)
	{
		this.imag = imag;
	}
	
	//toString
	public String toString()
	{
		return "(" + real + " + " + imag + ")";
	}
	
	//Methods
	public void setValue(double real, double imag)
	{
		setReal(real);
		setImag(imag);
	}
	
	public boolean isReal()
	{
		return (imag == 0);
	}
	
	public boolean isImaginary()
	{
		return (imag != 0);
	}
	
	public boolean equals(double real, double imag)
	{
		return (this.real == real && this.imag == imag);
	}
	
	public boolean equals(MyComplex another)
	{
//		return (this.real == another.real && this.imag == another.imag);
//		return (this.real == another.getReal() && this.imag == another.getImag());
		
		return (this.toString() == another.toString());
	}	
	
}
