package day4;

import java.util.Date;

import day10.Member;

public class MemberMain {
	public static void main(String[] args) {
		// 1. ��ü ���� (�� ����)
		// Ŭ������ �ҹ���Ŭ���� = new �����ڸ�();
		Member member = new Member("id", "pw", "������", "010-0000-0001", "C", new Date());
		
		System.out.println( member.toString()  );
		
		// boolean result = member.invalidName();
		// System.out.println(result);
		
		// int result1 = member.invalidPhone();
		// System.out.println(result1);
		
		String ret = member.changePhone();
		System.out.println(ret);
	}
}


		
		// ���� Ŭ���� ������ �ִ� ���� Ȯ��
		System.out.println( member.toString() );
		
		// 2. ���õ� �̸����� ��ȿ���� Ȯ���ϱ�
		boolean result = member .invalidName();
		System.out.println(result);
		
		boolean result1 = member.invalidPhone();
		System.out.println(result1);
		
		
		// 3. 
		Member member = new Member();
		member.setName("ȫ�浿"); //name
		member.setPhone("010-1234-5678"); //phone
		member.setRole("c");//role
		member.setId("Jpark");//id
		
		//member��ü���� ���� ����� �޾Ƽ� �ִ� ����
		boolean nameRet = member.invalidName();//�̸� ���� ��ȿ�� üũ
		boolean phoneRet = member.invalidPhone ();//��ȣ, ����
		boolean roleRet = member.invalidrole ();//��, �Ǹ���
		
		
		
		//member��ü ������� ���� ���� ���
		System.out.println("nameret", "nameret");
	
		
	}

}
