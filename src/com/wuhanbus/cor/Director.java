package com.wuhanbus.cor;

public class Director extends Leader{

	public Director(String name) {
		super(name);
	}

	@Override
	public void Respons(LeaveRequest request) {
		if (request.getLeaveDays()<3) {
			System.out.println(request.getName()+"因为"+request.getReason()+"请假"+request.getLeaveDays()+"天");
			System.out.println(name+"批准");
		}else if (nextLeader!=null) {
			nextLeader.Respons(request);
		}
	}

}
