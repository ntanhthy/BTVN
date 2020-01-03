package ntanhthy.meomeo;

import java.util.Scanner;

public class BaiTap2512 {

	/**
	 * Nhập vào 1 chuỗi. Xuất các số nguyên âm có trong chuỗi.
	 * 		1) Xét từng kí tự, tới - 
	 * 		2) Xét sau - là số hay ko là số thì xét tiếp
	 * 		3) Xét tiếp cho tới khi ko phải số thì break
	 */
	static void NegativeNumberInStrings(String s)
	{
		for (int i=0; i<s.length();i++)
		{
			String kq = "-";
			char ktThuI = s.charAt(i);
			char ktSauI = s.charAt(i+1);
			if (Character.compare(ktThuI, '-')==0 && Character.isDigit(ktSauI))
			{
				kq += ktSauI;
				for (int j=i+2;j<s.length();j++)
				{
					char ktConLai = s.charAt(j);
					if(Character.isDigit(ktConLai))
					{
						kq+=ktConLai;
					}
					else
					{
						break;
					}
				}
				System.out.println("Số âm trong chuỗi là: "+kq);
			}
			
		}
	}
	
	public static void main(String[] args) {
		String s;
		System.out.println("Nhập chuỗi: ");
		Scanner cin = new Scanner(System.in);
		s = cin.nextLine();
		NegativeNumberInStrings(s);
		

	}

}
