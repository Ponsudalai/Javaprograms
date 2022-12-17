package com.edu;

import org.springframework.stereotype.Service;

@Service
public class PrintServiceImpl implements PrintService{
	public void printUppercase(String s) {
		System.out.println(s.toUpperCase());

		}
		public void printLowercase(String s) {
		System.out.println(s.toLowerCase());

		}
}
