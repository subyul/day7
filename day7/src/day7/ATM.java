package day7;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int log = -1;
		int MAX = 5;
		int arrID[] = new int[MAX];
		int arrPW[] = new int[MAX];
		int arrMoney[] = new int[MAX];
		while (true) {
			System.out.println("1. ȸ������");
			System.out.println("2. ȸ��Ż��");
			System.out.println("3. �α���");
			System.out.println("4. �α׾ƿ�");
			System.out.println("5. �Ա�");
			System.out.println("6. ��ü");
			System.out.println("7. �ܾ���ȸ");

			System.out.println("�̿��Ͻ� �޴��� �����ϼ���");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("����Ͻ� ID�� �Է��ϼ���");
				int ID = sc.nextInt();
				for (int i = 0; i < arrID.length; i++) {
					if (arrID[i] == 0) {
						if (arrID[i] == ID) {
							System.out.println("�ߺ��Դϴ�. �ٽ� �����ϼ���");
							break;
						}
						arrID[i] = ID;
					}
				}
				System.out.println("����Ͻ� �н����带 �Է��ϼ���");
				int PW = sc.nextInt();
				for (int i = 0; i < arrPW.length; i++) {
					arrPW[i] = PW;
					break;
				}
				for (int i = 0; i < arrID.length; i++) {
					if (arrID[i] != 0 && arrPW[i] != 0) {
						arrMoney[i] = 1000;
					}
				}
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�");
				System.out.println("1000���� �ο��մϴ�");
			}
			if (select == 3) {
				System.out.println("ID�� �Է��ϼ���");
				int IDdata = sc.nextInt();
				System.out.println("PW�� �Է��ϼ���");
				int PWdata = sc.nextInt();

				for (int i = 0; i < arrID.length; i++) {
					if (arrID[i] == IDdata && arrPW[i] == PWdata) {
						System.out.println("������ ��ġ�մϴ�");
						System.out.println("�α����� �Ϸ�Ǿ����ϴ�");
						arrID[i] = arrID[i + 1];
						count += 1;
						log += 1;
						break;
					} else {
						System.out.println("��ġ�����ʽ��ϴ�");
						System.out.println("�ٽ� �α����ϼ���");
						break;
					}
				}
				System.out.println();
			}
			if (select == 2) {
				for (int i = 0; i < 5; i++) {
					if (count == 1) {
						System.out.println("Ż���� ID�� �Է��ϼ���");
						int delID = sc.nextInt();

						for (int j = 0; j < 5; j++) {
							if (arrID[j] == delID) {
								arrID[j] = 0;
								System.out.println("ȸ��Ż�� �Ϸ�Ǿ����ϴ�");
								break;
							} else {
								System.out.println("ID�� ��ġ���� �ʽ��ϴ�");
								break;
							}
						}
						break;
					} else {
						System.out.println("�α��νÿ��� �̿밡���մϴ�");
						break;
					}

				}
			}
			if (select == 4) {
				System.out.println("�α׾ƿ��� ID�� �Է��ϼ���");
				int outID = sc.nextInt();
				for (int i = 0; i < 5; i++) {
					if (arrID[i] == outID) {
						arrID[i] = arrID[i - log];
						System.out.println("�α׾ƿ��Ǿ����ϴ�");
						break;
					} else {
						System.out.println("����� ������ ��ġ�����ʽ��ϴ�");
						System.out.println("�ٽ� �Է��ϼ���");
						break;
					}

				}
			}
			if (select == 5) {
				if (count >= 1) {
					System.out.println("�Ա��� ���� �Է��ϼ���");
					int inmoney = sc.nextInt();
						arrMoney[count] += inmoney;
						System.out.println(inmoney + "���� �ԱݵǾ����ϴ�");
				}
			}
			if(select == 6)
			{
				if(count>=1)
				{
				System.out.println("��ü�� �ݾ��� �Է��ϼ���");
				int outmoney = sc.nextInt();
				arrMoney[count] -= outmoney;
				System.out.println(arrMoney[count]+"���� �ԱݵǾ����ϴ�.");
				}
				System.out.println();
			}
			if(select == 7)
			{
				System.out.println("�ܾ���ȸ");
			}

		}
	}
}
