package coreJava;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayConcept {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0] = 3;
		arr1[1] = 2;
		arr1[2] = 1;
		
		int[] arr2 = {3,2,1};
		
		int[] arr3 = {5,2,1};
		int[] arr4 = {1,1,2,1};
		int[] arr5 = {5,2,1,1};
		int[] arr6 = {5,2,4,2,9,1};
		int[] arr7, arr8;
		System.out.println("arr1, arr2 Comparing Two Array Using compare Method : "+ Arrays.compare(arr1, arr2));
		System.out.println("arr1, arr3 Comparing Two Array Using compare Method : "+ Arrays.compare(arr1, arr3));
		System.out.println("arr3, arr1 Comparing Two Array Using compare Method : "+ Arrays.compare(arr3, arr1));
		System.out.println("arr3, arr4 Comparing Two Array Using compare Method : "+ Arrays.compare(arr3, arr4));
		System.out.println("arr5, arr3 Comparing Two Array Using compare Method : "+ Arrays.compare(arr3, arr5));
		System.out.println("====================================================================================");
		System.out.println("arr1, arr3 Comparing Two Array Using equals Method : "+ Arrays.equals(arr1, arr2));
		System.out.println("arr1, arr3 Comparing Two Array Using equals Method : "+ Arrays.equals(arr1, arr3));
		System.out.println("arr3, arr5 Comparing Two Array Using equals Method : "+ Arrays.equals(arr3, arr5));
		System.out.println("====================================================================================");
		
		System.out.println("Printing Array As String Using Arrays.toString(arrayObj) : "+ Arrays.toString(arr6));
		System.out.println("Searching Element On Un-Sorted Array Using binarySearch(arr,key) : "+ Arrays.binarySearch(arr6,4));
		Arrays.sort(arr6) ;
		System.out.println("Sorted Array Using sort : "+ Arrays.toString(arr6));
		
		
		Integer[] tempArr = {10,4,7,18,45,20,18};
		System.out.println("Array Before reverse sort : "+ Arrays.toString(tempArr));
		Comparator<Integer> revCom =new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (o1==o2) {
					return 0;
				}else if(o1 > o2) {
					return -1;
				}else {
					return 1;
				}
			}
		};
		Arrays.sort(tempArr,revCom);
		
		System.out.println("Sorted Array Using in reverse sort : "+ Arrays.toString(tempArr));
		System.out.println("Searching Element On Sorted Array Using binarySearch(arr,key) : "+ Arrays.binarySearch(arr6,4));
		System.out.println("====================================================================================");
		
		System.out.println("arr6 Array : "+ Arrays.toString(arr6));
		arr7 = Arrays.copyOf(arr6,3);
		System.out.println("arr6 Array : "+ Arrays.toString(arr6));
		System.out.println("arr7 Array after Arrays.copyOf(arr6,3) : "+ Arrays.toString(arr7));
		System.out.println("====================================================================================");
		arr8 = Arrays.copyOfRange(arr6, 3, 8);
		System.out.println("arr8 Array After Arrays.copyOfRange(arr6, 3, 8) : "+ Arrays.toString(arr8));
		System.out.println("====================================================================================");
		int [] tempArr2 = arr6.clone(); // shallow copy it copies premitive data-type values of the object and It does not create new instances of the objects referenced by the original object; instead, it copies references to those objects. 
		int [] temoArr3 = arr6; //means it copies only stack containts i.e memory address
		int [] temoArr4 = arr6; 
		System.out.println("arr6: "+arr6.toString() + " Containts: " +Arrays.toString(arr6));
		System.out.println("tempArr2: "+tempArr2.toString() + " Containts: " +Arrays.toString(tempArr2));
		System.out.println("temoArr3: "+temoArr3.toString() + " Containts: " +Arrays.toString(temoArr3));
		tempArr2[0] =20;
		temoArr3[0]=10; 
		System.out.println("After Changing Values");
		System.out.println("arr6: "+arr6.toString() + " Containts: " +Arrays.toString(arr6));
		System.out.println("tempArr2: "+tempArr2.toString() + " Containts: " +Arrays.toString(tempArr2));
		System.out.println("temoArr3: "+temoArr3.toString() + " Containts: " +Arrays.toString(temoArr3));
		
		System.out.println("================================Diagonal Matrix====================================================");
		int[][] twoD = new int[5][5];
		for(int i=0; i<twoD.length; i++) {
			for(int j=0; j<twoD[i].length; j++) {
				if(i==j)
					System.out.print(1+" ");
				else
					System.out.print(twoD[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("==================================Reverse Diagonal==================================================");
		for(int i=0; i<twoD.length; i++) {
			for(int j=0; j<twoD[i].length; j++) {
				if(j==(twoD.length-i-1))
					System.out.print(1+" ");
				else
					System.out.print(twoD[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("====================================================================================");
		int[][][] s={	{ {2,3,3},{3,4,5}	},
						{ {5,4,3},{2,7,3}	}	 
					};
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s[i].length; j++) {
				for(int k=0; k<s[i][j].length; k++) {
					System.out.print(s[i][j][k]+" ");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

}
