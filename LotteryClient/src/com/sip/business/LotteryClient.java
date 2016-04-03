package com.sip.business;

public class LotteryClient {
	public static void main(String[] args) {
		
		RandomNumberGeneratorService service = new RandomNumberGeneratorService();
		RandomNumberGenerator port = service.getRandomNumberGeneratorPort();
		
		int N = 6;
		for (int i = 0; i < N; i++){
			System.out.println(port.randomNumber(1, 49));
		}
	}
}
