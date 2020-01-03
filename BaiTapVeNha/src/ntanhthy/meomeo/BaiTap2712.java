package ntanhthy.meomeo;

import java.util.Scanner;
/**
 * Đây là hàm kiểm tra maail có hợp lệ hay hok.
 * Mail hợp lệ là mail
 * 		a. Có dấu @ trong chuỗi và nằm ở vị trí khác 0 và n-1
 * 		b. Có dấu . trong chuỗi, nằm sau dấu @ và sau ít nhất 1 vị trí và khác n-1
 * 		c. Sau @ không là số
 * 		d. Chỉ nhận mail có đuôi là .com hoặc .vn hoặc .com.vn
 * @param mail là chuỗi người dùng nhập vào
 * @return đúng nếu mail hợp lệ và ngược lại.
 * hàm dấu @
 * hàm chuỗi sau @
 * hàm dấu .
 */
public class BaiTap2712 {
	
	static boolean validateMail(String mail)
	{
		if (dauCham(mail)&&dauCong(mail)&&kyTu(mail))
			return true;
		return false;
	}
	
	static boolean dauCham(String mail)
	{
		char dauacong = '@';
		char daucham = '.';
		if(mail.contains("."))
		{
			if((mail.indexOf(daucham)-mail.indexOf(dauacong)<=1)||(mail.indexOf(daucham)==mail.length())||(mail.indexOf(daucham)==0))
				return false;
			else
				return true;
		}
		else
			return false;
	}
	
	static boolean dauCong(String mail)
	{
		char dauacong = '@';
		if(mail.contains("@"))
		{
			if((mail.indexOf(dauacong)==0)||(mail.indexOf(dauacong)==mail.length()))
				return false;
			else
				return true;
		}
		else
			return false;	
	}
	
	static boolean kyTu(String mail)
	{
		if((mail.endsWith(".com"))||(mail.endsWith(".vn"))||(mail.endsWith(".com.vn")))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập mail: ");
		while (true)
		{
			String mail = new Scanner(System.in).nextLine();
			if(validateMail(mail))
			{
				System.out.println("Mail hợp lệ.");
				break;
			}
			else
			{
				System.out.println("Mail không hợp lệ. Nhập lại mail.");
			}
		}
	}

}
