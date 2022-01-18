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
			System.out.println("1. 회원가입");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 로그인");
			System.out.println("4. 로그아웃");
			System.out.println("5. 입금");
			System.out.println("6. 이체");
			System.out.println("7. 잔액조회");

			System.out.println("이용하실 메뉴를 선택하세요");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("사용하실 ID를 입력하세요");
				int ID = sc.nextInt();
				for (int i = 0; i < arrID.length; i++) {
					if (arrID[i] == 0) {
						if (arrID[i] == ID) {
							System.out.println("중복입니다. 다시 실행하세요");
							break;
						}
						arrID[i] = ID;
					}
				}
				System.out.println("사용하실 패스워드를 입력하세요");
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
				System.out.println("회원가입이 완료되었습니다");
				System.out.println("1000원을 부여합니다");
			}
			if (select == 3) {
				System.out.println("ID를 입력하세요");
				int IDdata = sc.nextInt();
				System.out.println("PW를 입력하세요");
				int PWdata = sc.nextInt();

				for (int i = 0; i < arrID.length; i++) {
					if (arrID[i] == IDdata && arrPW[i] == PWdata) {
						System.out.println("정보가 일치합니다");
						System.out.println("로그인이 완료되었습니다");
						arrID[i] = arrID[i + 1];
						count += 1;
						log += 1;
						break;
					} else {
						System.out.println("일치하지않습니다");
						System.out.println("다시 로그인하세요");
						break;
					}
				}
				System.out.println();
			}
			if (select == 2) {
				for (int i = 0; i < 5; i++) {
					if (count == 1) {
						System.out.println("탈퇴할 ID를 입력하세요");
						int delID = sc.nextInt();

						for (int j = 0; j < 5; j++) {
							if (arrID[j] == delID) {
								arrID[j] = 0;
								System.out.println("회원탈퇴가 완료되었습니다");
								break;
							} else {
								System.out.println("ID가 일치하지 않습니다");
								break;
							}
						}
						break;
					} else {
						System.out.println("로그인시에만 이용가능합니다");
						break;
					}

				}
			}
			if (select == 4) {
				System.out.println("로그아웃할 ID를 입력하세요");
				int outID = sc.nextInt();
				for (int i = 0; i < 5; i++) {
					if (arrID[i] == outID) {
						arrID[i] = arrID[i - log];
						System.out.println("로그아웃되었습니다");
						break;
					} else {
						System.out.println("사용자 정보가 일치하지않습니다");
						System.out.println("다시 입력하세요");
						break;
					}

				}
			}
			if (select == 5) {
				if (count >= 1) {
					System.out.println("입금할 돈을 입력하세요");
					int inmoney = sc.nextInt();
						arrMoney[count] += inmoney;
						System.out.println(inmoney + "원이 입금되었습니다");
				}
			}
			if(select == 6)
			{
				if(count>=1)
				{
				System.out.println("이체할 금액을 입력하세요");
				int outmoney = sc.nextInt();
				arrMoney[count] -= outmoney;
				System.out.println(arrMoney[count]+"원이 입금되었습니다.");
				}
				System.out.println();
			}
			if(select == 7)
			{
				System.out.println("잔액조회");
			}

		}
	}
}
