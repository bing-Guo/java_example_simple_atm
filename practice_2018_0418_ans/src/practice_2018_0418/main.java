package practice_2018_0418;

/*
 * 1. 請幫自己新增一個編號為"ABC-123"的帳號
 * 2. 存款 2000元
 * 3. 呼叫自己的 balance 變數，看看會發生什麼事情？
 * 4. 呼叫 getBalance() 方法，看看會發生什麼事情？
 * 5. 提款   500元
 * 6. 呼叫 toSting() 方法，看看會發生什麼事情？
 * ----------------------------------------------
 * 7. 幫 Liam 建立一個編號為"RRR-777"，並開戶同時幫他存5000元進帳戶
 * 8. 用 Laim 呼叫 toSting() 方法，看看會發生什麼事情？
 * ----------------------------------------------
 * 9. 如果以上都沒問題，寫一個transfer的方法進行轉帳，參數為account user, amount
 * 10. 讓 Laim 轉帳給自己1000元
 * 11. 呼叫 toSting() 方法，看看有沒有轉帳成功
 * */
public class main {
	public static void main(String[] args) {
		account me = new account("Bing", "ABC-123");
		
		me.deposit(2000);
//		System.out.println(me.balance); // private 不能直接呼叫
		System.out.println(me.getBalance());
		
		me.withdraw(500);
		System.out.println(me.toString());
		
		account laim = new account("Liam", "RRR-777", 5000);
		System.out.println(laim.toString());
		
		laim.transfer(me, 200);
		System.out.println(me.toString());
		System.out.println(laim.toString());
	}
}
