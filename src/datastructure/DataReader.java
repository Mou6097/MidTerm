package datastructure;

import java.io.*;
import java.util.Stack;
import java.util.LinkedList;

public class DataReader {

	public static void main(String[] args) {


		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		FileReader filereader = null;
		BufferedReader bufferreader = null;
		String line;
		String store = "";
		try {

			filereader = new FileReader(textFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			bufferreader = new BufferedReader(filereader);
			while ((line = bufferreader.readLine()) != null) {
				store += line;

			}

		} catch (Exception e) {
			System.out.println("Error unable to read");

		}
		String[] storeArray = store.split(" ");
		Stack<String> stack = new Stack<String>();
		LinkedList<String> list = new LinkedList<String>();
		for (String element : storeArray) {
			list.add(element);
			stack.push(element);

		}
		System.out.println("LinkedList FIFO : ");
		System.out.print (list.remove() + " ");
		while (!list.isEmpty())
			System.out.print (list.remove() + " ");
		System.out.println();
		System.out.println("Stack FILO : ");
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");

		}
		System.out.println();


	}

}
