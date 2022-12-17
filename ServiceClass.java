package com.edu;

import org.springframework.stereotype.Service;

@Service
public  class ServiceClass implements ServiceInterface {

	public void Reverse(String p) {
		StringBuffer n=new StringBuffer(p);
		System.out.println(n.reverse().append("P"));
		
	}

}
