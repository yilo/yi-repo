using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace me.interviews
{
    class InterviewQuestions
    {




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

        public void SubtractMinAndMax()
        {
            throw new NotImplementedException();
        }	
	
	
	
	/**
	 * There is a big file of words which is dynamically changing. 
	 * We are continuously adding some words into it. 
	 * How would you keep track of top 10 trending words at each moment?

I found this question in a blog but I couldn't understand the answer. The answer is: hash table + min-heap
最大堆和最小堆是二叉堆的两种形式。

最大堆：根结点的键值是所有堆结点键值中最大者的堆。
最小堆：根结点的键值是所有堆结点键值中最小者的堆。
	 */


        public void GetTop10()
        {
            throw new NotImplementedException();
        }

	
	/**
	 * 有一个有序的环形数列，从小到大排好了，比如：4，5，6，1，2，3，从第四个位置开始当成环形看， 就是一个有序数列1，2，3，4，5，6。问题是在这个数列中找到给定的关键字。
	 * 
	 */
	
	
	
	/**
	 * 有0，1，2到99这100个正整数，中间丢失了一个，剩余的99个数打乱顺序放在一个数组里， 问怎样找到丢失的那个数
	 * 
	 */
	
	
	/**
	 * 算法题：一个股价序列，告诉每个时间点的股价，问什么时候买什么时候卖获利最大？时间复杂度O(n)
	 * 
	 */
	
	/**
	 * Given a log file containing (User_Id, URL, Timestamp) user can navigate page from one to the other. 
	 * Find the three page subset sequence repeated maximum number of times. Records are sorted by Timestamp.
	 * 
	 * 
	 * Create a hashtable 'user_visits' mapping user ID to the last two pages you observed them to visit
Create a hashtable 'visit_count' mapping 3-tuples of pages to frequency counts
For each entry (user, URL) in the log:
If 'user' exists in user_visits with two entries, increment the entry in visit_count corresponding to the 3-tuple of URLs by one
Append 'URL' to the relevant entry in user_visits, removing the oldest entry if necessary.
Sort the visit_count hashtable by value. This is your list of most popular sequences of URLs.
	 */

        public void FindPopularSequenceOfURLs(IEnumerable<LogEntry> entries)
        {
            var user_visits = new List<Tuple<string,string>>();

            var visit_count = new Dictionary<string, int>();
        }

        public class LogEntry
        {
            public int UserId;
            public string Url;
            public DateTime timeStamp;
        }
	
	/**
	 *  design a meeting scheduler, just like in the Microsoft outlook calendar or the gmail calendar.
	 */


    }
}
