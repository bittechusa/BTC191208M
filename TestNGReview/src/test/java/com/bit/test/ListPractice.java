//package com.bit.test;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.ListIterator;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.TreeMap;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class ListPractice {
//	
//	ArrayList<String> c=new ArrayList<String>();
//	@Test
//	public void test3() {
//		System.out.println("eog".compareTo("cow"));
//		c.add("dog");
//		c.add("chicken");
//		c.add("tiger");
//		c.add("deer");
//		//Collections.sort(c);
//		Collections.sort(c, new A());
//		Iterator<String> it=c.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//	}
//	
//	
//	
//	
//	List<Integer> li=new LinkedList<Integer>();
//	ArrayList<Integer> ar=new ArrayList<Integer>();
//	ArrayList<Integer> ar1=new ArrayList<Integer>(10000);
//	ArrayList<Integer> ar2=new ArrayList<Integer>(li);
//	List<Integer> li1=new LinkedList<Integer>(ar);
//	
//	
//	public void test1() {
//		ar.add(5);
//		ar.add(56);
//		li.addAll(ar);
//		//ar.clear();
//		ar.contains(7);
//		ar.containsAll(li);
//		ar.get(1);
//		ar.hashCode();
//		ar.indexOf(5);
//		ar.isEmpty();
//		Iterator<Integer> it=ar.iterator();
//		while(it.hasNext())
//		{
//			it.next();
//		}
//		for(Integer a:ar)
//		{
//			System.out.println(a);
//		}
//		ar.lastIndexOf(56);
//		ListIterator<Integer> lit=ar.listIterator();
//		ar.remove(1);
//		ar.removeAll(li);
//		Object[] o=ar.toArray();
//		Collections.sort(ar);
//		ar.size();
//		ar.retainAll(li);
//		ar.removeAll(li);
//		List t=test2(ar);
//		Iterator<Integer> it1=t.iterator();
//		 while(it1.hasNext())
//		{
//			it1.next();
//		}
//		
//	}
//	
//	public List test2(ArrayList a) {
//		Iterator<Integer> i=a.iterator();
//		List ar=new ArrayList();
//		while(i.hasNext())
//		{
//			
//			Integer it=i.next();
//			ar.add(it);
//		}
//		return ar;
//	}
//	
//	public List acValue(List<WebElement> eles) {
//		Iterator<WebElement> i=eles.iterator();
//		List<String> ar=new ArrayList();
//		while(i.hasNext())
//		{
//			
//			String it=i.next().getText();
//			ar.add(it);
//		}
//		return ar;
//	}
//	public List exValue(String[] e) {
//		List ae=new ArrayList();
//		for(String a:e)
//		{
//			ae.add(a);
//		}
//		return ae;
//	}
//	public void compare(List a,List e) {
//		Iterator it=a.iterator();
//		Iterator it1=e.iterator();
//		while(it.hasNext()&&it1.hasNext())
//		{
//			Assert.assertTrue(it.next().equals(it1.next()));
//			
//		}
//	}
//	WebDriver dr;
//	@Test
//	public void t() {
//		List a=acValue(dr.findElements(By.id("")));
//		String [] s= {"ab","cd","ef"};
//		List e=exValue(s);
//		compare(a,e);
//		
//		
//		
//	}
//	public void getDuplicateValue(int[] values) {
//		HashSet h=new HashSet();
//		
//		for(int value:values) {
//			boolean r=h.add(value);
//			if(r==false) {
//				System.out.println(value + " is duplicate value");
//			}
//		}
//	}
//	@Test
//	public void mapPractice() {
//		Map<Integer, String> mp = new HashMap<Integer, String>();
//		Map  mp2 = new LinkedHashMap();
//		Map  mp3 = new TreeMap();
//		mp.put(2, "shakid");//insert one key value pairs
//		String o=mp.put(2,"shahid");
//		System.out.println("old v "+o);
//		System.out.println(mp.get(2));
//		mp.put(null, null);
//		mp.put(null, null);//can take one null key
////		mp1.putAll(mp);//insert map class
////		mp.clear();
////		mp.containsKey(3);
////		mp.containsValue("shahid");
////		mp.equals(mp1);
////		mp.get(2);//value against key
////		mp.hashCode();
////		mp.isEmpty();
////		Set s=mp.keySet();//to get all the key
////		mp.remove(2);
////		Collection c=mp.values();//to get all values
////		Set<Entry<Integer,String>> ss=mp.entrySet();//return all key and value
////		mp.size();
////		//mp.replace(key, value);
//		
//		
//	}
//	
//
//}
//
// class A implements Comparator{
//
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		int x=o1.toString().length();
//		int y=o2.toString().length();
////		if(x>y)
////		{
////			return -1;
////		}
////		else if(x<y)
////		{
////			return 1;
////		}else
////		return 0;
//		return o1.toString().compareTo(o2.toString());
//	}
//
//	@Test
//	public void countCharacter() {
//		String s="hellooo world";
//		LinkedHashMap<Character, Integer> mp=new LinkedHashMap<Character, Integer>();
//		char [] c=s.toCharArray();
//		for(Character c1:c) {
//			if(mp.containsKey(c1))
//			{
//				mp.put(c1, mp.get(c1)+1);
//			}else
//			mp.put(c1, 1);
//		}
//		//only key
//		Iterator<Character> i2=mp.keySet().iterator();
//		while(i2.hasNext())
//		{
//		Character c1=i2.next();
//			System.out.println(" key is "+c1);
//		}
//		
//		//only value
//		Iterator<Integer> i3=mp.values().iterator();
//		while(i3.hasNext())
//		{
//		Integer c1=i3.next();
//			System.out.println(" value is "+c1);`	
//		Iterator<Entry<Character, Integer>> it=mp.entrySet().iterator();
//		while(it.hasNext())
//		{
//			Entry<Character, Integer> e=it.next();
//			System.out.println(" key is "+e.getKey()+" value is "+e.getValue());
//		}
//	}
//
//	public HashMap<String, String> mapSelenium(WebDriver dr) {
//		HashMap<String, String> np=new HashMap<String, String>();
//		List<WebElement> user=dr.findElements(By.xpath("//table//tr/td[1]"));
//		List<WebElement> pass=dr.findElements(By.xpath("//table//tr/td[2]"));
//		for(int i=2;i<=user.size();i++)
//		{
//			String userId=dr.findElement(By.xpath("//table//tr["+i+"]/td[1]")).getText();
//			String password=dr.findElement(By.xpath("//table//tr["+i+"]/td[2]")).getText();
//			np.put(userId, password);
//		}
//		return np;
//	}
//	public HashMap<String, String> exValue() {
//		HashMap<String, String> np=new HashMap<String, String>();
//		np.put("name1", "pass1");
//		np.put("name2", "pass2");
//		np.put("name3", "pass3");
//		return np;
//	}
//	public void compare(HashMap<String, String> ac,HashMap<String, String> ex) {
//		Iterator<Entry<String, String>> i=ac.entrySet().iterator();
//		Iterator<Entry<String, String>> i1=ex.entrySet().iterator();
//		while(i.hasNext()&&i1.hasNext()) {
//			Entry<String, String> e=i.next();
//			Entry<String, String> e1=i1.next();
//			if(e.getKey().equals(e1.getKey())&&e.getValue().equals(e1.getValue())) {
//				System.out.println("match");
//			}else
//				System.out.println("not match");
//		}
//	}
//}
//
//
//
//
//
//
//
//
