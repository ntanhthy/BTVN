package ntanhthy.meomeo;

import java.util.Scanner;
/**
 * Chương trình kiểm tra mail hợp lệ hay không
 * @author ntanhthy
 *
 */
public class BaiTap2712 {

	static boolean ValidateMail(String mail)
	{
		if (DauACong(mail)&&DauCham(mail)&&KyTu(mail))
			return true;
		else
			return false;
	}
	
	static boolean DauACong (String mail)
	{
		char dauACong = '@';
		if(mail.contains("@"))
		{
			if((mail.indexOf(dauACong)==0)||(mail.indexOf(dauACong)==mail.length()))
				return false;
			else
				return true;
		}
		else
			return false;
	}
	
	static boolean DauCham(String mail)
	{
		char dauCham = '.';
		char dauACong = '@';
		if((mail.indexOf(dauCham)-mail.indexOf(dauACong)<=1)||(mail.indexOf(dauCham)==0)||(mail.indexOf(dauCham)==mail.length()))
			return false;
		else
			return true;
	}
	
	static boolean KyTu(String mail)
	{
		if((mail.endsWith(".com"))||(mail.endsWith(".vn"))||(mail.endsWith(".com.vn")))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Nhập mail:");
		while (true)
		{
			String mail = new Scanner(System.in).nextLine();
			if (ValidateMail(mail))
			{
				System.out.println("Mail hợp lệ.");
				break;
			}
			else
			{
				System.out.println("Mail không hợp lệ. Nhập lại.");
			}
		}
	}
}
