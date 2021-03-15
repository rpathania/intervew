package com.trp.interview;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Largestk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5,6,-2,-5,-6};
		
	//	System.out.println(Arrays.stream(arr).max().orElse(999));
	//	System.out.println(new Largestk().func(arr));
		
	//	System.out.println(Arrays.toString(sumBrute(arr)));
		int a=9;
		int b=2;
		int c=8;
		System.out.println(Arrays.binarySearch(arr, 2));
	//	System.out.println((char) 97);
		String  s = "dog cat cat dog";
		s.lastIndexOf('o');
		String[] x = s.split(" ");
		
	//	System.out.println(wordPattern("abba", s));
	
		
		StringBuilder bx= new StringBuilder();
		
		int largest = (a>b ? a:b) >c ? a: (b>c ? b:c);
		
	//	System.out.println(("1-2-3  4      5    6".replace(" " , "")).replace("-", ""));
		//System.out.println(largest);
		
	//	System.out.println('a'*4);
		
		//System.out.println('a'>'b' ? true: false );
		
//		System.out.println((greatestChar("rishi")));
		
		//System.out.println(greatestChar(arr));
		
	//	int[] n = {1,2,3,4,4,3,2,1};
//		shuffleArr(n,4);
//		int[] indices = {4,5,6,7,0,2,1,3};
//		shuffleString("codeleet",indices);
		
		//char[] a = "3+2*2".toCharArray();
			//for (char e:a)System.out.println(e);
	//	System.out.println(Integer.parseInt("3+2*2"));
	//	int[] aq= {2,3,5,1,3,80,6};
		//System.out.println(kidsWithCandies(a,3));
		
	//	int[] res = sumOddLengthSubarrays(aq);
		
//		Arrays.stream(res).forEach(System.out::println);
		
		//System.out.println(cerateStr("a45b75c82x44v11"));
//sumFibbo(5);
	//	int[] a1= {1,1,2,2,2,3,3,3};
	//	Arrays.stream(frequencySort(a1)).forEach(System.out::println);
		
	//	int[] a2= {3,8,-10,23,19,-4,-14,27,1};
		//int a2[]  = {40,10,20};
		//int[] a3 = {10,30,40,20};
		//System.out.println(minimumAbsDifference(a2));
	//	Arrays.stream(nextGreaterElement(a2,a3)).forEach(System.out::println);
		//String  number = "123 4-56";
		//System.out.println(reformatNumber(number));
		//System.out.println(reformatNumber1(number));
		
	/*	int[] num = {1,2,2,6,6,6,6,7,10};
		int[] num2 = {};
		System.out.println(num.length/4);
		int[][] num2d = {{2,8,7},{7,1,3},{1,9,5}};
		System.out.println(maximumWealth(num2d));
		
		System.out.println(reformatDate("6th Jan 2052"));
	*/	
		String g="abcdefsd";
	    System.out.println(g.contains("acb"));
	    
	    System.out.println(multiply( "498828660196","840477629533"));
	   
	    
		//Arrays.stream(searchRange(num,8)).forEach(System.out::println);
	}

	public int func(int[] arr)
	{
		//List<int[]> list = Arrays.asList(arr);
		
		List<Integer> list = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	//	Collections.sort(list,Collections.reverseOrder());

		list.forEach(a -> list.stream());
		for(int a: list) {
			if (list.contains(-a))
			
				return a;
			
		}
		return 0;
	}
	
	public static int[] sumBrute(int[] arr) {

		for(int i=1;i<arr.length;i++)
		{
			arr[i]+= arr[i-1];
			
		}
		return arr;
	}
	
	public static char greatestChar(String inp) {
		
		char[] a = inp.toCharArray();
		List<Character> list  =new ArrayList<>();
		for (char x: a) list.add(x);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.stream().count());
		return list.get(0);
	//	set = Arrays.stream(inp.toCharArray()).boxed().collect(Collectors.toSet());
		//set.addAll(Arrays.asList(new Integer[] {6,3,4,0,1,3,5,6}));
		
		
		
	}
	
	public static void shuffleArr(int[] nums,int n) {
	
	//	List<Integer> list  = new ArrayList<>();
		
		int []nm = new int[2*n];
		int x=0;
	for(int i=0,j=n;i<n;i++,j++) {
	nm[x++]=nums[i];
	nm[x++]=nums[j];
	}
	
	Arrays.stream(nm).forEach(System.out::println);
///	list.forEach(System.out::println);
	}
	
	public static void shuffleString(String s, int[] indices) {
		
		Map<Integer,Character> map= new HashMap<>();
		String newStr="";
		for (int i=0;i<indices.length;i++) {
			map.put(indices[i], s.charAt(i));
			//newStr+=s.charAt(i);
		}
		
		//System.out.println(map);
		System.out.println(newStr);
		for(char e: map.values())
		{
			newStr+=e;
		}
		
		System.out.println(newStr);
	}
	
public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      
	int greatest=Arrays.stream(candies).max().orElse(-999);
	System.out.println(greatest);
	List<Boolean>list  = new ArrayList<>();
	for (int i: candies) {
		if (i+extraCandies<greatest)
			list.add(false);
		else
			list.add(true);
	}
	return list;    }


public static  int[] sumOddLengthSubarrays(int[] arr) {
    int[] a;
    int[] b;
	a= Arrays.stream(arr).filter(i -> i%2==0).toArray();
	b= Arrays.stream(arr).filter(i -> i%2!=0).toArray();
	
	for(int i=0;i<a.length;i++)
		arr[i] = a[i];
	for(int j=0;j<b.length;j++)
		arr[j+a.length] = b[j];
	
	return arr;
}

public static String cerateStr(String str) {
	
	String s = "";
	int num ;
	int len ;
//	= Character.getNumericValue(str.charAt(i+1));
	long time = System.currentTimeMillis();
	System.out.println("Start time: "+System.currentTimeMillis());
	String ss = "";
	char a;
	StringBuilder st = new StringBuilder();
	for (int i=0;i<str.length();i+=1) {
		a = str.charAt(i);
		do {
			s+=str.charAt(i+1);
			i++;
			
		}
		while (Character.isDigit(str.charAt(i+1)));
		//System.out.println("Number:" + Character.getNumericValue(str.charAt(i+1)));
		for (int j=0;j<Integer.parseInt(s);j++) {
		//	System.out.println("In j for "+ str.charAt(i) +" j= "+j + " j < "+ str.charAt(i+1));
			//st.append(str.charAt(i));
			ss += str.charAt(i);
		}
	}
	System.out.println("Exec time: "+ (time - System.currentTimeMillis()));
	return ss.toString();
	
}

public static void sumFibbo(int n) {
	
	System.out.println(rec(n));
	
}

 public static int rec(int n){
    if (n==0)
    	return 0;
    if(n==1)
        return 1;
    else
        return (rec (n-1) + rec(n-2));
}
 
 public static  int[] frequencySort(int[] nums) {
     
	 Map<Integer,Integer> map = new HashMap<>();
	 
	 int outarr[] = new int[100];
	 int k=0;
	 for (int i=0;i<nums.length;i++)
	 {
		if (map.containsKey(nums[i]))
		{
			map.put(nums[i],map.get(nums[i])+1);
		//	outarr[] = ;
			
			continue;
		}
		
		else
		{
			map.put(nums[i],1);
			outarr[k++]=nums[i];
		}
		
	 }
	 
	 List<Entry<Integer, Integer>> list = map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).collect(Collectors.toList());		
		
	 System.out.println("map= "+ map);
	 
	 System.out.println(list);
	 
	 return outarr;
	 
 }

 public static List<List<Integer>> minimumAbsDifference(int[] arr) {
    
	 Arrays.sort(arr);
	 
	 int min = arr[1] - arr[0];
	 List<List<Integer>> list = new ArrayList<>(); 
	 
	 List <Integer>lt= new ArrayList<>();
	
	 System.out.println("list = "+list);
	 for (int i=0;i<arr.length-1;i+=1) {
		 lt = new ArrayList<>();
		 System.out.println("min = "+ min);
		// System.out.println("i= "+i +" and a[i+1] = " +b + " - "+arr[i+1]);
		 if ((arr[i+1]-arr[i])==min) {
			 lt.add(arr[i]);
			 lt.add(arr[i+1]);
			 list.add(lt);
		 }
		 else if((arr[i+1]-arr[i])<min)
		 {
			 lt.add(arr[i]);
			 lt.add(arr[i+1]);
			 list.clear();
			 list.add(lt);
			 min = arr[i+1]-arr[i];
		 }
		 System.out.println("lt = "+lt);
		 System.out.println("list loop = "+list);
	 }
		 
	 return list;
 }

 public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
 
	 int[] res = new int[nums1.length];
	 int i=0;
	 int n=0;
	 for (int e : nums1) {
	
		// System.out.println("Index = " + (Arrays.stream(nums2).filter(x-> x == e).findFirst().orElse(-1))  ) ;
		 int n2=  (Arrays.stream(nums2).filter(x-> x == e).findFirst().orElse(-1)) -1;
		 
		 System.out.println("Range = " + n2);
		n= IntStream.range(Arrays.stream(nums2).filter(x-> x == e).findFirst().orElse(-1) -1 ,nums2.length).filter(x-> x > e).findFirst().orElse(-1) -1 ;
		System.out.println("n= "+n);
		res[i] = n>=0 ? nums2[n] : -1;
		i++;
	 }
	 
//	 System.out.println(Arrays.stream(nums1).filter(e -> e>3).findFirst().orElse(-1));
	 return res;
	 
 }
  
 public static String reformatNumber(String number) {
	 System.out.println(System.currentTimeMillis());
	number =  (number.replace(" ", "").replace("-", ""));
	int pt=0;
	while(pt< number.length()) {
		
		System.out.println(number.substring(pt, number.length()).length());
		if (number.substring(pt, number.length()).length() >4 ) {
			number = number.substring(0,pt+3) + "-" + number.substring(pt+3, number.length());
			System.out.println("Number>4 = "+ number + "pt = "+pt );
		}
		

		else if (number.substring(pt, number.length()).length() == 4 ) {
			number = number.substring(0,pt+2) + "-" + number.substring(pt+2, number.length());
			System.out.println("Number=4 = "+ number);
			break;
		}
		
		pt+=4;
	}
	System.out.println(System.currentTimeMillis());
	 return number;
     
 }
 
 public static String reformatNumber1(String number) {
	 System.out.println(System.currentTimeMillis());
	 StringBuilder str = new StringBuilder(number.replace(" ", "").replace("-", ""));
	 
	//number =  (number.replace(" ", "").replace("-", ""));
	//str.replace(start, end, str)
	int pt=0;
	while(pt< str.length()) {
		
		System.out.println(number.substring(pt, number.length()).length());
		if (str.substring(pt, str.length()).length() >4 ) {
			str.insert(pt+3, "-");
			//number = number.substring(0,pt+3) + "-" + number.substring(pt+3, number.length());
			System.out.println("str>4 = "+ str + "pt = "+pt );
		}
		

		else if (str.substring(pt, str.length()).length() == 4 ) {
			str.insert(pt+2, "-");
			//number = number.substring(0,pt+2) + "-" + number.substring(pt+2, number.length());
			System.out.println("str=4 = "+ str);
			break;
		}
		
		pt+=4;
	
	}
	System.out.println(System.currentTimeMillis());
	 return str.toString();
     
 }

public static int[] searchRange(int[] nums, int target) {
	 
	 int []x = {-1,-1};
	 int y=-1;
	 for (int i=0;i<nums.length;i++) {
		 
		 if (nums[i] == target) {
			 x[1] = i;
			 y++;
			 
		 }
		
	 }
		/*
		 * x[0]= Arrays.stream(nums) // IntStream .boxed() // Stream<Integer>
		 * .collect(Collectors.toList()) // List<Integer> .indexOf(target);
		 * 
		 * if (x[0]==-1) { x[1] =-1; return x; } int y = (int)
		 * Arrays.stream(nums).filter(i -> i== target).count(); x[1]=x[0]+y-1; // x[0]=
		 * Arrays.stream(nums).filter(i->i==target).findFirst().orElse(-1);
		 */	 x[0]= x[1] ==-1? -1:x[1]-y ;
		 return x;
     
 }

public static int maximumWealth(int[][] accounts) {
 	int max=0;
	int curr=0;
	for (int i=0;i<accounts.length;i++) 
	{
		curr = Arrays.stream(accounts[i])
				.parallel()
				.sum() ;
		max = max> curr ? max:curr ;	
	}
	return max;
}

public static String defangIPaddr(String address) {
 
		/*
		 * StringBuilder str = new StringBuilder(address);
		 * str.insert(str.indexOf(".")-1, "[", offset, len)
		 */
	Date dt=  new Date();
	System.out.println(dt);
	SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-dd");
	System.out.println(sd.format(dt));
	
	return address.replaceAll("[.]", "[.]");
	//return "";
}

public static String reformatDate(String date) {
    
	Map<String , String> map  = new HashMap<>();
	map.put("Jan", "01");
	map.put("Feb", "02");
	map.put("Mar", "03");
	map.put("Apr", "04");
	map.put("May", "05");
	map.put("Jun", "06");
	map.put("Jul", "07");
	map.put("Aug", "08");
	map.put("Sep", "09");
	map.put("Oct", "10");
	map.put("Nov", "11");
	map.put("Dec", "12");
	
	String[] arr = date.split(" ");
	
	String d = arr[0].length()==4 ? arr[0].substring(0,2)  : "0" + arr[0].substring(0,1);
	
	String m  ="-" + map.get(arr[1]) + "-";
	
	return arr[2] + m+d;
//	String dt = date.substring(0, date.indexOf('t')).length() > 1 ? date.substring(0, date.indexOf('t')): "0" + date.substring(0, date.indexOf('t'));
	
	//dt = Character.isDigit(date.substring(0,2).charAt(1)) ? date.substring(0,2) : "0" + date.substring(0,1);
	
//	System.out.println(dt);
	
	//return date.substring(date.length()-4) + "-" + map.get(date.substring(date.length()-8,date.length()-5)) + "-" +dt;
}

public static boolean wordPattern(String pattern, String s) {
    
    Map<String,String> map = new HashMap<>();
    int a = 97;
    StringBuilder b = new StringBuilder();
    String[] arr = s.split(" ");
    
    
    for (int i=0;i<arr.length;i++){
        
        if (map.containsKey(arr[i]))
        b.append(map.get(arr[i]));
        else
        {
            b.append((char) a);
           
            map.put(arr[i],(char) a+"");
             a++;
        }
        
        System.out.println("Strng now =  "+b);
    }
    //System.out.println(b == pattern);
    
    return pattern.equals(b.toString()); 
    
}

public static String multiply(String num1, String num2) {
    BigInteger n1 = new BigInteger(num1);
    BigInteger n2 = new BigInteger(num2);
    
    return n1.multiply(n2) +"";
   // return (Long.parseLong(num1) * Long.parseLong(num2)) + "";
}

}
