package com.kode.concurrent.share;

import java.util.concurrent.CompletableFuture;

/**
 * CompletableFuture
 */
public class CompletableFutureDemo2 implements Runnable {
    CompletableFuture<Integer> re = null;

	public CompletableFutureDemo2(CompletableFuture<Integer> re) {
		this.re = re;
	}

	@Override
	public void run() {
		int myRe = 0;
		try {
			myRe = re.get() * re.get();
		} catch (Exception e) {
		}
		System.out.println(myRe);
	}

	public static void main(String[] args) throws InterruptedException {
		final CompletableFuture<Integer> future = new CompletableFuture<Integer>();
		new Thread(new CompletableFutureDemo2(future)).start();
		// 模拟长时间的计算过程
		Thread.sleep(10000);
		// 告知完成结果
		future.complete(60);
	}
}