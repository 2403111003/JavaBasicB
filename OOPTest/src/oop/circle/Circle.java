package oop.circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
	static double radius;
	static final double PI = 3.14;
	public static void main(String[] agrs)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("원의 반지름 : ");
		radius = Double.parseDouble(br.readLine());
		System.out.printf("원의 넓이는 %.2f(cm^2)입니다.", radius*PI*PI);
	}
}
