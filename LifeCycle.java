package com.edu;

public class LifeCycle {
private String mesg;



public LifeCycle() {
super();
System.out.println("Constructor is called");
}

public String getMesg() {
return mesg;
}

public void setMesg(String mesg) {
this.mesg = mesg;
}

public void init() {
System.out.println("Init method is called");
}

public void destroy() {
System.out.println("Destroy method is called");
}

}