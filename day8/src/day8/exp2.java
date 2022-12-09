package day8;


import java.io.File;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class exp2

{

static void CountWords(String filename, Map< String, Integer> words) throws FileNotFoundException

{

Scanner file=new Scanner (new File(filename));

while(file.hasNext()){

String word=file.next();

Integer count=words.get(word);

if(count!=null)

count++;

else

count=1;

words.put(word,count);

}

file.close();

}

public static void main(String[] args) throws FileNotFoundException

{

Map<String,Integer> words=new HashMap<String, Integer>();

CountWords("/Users/lokesh.m/eclipse-workspace/day8/src/ex2",words);

System.out.println(words);

}

}