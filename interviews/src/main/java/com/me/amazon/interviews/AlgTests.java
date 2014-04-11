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
���Ѻ���С���Ƕ���ѵ�������ʽ��

���ѣ������ļ�ֵ�����жѽ���ֵ������ߵĶѡ�
��С�ѣ������ļ�ֵ�����жѽ���ֵ����С�ߵĶѡ�
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
	 * ��һ������Ļ������У���С�����ź��ˣ����磺4��5��6��1��2��3���ӵ��ĸ�λ�ÿ�ʼ���ɻ��ο��� ����һ����������1��2��3��4��5��6��������������������ҵ������Ĺؼ��֡�
	 * @author yilo
	 *
	 */
	
	
	
	/**
	 * ��0��1��2��99��100�����������м䶪ʧ��һ����ʣ���99��������˳�����һ������� �������ҵ���ʧ���Ǹ���
	 * @author yilo
	 *
	 */
	
	
	/**
	 * �㷨�⣺һ���ɼ����У�����ÿ��ʱ���Ĺɼۣ���ʲôʱ����ʲôʱ�����������ʱ�临�Ӷ�O(n)
	 * @author yilo
	 *
	 */
	
	
}
