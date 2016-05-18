package com.wuhanbus.cor;

public class Manager extends Leader{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void Respons(LeaveRequest request) {
		if (request.getLeaveDays()<10) {
			System.out.println(request.getName()+"因为"+request.getReason()+"请假"+request.getLeaveDays()+"天");
			System.out.println(name+"批准");
		}else if (nextLeader!=null) {
			nextLeader.Respons(request);
		}
	}

}
