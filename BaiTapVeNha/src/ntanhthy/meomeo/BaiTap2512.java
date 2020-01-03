package ntanhthy.meomeo;

import java.util.Scanner;
/*
 * Đây là chương trình xuất số âm trong chuỗi
 */
public class BaiTap2512 {
	static void XuatSoAm(String s)
	{
		String kq = " ";
		char dautru = '-';
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==dautru)
			{
				char ktThuI = s.charAt(i+1);
				if(Character.isDigit(ktThuI))
				{
					kq+="-"+ktThuI;
					for(int j=i+2;j<s.length();j++)
					{
						char ktSauI = s.charAt(j);
						if(Character.isDigit(ktSauI))
						{
							kq+=ktSauI;
						}
						else
							break;
					}
					System.out.println("Số âm trong chuỗi là: "+kq);
					kq ="";
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Mời nhập chuỗi");
		String s = new Scanner(System.in).nextLine();
		XuatSoAm(s);
	}

}
