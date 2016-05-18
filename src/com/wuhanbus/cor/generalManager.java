package com.wuhanbus.cor;

public class generalManager extends Leader{

	public generalManager(String name) {
		super(name);
	}

	@Override
	public void Respons(LeaveRequest request) {
		if (request.getLeaveDays()<30) {
			System.out.println(request.getName()+"因为"+request.getReason()+"请假"+request.getLeaveDays()+"天");
			System.out.println(name+"批准");
		}else if (nextLeader!=null) {
			nextLeader.Respons(request);
		}
		System.out.println("莫非"+request.getName()+"想要辞职");
	}

}
