package com.vikki.service;

import org.springframework.stereotype.Service;

@Service
public class OperationService {

	public int add(int a,int b)
	{
	int ADD=a+b;
	return ADD;
	}
	public int sub(int a,int b)
	{
	int SUB=a-b;
	return SUB;
	}
	public int mul(int a,int b)
	{
	int MUL=a*b;
	return MUL;
	}
	public int div(int a,int b)
	{
	int DIV=a/b;
	return DIV;
	}
}
