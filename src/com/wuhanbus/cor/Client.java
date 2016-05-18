package com.wuhanbus.cor;

public class Client {
	public static void main(String[] args) {
		Director a = new Director("张三");
		Manager b = new Manager("李四");
		generalManager c = new generalManager("王五");
		a.setNextLeader(b);
		b.setNextLeader(c);
		LeaveRequest request = new LeaveRequest("高琪", 8, "回老家探亲");
		a.Respons(request);
	}
}
