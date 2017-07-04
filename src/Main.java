import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static int score = 0;

	private static Scanner scan;

	/**
	 * メイン処理
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// スキャナーの初期化
		scan = new Scanner(System.in);

		// 回答結果
		int[] ansers = new int[6];
		ansers[0] = toi1();// 問1の回答結果
		ansers[1] = toi2();// 問2の回答結果
		ansers[2] = toi3();// 問3の回答結果
		ansers[3] = toi4();// 問4の回答結果
		ansers[4] = toi5();// 問5の回答結果
		//ansers[5] = toi6();// 問6の回答結果

		// それぞれの回答結果のまとめ処理
		for(int i = 0;i < ansers.length;i++){
			score += ansers[i];
		}
		System.out.println("正解数は" + score + "です！");
	}

	/**
	 * 問1
	 *
	 * @return
	 */
	public static int toi1() {
		// 回答番号
		int answer = 0;
		// 解答欄
		String[] kaitouList = new String[] { "1:再帰的(リカーシブ)", "2:再使用可能(リユーザブル)", "3:再入可能(リエントラント)","4:再配置可能(リロケータブル)" };

		// 質問内容を表示
		System.out.println("問1");
		System.out.println("処理が終了していないプログラムが，別のプログラムから再度呼び出されることがある。");
        System.out.println("このプログラムが正しく実行されるために備えるべき性質はどれか。");

		// 解答欄を表示
		for (int i = 0; i < kaitouList.length; i++) {
			System.out.println(kaitouList[i]);
		}

		// ユーザーが答えを入力
		System.out.println("回答：");
		int num = scan.nextInt();
		if(num == 3){
			System.out.println("正解です!");
			answer = 1;
		}
		else{
			System.out.println("不正解です！　答えは3:再入可能(リエントラント)");
			 //answer = 0;
		}
		// 回答結果を出力
                return answer;
	}

	/**
	 * 問2
	 *
	 * @return
	 */
	public static int toi2() {
		// 回答番号
		scan  = new Scanner(System.in);
		int answer = 0;
		int ans = 0;
		boolean flag = true;
		final int correct = 4;
		System.out.println("乱数を応用して，求める解や法則性の近似を得る手法はどれか。");
		System.out.print("1:クラスタ分析法,2:指数平滑法 ,3:デルファイ法 ,4:モンテカルロ法  \n 番号を入力してください：");

		while(flag){
			try{
				ans = scan.nextInt();
				flag = false;
				if(ans < 1 || ans > 4){
					System.out.print("１～4のどれかを選んでください\n番号を入力してください：");
					flag = true;
				}
			}catch(InputMismatchException e){
				System.out.print("１～4のどれかを選んでください\n番号を入力してください：");
				flag = true;
			}
		}
		if(ans == correct){
			System.out.println("正解です");
			answer += 1;
		}else{
			System.out.println("不正解です");
			System.out.println("正解は4:モンテカルロ法でした。");
			answer += 0;
		}


		return answer;
	}

	/**
	 * 問3
	 *
	 * @return
	 */
	public static int toi3() {
		// 回答番号
		int answer = 0;

		return answer;
	}

	/**
	 * 問4
	 *
	 * @return
	 */
	public static int toi4() {
		// 回答番号
				int answer = 0;
				// 解答欄
				String[] kaitouList = new String[] { "1:クラスA", "2:クラスB", "3:クラスC", "4:クラスD" };

				// 質問内容を表示
				System.out.println("問4");
				System.out.println("IPv4アドレス 128.0.0.0 を含むアドレスクラスはどれか。");

				// 解答欄を表示
				for (int i = 0; i < kaitouList.length; i++) {
					System.out.println("" + i + ":" + kaitouList[i]);
				}

				// ユーザーが答えを入力
				System.out.println("回答：");
				answer = Integer.valueOf(scan.next());

				// 回答結果を出力
				if(answer == 2){
				System.out.println("正解です");
				return 1;
				}else{
					System.out.println("不正解です");
					return 0;
				}
	}

	/**
	 * 問5
	 *
	 * @return
	 */
	public static int toi5() {
		// 回答番号
		int answer = 0;

		return answer;
	}

	/**
	 * 問6
	 *
	 * @return
	 */
	public static int toi6() {
		// 回答番号
		int answer = 0;

		return answer;
	}
}
