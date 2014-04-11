package com.me.amazon.interviews;

import java.util.ArrayList;
import java.util.Hashtable;

import com.google.common.collect.MinMaxPriorityQueue;

public class AlgTests {

	/**
	 * Given an N arrays of size K each.. each of these K elements in the N arrays are sorted,
	 *  each of these N*K elements are unique. Choose a single element from each of the N arrays, 
	 *  from the chosen subset of N elements. 
	 *  Subtract the minimum and maximum element. 
	 *  Now, this difference should be least possible Minimum.. Hope the problem is clear :) :)

Sample:

N=3, K=3

N=1 : 6, 16, 67
N=2 : 11,17,68
N=3 : 10, 15, 100
here if 16, 17, 15 are chosen.. we get the minimum difference as 17-15=2.
	 */
	
	
	
	
	/**
	 * There is a big file of words which is dynamically changing. 
	 * We are continuously adding some words into it. 
	 * How would you keep track of top 10 trending words at each moment?

I found this question in a blog but I couldn't understand the answer. The answer is: hash table + min-heap
最大堆和最小堆是二叉堆的两种形式。

最大堆：根结点的键值是所有堆结点键值中最大者的堆。
最小堆：根结点的键值是所有堆结点键值中最小者的堆。
	 */
	
	
	
	public Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
	public ArrayList<String> tops = new ArrayList<String>(10);
	public int minCount = 0;
	public int maxCount = 10;
	public MinMaxPriorityQueue queue = MinMaxPriorityQueue.create();
	public void method1(String ele){
		int count = 0;
		if(ht.containsKey(ele))
			ht.put(ele,ht.get(ele) + 1);
		else
			ht.put(ele, 1);
		count = ht.get(ele);
				
		//if count > max ; tops.
		
		
	}
	
	/**
	 * 有一个有序的环形数列，从小到大排好了，比如：4，5，6，1，2，3，从第四个位置开始当成环形看， 就是一个有序数列1，2，3，4，5，6。问题是在这个数列中找到给定的关键字。
	 * @author yilo
	 *
	 */
	
	
	
	/**
	 * 有0，1，2到99这100个正整数，中间丢失了一个，剩余的99个数打乱顺序放在一个数组里， 问怎样找到丢失的那个数
	 * @author yilo
	 *
	 */
	
	
	/**
	 * 算法题：一个股价序列，告诉每个时间点的股价，问什么时候买什么时候卖获利最大？时间复杂度O(n)
	 * @author yilo
	 *
	 */
	
	
}
